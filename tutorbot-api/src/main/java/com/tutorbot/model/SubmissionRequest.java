package com.tutorbot.model;

public record SubmissionRequest(
    Long studentId,
    Long exerciseId,
    String answer
) {}
