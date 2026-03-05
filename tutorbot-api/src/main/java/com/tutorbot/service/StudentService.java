package com.tutorbot.service;

import com.tutorbot.model.AddStudentDto;
import com.tutorbot.model.Student;
import com.tutorbot.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class StudentService {
    private final IStudentRepository studentRepository;

    @Autowired
    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Async
    public CompletableFuture<List<Student>> getAllStudents() {
        return CompletableFuture.completedFuture(studentRepository.findAll());
    }

    @Async
    public CompletableFuture<Student> getStudentById(long id) {
        return CompletableFuture.completedFuture(studentRepository.findById(id));
    }
    @Async
    public CompletableFuture<Student> saveStudent(AddStudentDto student) {
        return CompletableFuture.completedFuture(studentRepository.save(student));
    }

}
