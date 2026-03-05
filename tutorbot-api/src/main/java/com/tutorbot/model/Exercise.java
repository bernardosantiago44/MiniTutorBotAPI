package com.tutorbot.model;

public class Exercise {
    public long id;
    public String topic;
    public String question;
    public String difficulty;

    public Exercise(long id,
                    String topic,
                    String question,
                    String difficulty) {
        this.id = id;
        this.topic = topic;
        this.question = question;
        this.difficulty = difficulty;
    }

    public long getId() { return id; }
    public String getTopic() { return topic; }
    public String getQuestion() { return question; }
    public String getDifficulty() { return difficulty; }

    public void setId(long id) { this.id = id; }
    public void setTopic(String topic) { this.topic = topic; }
    public void setQuestion(String question) { this.question = question; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }
}
