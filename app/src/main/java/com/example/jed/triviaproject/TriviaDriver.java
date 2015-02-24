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

        //Star Wars
        trivia.add(new Trivia("Movies", "Star Wars",
                "What is the probability of successfully navigating an asteroid field?",
                "1,547:1", "1,245,677:1", "10:1", "3,720:1"));
        trivia.add(new Trivia("Movies", "Star Wars",
                "The volcanic world of Mustafar in Episode 3: Revenge of the Sith was designed to look like what?",
                "George Lucas’s Vision of the Sun.", "George Lucas’s Worst Nightmare", "Florida", "George Lucas’s Vision of Hell."));

        //Marvel
        trivia.add(new Trivia("Movies", "Marvel",
                "What does Rocket Raccoon require to escape the prison in Guardians of the Galaxy? ",
                "An Infinity Stone", "A keycard", "Stan Lee", "A prosthetic leg"));
        trivia.add(new Trivia("Movies", "Marvel",
                "Of all the Avengers, which movie star appeared as a different superhero in 2005?",
                "Scarlett Johansson", "Robert Downey Jr.", "Chris Hemsworth", "Chris Evans"));

        //Back to the Future
        trivia.add(new Trivia("Movies", "Back to the Future",
                "How many jigawatts are needed to go back in time?",
                "2.09", "1.25", "2.03", "1.21"));
        trivia.add(new Trivia("Movies", "Back to the Future",
                "Make like a tree and ...?",
                "Stay Put", "Die Old", "Travel Light", "Get Lost"));

        //Lord of the Rings
        trivia.add(new Trivia("Movies", "Lord of the Rings",
                "Other then the movies, Gollum showed up on what awards show? ",
                "Kids Choice Awards", "Emmys", "The Oscars", "MTV Video Awards"));
        trivia.add(new Trivia("Movies", "Lord of the Rings",
                "Whats the most valuable thing in the Lonely Mountain?",
                "Gollum", "The Ring", "Smaug", "Arkenstone"));

        //Die Hard
        trivia.add(new Trivia("Movies", "Die Hard",
                "What do most cops do with their badge numbers?",
                "Race cars", "Gamble the badge", "Stop Crimes", "Play the lottery"));
        trivia.add(new Trivia("Movies", "Die Hard",
                "What is the name of Mcleans partner in Die Hard 3?",
                "Posidon", "Hades", "Athena", "Zeus"));




        //TV TRIVIA
        //The Simpsons
        trivia.add(new Trivia("Television", "The Simpsons",
                "Who shot Mr. Burns?",
                "Bumblebee Man", "Hank Scorpio", "Apu", "Maggie"));
        trivia.add(new Trivia("Television", "The Simpsons",
                "NANANANANANANANANA...?",
                "Batman", "Homer", "I forgot", "Leader"));

        //Family Guy
        trivia.add(new Trivia("Television", "Family Guy",
                "What car does God Himself drive?",
                "A PT Cruiser", "The Popemobile", "A Camero", "An Escalade"));
        trivia.add(new Trivia("Television", "Family Guy",
                "On the 100th episode of Family Guy, what did Stewie accomplish?",
                "Resurrection of Brian", "Become President", "Time Travel", "Killing Lois"));

        //Futurama
        trivia.add(new Trivia("Television", "Futurama",
                "I am the man with NO name...?",
                "Bender", "Phillip J. Fry", "Kip Kroker", "Zap Brannigan"));
        trivia.add(new Trivia("Television", "Futurama",
                "What makes a Man turn neutral, Power?",
                "Endless Food", " Lust for Woman", "Neutrality", "Lust of Gold"));

        //How I met your Mother
        trivia.add(new Trivia("Television", "How I met your Mother",
                "WHat name is most associated to the statement: Have you met ...?",
                "Mother", "Marshal", "Barney", "Ted"));
        trivia.add(new Trivia("Television", "How I met your Mother",
                "What does the gang call out when their wearing Top Hats?",
                "Over-Thinker", "Fancy", "Captain", "The Gentlemen"));

        //VIDEO GAME TRIVIA
        //Ratchet and Clank
        trivia.add(new Trivia("Video Games", "Ratchet & Clank",
                "Over the course of the series, Captain Qwark eventually goes form Hero to what?",
                "Zero", "Salesman", "Homeless", "Galactic Mayor"));
        trivia.add(new Trivia("Video Games", "Ratchet & Clank",
                "What villian was responsible for the destruction of the Lombax extinction?",
                "Gleeman Vox", "Stuart Zurgo", "Dr. Nufarious", "Percival Tachyon"));

        //Mario World
        trivia.add(new Trivia("Video Games", "Mario",
                "What were the original Yoshi colours in Yoshi's Story?",
                "Green, Yellow, Blue & Pink", "Just Red & Green", "Green, White, Blue & Red", "Green, Yellow, Blue & Red"));
        trivia.add(new Trivia("Video Games", "Mario",
                "Before Mario was Mario, what was his name?",
                "Luigi", "Rockman", "Plungerman", "Jumpman"));

        //Far Cry
        trivia.add(new Trivia("Video Games", "Far Cry",
                "In Far Cry 4, Which animal was not included?",
                "Bear", "Honey Badger", "Eagle", "Falcon"));
        trivia.add(new Trivia("Video Games", "Far Cry",
                "In Far Cry 2, the player is under what sickness?",
                "Cancer", "AIDS", "Headaches", "Miliaria"));

        //Pokemon
        trivia.add(new Trivia("Video Games", "Pokemon",
                "To the end of Generation 6, how many Pokemon are there?",
                "674", "742", "698", "719"));
        trivia.add(new Trivia("Video Games", "Pokemon",
                "How many evolutions does Eevee have?",
                "6", "7", "9", "8"));

        //Assassins Creed
        trivia.add(new Trivia("Video Games", "Assassins Creed",
                "What Assassin turned against there own brotherhood to save lives?",
                "Altir", "Arno", "Edward", "Shay"));
        trivia.add(new Trivia("Video Games", "Assassins Creed",
                "What Assassin died locking himself inside a Library?",
                "Aveline", "Ezio", "Connor", "Altir"));

    }
    public ArrayList<Trivia> arr() {
        return trivia;
    }
}
