package com.tutorbot.model;

public abstract class Exercise {
    protected String topic;
    protected String question;
    protected String correctAnswer;
    protected String difficulty;

    public Exercise(String topic,
                    String question,
                    String answer,
                    String difficulty) {
        this.topic = topic;
        this.question = question;
        this.correctAnswer = answer;
        this.difficulty = difficulty;
    }
    public String getTopic() { return topic; }
    public String getQuestion() { return question; }
    public String getCorrectAnswer() { return correctAnswer; }
    public String getDifficulty() { return difficulty; }

    public void setTopic(String topic) { this.topic = topic; }
    public void setQuestion(String question) { this.question = question; }
    public void setAnswer(String answer) { this.correctAnswer = answer; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }
}
