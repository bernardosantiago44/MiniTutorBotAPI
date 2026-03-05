package com.tutorbot.service;

import com.tutorbot.model.Feedback;
import com.tutorbot.model.GetExerciseDto;
import com.tutorbot.model.SubmissionRequest;
import com.tutorbot.repository.IExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class ExerciseService {
    private final IExerciseRepository exerciseRepository;

    @Autowired
    public ExerciseService(IExerciseRepository repository) { this.exerciseRepository = repository; }

    @Async
    public CompletableFuture<List<GetExerciseDto>> getAllExercises() {
        return CompletableFuture.completedFuture(exerciseRepository.getAllExercises());
    }

    @Async
    public CompletableFuture<List<GetExerciseDto>> getExercisesByDifficulty(String difficulty) {
        if (difficulty == null || difficulty.isBlank()) throw new InvalidParameterException();

        return CompletableFuture.completedFuture(
                exerciseRepository.getExercisesByDifficulty(difficulty)
        );
    }

    public CompletableFuture<Feedback> checkAnswer(SubmissionRequest request) throws Exception {
        return CompletableFuture.completedFuture(
                exerciseRepository.submitAnswer(request.studentId(), request.exerciseId(), request.answer())
        );
    }
}
