package com.quiz.model;

public class QuizMetaData {
    private int id;
    private String option;
    private boolean correct;
    private QuizQuestion quizQuestion;

    public QuizMetaData() {
    }

    public QuizMetaData(int id, String option, boolean correct, QuizQuestion quizQuestion) {
        this.id = id;
        this.option = option;
        this.correct = correct;
        this.quizQuestion = quizQuestion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public QuizQuestion getQuizQuestion() {
        return quizQuestion;
    }

    public void setQuizQuestion(QuizQuestion quizQuestion) {
        this.quizQuestion = quizQuestion;
    }
}
