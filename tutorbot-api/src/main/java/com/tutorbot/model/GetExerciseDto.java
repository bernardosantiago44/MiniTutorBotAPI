package com.tutorbot.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetExerciseDto extends Exercise {
    private long id;
    
    public GetExerciseDto(long id, String topic, String question, String answer, String difficulty) {
        super(topic, question, answer, difficulty);
        this.id = id;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public static List<GetExerciseDto> buildMockData() {
        List<GetExerciseDto> exercises = new ArrayList<>();

        // Adding 20 mock exercises
        exercises.add(new GetExerciseDto(1, "Java", "What is the difference between checked and unchecked exceptions?", "Checked exceptions are checked at compile-time, while unchecked are checked at runtime.", "Intermediate"));
        exercises.add(new GetExerciseDto(2, "SQL", "Write a query to find the second highest salary in the Employees table.", "SELECT MAX(salary) FROM Employees WHERE salary < (SELECT MAX(salary) FROM Employees);", "Advanced"));
        exercises.add(new GetExerciseDto(3, "Physics", "What is the speed of light in a vacuum?", "Approximately 299,792,458 meters per second.", "Easy"));
        exercises.add(new GetExerciseDto(4, "Algorithms", "Implement a Binary Search algorithm.", "Divide the sorted array in half repeatedly until the target is found.", "Intermediate"));
        exercises.add(new GetExerciseDto(5, "React", "What is the purpose of the useEffect hook?", "To perform side effects in function components (data fetching, subscriptions, etc).", "Intermediate"));
        exercises.add(new GetExerciseDto(6, "History", "In what year did the French Revolution begin?", "1789", "Easy"));
        exercises.add(new GetExerciseDto(7, "Python", "Explain the difference between a list and a tuple.", "Lists are mutable (changeable) while tuples are immutable.", "Easy"));
        exercises.add(new GetExerciseDto(8, "Databases", "Define the four properties of ACID.", "Atomicity, Consistency, Isolation, and Durability.", "Advanced"));
        exercises.add(new GetExerciseDto(9, "Geometry", "Calculate the area of a circle with a radius of 5 units.", "Area = π * r² ≈ 78.54 square units.", "Easy"));
        exercises.add(new GetExerciseDto(10, "Networking", "What is the difference between TCP and UDP?", "TCP is connection-oriented and reliable; UDP is connectionless and faster.", "Intermediate"));
        exercises.add(new GetExerciseDto(11, "Chemistry", "What is the atomic number of Gold?", "79", "Easy"));
        exercises.add(new GetExerciseDto(12, "Cybersecurity", "Describe a 'Man-in-the-Middle' (MitM) attack.", "An attacker secretly relays and possibly alters communication between two parties.", "Advanced"));
        exercises.add(new GetExerciseDto(13, "Design Patterns", "Explain the Singleton pattern and its thread-safety implications.", "Ensures a class has only one instance; requires synchronization to prevent multiple instances in multithreading.", "Advanced"));
        exercises.add(new GetExerciseDto(14, "Biology", "What is the primary function of the Mitochondria?", "To produce energy in the form of ATP through cellular respiration.", "Easy"));
        exercises.add(new GetExerciseDto(15, "Cloud", "What are the three main service models of Cloud Computing?", "IaaS (Infrastructure), PaaS (Platform), and SaaS (Software).", "Intermediate"));
        exercises.add(new GetExerciseDto(16, "Git", "How do you resolve a merge conflict in a collaborative repository?", "Manually edit the files to choose which changes to keep, then git add and commit.", "Intermediate"));
        exercises.add(new GetExerciseDto(17, "Statistics", "What is the 'p-value' in hypothesis testing?", "The probability that the observed results occurred by random chance.", "Advanced"));
        exercises.add(new GetExerciseDto(18, "CSS", "Explain the difference between flexbox and grid.", "Flexbox is 1-dimensional (rows OR columns); Grid is 2-dimensional (rows AND columns).", "Intermediate"));
        exercises.add(new GetExerciseDto(19, "Logic", "If P is true and Q is false, what is the value of (P AND Q)?", "False", "Easy"));
        exercises.add(new GetExerciseDto(20, "DevOps", "What is the concept of Infrastructure as Code (IaC)?", "Managing and provisioning infrastructure through machine-readable definition files rather than physical hardware configuration.", "Advanced"));

        return exercises;
    }
}
