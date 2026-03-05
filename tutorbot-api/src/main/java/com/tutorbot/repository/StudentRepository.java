package com.tutorbot.repository;

import com.tutorbot.model.AddStudentDto;
import com.tutorbot.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {
    private List<Student> students = new ArrayList<>();
    private long currentIdCounter;

    public StudentRepository() {
        this.students = Student.buildMockData();
        this.currentIdCounter = 100 + this.students.size();
    }

    @Override
    public List<Student> findAll() {
        return this.students;
    }

    @Override
    public Student findById(long id) {
        if (students.isEmpty()) { return null; }
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student save(AddStudentDto student) {
        if (student.isInvalid()) { throw new IllegalArgumentException("Invalid student"); }
        Student studentToSave = new Student(++currentIdCounter, student.getName(), student.getEmail(), student.getLevel());
        this.students.add(studentToSave);
        return studentToSave;
    }
}
