package com.example.jed.triviaproject;

/**
 * Created by D.J on 2015-02-18.
 */

public class Trivia {
    private String category, property, question,
            _a1, _a2, _a3, _ca; //correct answer
    private String[] answers;

    public Trivia(String c, String p, String q,
                  String a1, String a2, String a3, String ca) {
        category = c;
        property = p;
        question = q;
        _a1 = a1;
        _a2 = a2;
        _a3 = a3;
        _ca = ca;

        answers = new String[4];
        answers[0] = _a1;
        answers[1] = _a2;
        answers[2] = _a3;
        answers[3] = _ca;
    }
    public String getProperty() {
        return category + "\n" + property;
    }
    public String getQuestion() {
        return question;
    }
    public String getCA(){ return _ca; }
    public String getAnswers(int index) { return answers[index]; }
}
