package com.tutorbot.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Student extends AddStudentDto {
    private long id;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public Student(long id, String name, String email, String level) {
        super(name, email, level);
        this.id = id;
    }

    public static List<Student> buildMockData() {
        return new ArrayList<>(Arrays.asList(
                new Student(101L, "Alice Johnson", "alice.j@example.com", "beginner"),
                new Student(102L, "Bob Smith", "bob.s@example.com", "intermediate"),
                new Student(103L, "Charlie Davis", "charlie.d@example.com", "expert"),
                new Student(104L, "Diana Prince", "diana.p@example.com", "beginner"),
                new Student(105L, "Ethan Hunt", "ethan.h@example.com", "intermediate"),
                new Student(106L, "Fiona Gallagher", "fiona.g@example.com", "expert"),
                new Student(107L, "George Miller", "george.m@example.com", "beginner"),
                new Student(108L, "Hannah Abbott", "hannah.a@example.com", "intermediate"),
                new Student(109L, "Ian Wright", "ian.w@example.com", "expert"),
                new Student(110L, "Jenny Kim", "jenny.k@example.com", "beginner"),
                new Student(111L, "Kevin Hart", "kevin.h@example.com", "intermediate"),
                new Student(112L, "Laura Palmer", "laura.p@example.com", "expert"),
                new Student(113L, "Mike Ross", "mike.r@example.com", "beginner"),
                new Student(114L, "Nina Williams", "nina.w@example.com", "intermediate"),
                new Student(115L, "Oscar Isaac", "oscar.i@example.com", "expert")
        ));
    }

    @Override
    public boolean isInvalid() {
        if (name == null || email == null || level == null) { return true;}
        return id <= 0 || name.isBlank() || email.isBlank() || level.isBlank();
    }
}