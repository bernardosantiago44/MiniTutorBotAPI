package com.tutorbot.model;

public class AddStudentDto {
    protected String name;
    protected String email;
    protected String level;

    public AddStudentDto(String name, String email, String level) {
        this.name = name;
        this.email = email;
        this.level = level;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getLevel() { return level; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setLevel(String level) { this.level = level; }

    public boolean isInvalid() {
        if (name == null || email == null || level == null) { return true; }
        return name.isBlank() || email.isBlank() || level.isBlank();
    }
}
