package com.tutorbot.controller;

import com.tutorbot.model.AddStudentDto;
import com.tutorbot.model.Student;
import com.tutorbot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/")
@EnableAsync
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Async
    @GetMapping("/students")
    public CompletableFuture<ResponseEntity<List<Student>>> findAllAsync() {
        return studentService.getAllStudents()
                .thenApply(student -> ResponseEntity.ok().body(student));
    }

    @Async
    @GetMapping("/students/{id}")
    public CompletableFuture<ResponseEntity<Student>> findByIdAsync(@PathVariable long id) {
        return studentService.getStudentById(id)
                .thenApply(student -> {
                    if (student == null) { return ResponseEntity.notFound().build(); }
                    return ResponseEntity.ok().body(student);
                });
    }

    @Async
    @PostMapping("students")
    public CompletableFuture<ResponseEntity<Student>> createAsync(@RequestBody AddStudentDto student) {
        return studentService.saveStudent(student)
                .thenApply(student1 -> {
                    if (student1 == null || student1.isInvalid()) {
                        return ResponseEntity.badRequest().<Student>build();
                    }
                    return ResponseEntity.ok(student1);
                })
                .exceptionally(ex -> {
                    return ResponseEntity.badRequest().<Student>build();
                });
    }
}
