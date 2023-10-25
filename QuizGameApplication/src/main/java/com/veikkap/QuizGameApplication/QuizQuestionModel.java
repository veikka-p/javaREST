package com.veikkap.QuizGameApplication;

public class QuizQuestionModel {
    private String question;
    private String answer;

    public QuizQuestionModel(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
