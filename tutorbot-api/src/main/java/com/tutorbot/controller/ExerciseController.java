package com.tutorbot.controller;

import com.tutorbot.model.Feedback;
import com.tutorbot.model.GetExerciseDto;
import com.tutorbot.model.Student;
import com.tutorbot.model.SubmissionRequest;
import com.tutorbot.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/")
@EnableAsync
public class ExerciseController {
    private final ExerciseService exerciseService;

    @Autowired
    public ExerciseController(ExerciseService service) { this.exerciseService = service; }

    @Async
    @GetMapping("/exercises")
    public CompletableFuture<ResponseEntity<List<GetExerciseDto>>> findAllAsync(@RequestParam(required = false) String difficulty) {
        if (difficulty == null || difficulty.isBlank())
            return exerciseService.getAllExercises()
                .thenApply(exercises -> ResponseEntity.ok().body(exercises));

        return exerciseService.getExercisesByDifficulty(difficulty)
                .thenApply(ResponseEntity::ok)
                .exceptionally(ex -> {
                    return ResponseEntity.badRequest().build();
                });
    }

    @Async
    @PostMapping("/exercises/submit")
    public CompletableFuture<ResponseEntity<Feedback>> submitAnswer(@RequestBody SubmissionRequest request) throws Exception {
        return exerciseService.checkAnswer(request)
                .thenApply(feedback -> {
                    if (feedback == null) {
                        // Use <Feedback> here instead of <Student>
                        return ResponseEntity.badRequest().<Feedback>build();
                    }
                    return ResponseEntity.ok(feedback);
                })
                .exceptionally(ex -> {
                    // Use <Feedback> here as well
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).<Feedback>build();
                });
    }
}
