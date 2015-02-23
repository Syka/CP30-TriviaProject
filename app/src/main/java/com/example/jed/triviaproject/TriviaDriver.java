package com.example.jed.triviaproject;

import java.util.ArrayList;

/**
 * Created by D.J on 2015-02-23.
 */
public class TriviaDriver {
    private ArrayList<Trivia> trivia;
    public TriviaDriver() {
        trivia = new ArrayList<>();
        //trivia.add(new Trivia(CATEGORY, PROPERTY,
        //      QUESTION,
        //      WRONG ANSWER 1, WRONG ANSWER 2, WRONG ANSWER 3, CORRECT ANSWER);

        //MOVIE TRIVIA
        trivia.add(new Trivia("Movies", "Star Wars",
                "What is the probability of successfully navigating an asteroid field?",
                "1,547:1", "1,245,677:1", "10:1", "3,720:1"));
        trivia.add(new Trivia("Movies", "Marvel",
                "What does Rocket Raccoon require to escape the prison in Guardians of the Galaxy? ",
                "An Infinity Stone", "A keycard", "Stan Lee", "A prosthetic leg"));

        //TV TRIVIA
        trivia.add(new Trivia("Television", "The Simpsons",
                "Who shot Mr. Burns?",
                "Bumblebee Man", "Hank Scorpio", "Apu", "Maggie"));
        trivia.add(new Trivia("Television", "Family Guy",
                "What car does God Himself drive?",
                "A PT Cruiser", "The Popemobile", "A Camero", "An Escalade"));

        //VIDEO GAME TRIVIA
        trivia.add(new Trivia("Video Games", "Ratchet & Clank",
                "Over the course of the series, Captain Qwark eventually goes form Hero to what?",
                "Zero", "Salesman", "Homeless", "Galactic Mayor"));
        trivia.add(new Trivia("Video Games", "Mario",
                "What were the original Yoshi colours in Yoshi's Story?",
                "Green, Yellow, Blue & Pink", "Just Red & Green", "Green, White, Blue & Red", "Green, Yellow, Blue & Red"));
    }
    public Trivia getTrivia(int index) {
        return trivia.get(index);
    }
    public int getSize() {
        return trivia.size();
    }
}
