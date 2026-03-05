package com.tutorbot.repository;

import com.tutorbot.model.Feedback;
import com.tutorbot.model.GetExerciseDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExerciseRepository implements IExerciseRepository {
    private final List<GetExerciseDto> exercises = GetExerciseDto.buildMockData();

    public ExerciseRepository() {}

    @Override
    public List<GetExerciseDto> getAllExercises() {
        return exercises;
    }

    @Override
    public List<GetExerciseDto> getExercisesByDifficulty(String difficulty) {
        return exercises
                .stream()
                .filter(exercise -> exercise.getDifficulty().equals(difficulty))
                .toList();
    }

    @Override
    public Feedback submitAnswer(Long studentId, Long exerciseId, String answer) {
        if (studentId == null || exerciseId == null || answer == null) throw new IllegalArgumentException();
        GetExerciseDto foundExercise = null;
        for (var exercise: exercises) {
            if (exercise.getId() == exerciseId) foundExercise = exercise;
        }
        if (foundExercise == null) return null;

        if (foundExercise.getCorrectAnswer().trim().equals(answer.trim())) return new Feedback(studentId, exerciseId, answer, 100, "Correct answer", true);
        return new Feedback(studentId, exerciseId, answer, 40, "Better luck next time!", false);
    }
}
