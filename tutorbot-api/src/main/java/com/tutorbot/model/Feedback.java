package com.tutorbot.model;

/*
* {
  "studentId": 1,
  "exerciseId": 101,
  "answer": "@RestController",
  "score": 95,
  "message": "Excellent! That is correct.",
  "correct": true
}*/
public class Feedback {
    private long studentId;
    private long exerciseId;
    private String answer;
    private float score;
    private String message;
    private boolean correct;

    public Feedback(long studentId,
                    long exerciseId,
                    String answer,
                    float score,
                    String message,
                    boolean correct) {
        this.studentId = studentId;
        this.exerciseId = exerciseId;
        this.answer = answer;
        this.score = score;
        this.message = message;
        this.correct = correct;
    }

    public long getStudentId() { return studentId; }
    public long getExerciseId() { return exerciseId; }
    public String getAnswer() { return answer; }
    public float getScore() { return score; }
    public String getMessage() { return message; }
    public boolean isCorrect() { return correct; }

    public void setStudentId(long studentId) { this.studentId = studentId; }
    public void setExerciseId(long exerciseId) { this.exerciseId = exerciseId; }
    public void setAnswer(String answer) { this.answer = answer; }
    public void setScore(float score) { this.score = score; }
    public void setMessage(String message) { this.message = message; }
    public void setCorrect(boolean correct) { this.correct = correct; }
}
