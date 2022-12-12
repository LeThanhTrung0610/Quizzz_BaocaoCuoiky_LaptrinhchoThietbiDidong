package com.example.quizzz;

public class Questions {
    private final String questionText;
    private final boolean answer;


    public Questions(String questionText, boolean answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean isAnswer() {
        return answer;
    }
}

