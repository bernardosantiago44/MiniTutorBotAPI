package com.tutorbot.repository;

import com.tutorbot.model.AddStudentDto;
import com.tutorbot.model.Student;
import java.util.List;

public interface IStudentRepository {
    public List<Student> findAll();
    public Student findById(long id);
    public Student save(AddStudentDto student);
}
