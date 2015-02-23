package com.example.jed.triviaproject;

/**
 * Created by D.J on 2015-02-18.
 */

public class Trivia {
    private String category, property, question, _ca;
    private String[] answers;

    public Trivia(String c, String p,
                  String q, String a1, String a2, String a3, String ca) {
        category = c;
        property = p;
        question = q;
        _ca = ca;

        answers = new String[4];
        answers[0] = a1;
        answers[1] = a2;
        answers[2] = a3;
        answers[3] = _ca;
    }

    public String getProperty() {
        return category + "\n" + property;
    }
    public String getQuestion() {
        return question;
    }
    public String getCA_4(){ return _ca; }
    public String getAnswers(int index) { return answers[index]; }
}
