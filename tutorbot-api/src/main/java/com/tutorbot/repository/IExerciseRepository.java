package com.tutorbot.repository;

import com.tutorbot.model.Feedback;
import com.tutorbot.model.GetExerciseDto;

import java.util.List;

public interface IExerciseRepository {

    public List<GetExerciseDto> getAllExercises();
    public List<GetExerciseDto> getExercisesByDifficulty(String difficulty);
    public Feedback submitAnswer(Long studentId, Long exerciseId, String answer) throws Exception;
}