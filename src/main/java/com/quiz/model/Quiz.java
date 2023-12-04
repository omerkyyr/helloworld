package com.quiz.model;

import java.time.LocalDate;
import java.util.List;

public class Quiz {
    private String uuid;
    private String name;
    private String description;
    private String instructions;
    private int duration;
    private int attempts;
    private String difficulty;
    private boolean status;
    private LocalDate createdAt;
    private List<QuizQuestion> quizQuestions;
    private Result result;

    // Constructors

    public Quiz() {
        // Default constructor
    }

    // Constructor with parameters
    public Quiz(String uuid, String name, String description, String instructions, int duration,
                int attempts, String difficulty, boolean status, LocalDate createdAt,
                List<QuizQuestion> quizQuestions, List<QuizMetaData> quizMetaDatas, Result result) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.instructions = instructions;
        this.duration = duration;
        this.attempts = attempts;
        this.difficulty = difficulty;
        this.status = status;
        this.createdAt = createdAt;
        this.quizQuestions = quizQuestions;
        this.result = result;
    }

    // Getter and setter methods

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public List<QuizQuestion> getQuizQuestions() {
        return quizQuestions;
    }

    public void setQuizQuestions(List<QuizQuestion> quizQuestions) {
        this.quizQuestions = quizQuestions;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}

