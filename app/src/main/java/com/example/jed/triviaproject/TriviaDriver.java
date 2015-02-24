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
                "What are the odds of successfully navigating an asteroid field?",
                "1,547 to 1", "1,245,677 to 1", "10 to 1 ", "3,720 to 1"));
        trivia.add(new Trivia("Movies", "Star Wars",
                "The volcanic world of Mustafar was George Lucas' rendition of what?",
                "The sun", "His worst nightmare", "Florida", "Hell"));

        //Marvel
        trivia.add(new Trivia("Movies", "Marvel",
                "What does Rocket Raccoon require to escape the prison in \"Guardians of the Galaxy?\"",
                "An Infinity Stone", "A keycard", "Stan Lee", "A prosthetic leg"));
        trivia.add(new Trivia("Movies", "Marvel",
                "Of the Avengers, which movie star played as a different superhero?",
                "Scarlett Johansson", "Robert Downey Jr.", "Tobey Maguire", "Chris Evans"));

        //Back to the Future
        trivia.add(new Trivia("Movies", "Back to the Future",
                "How many jigawatts are needed to go back in time?",
                "2.09", "1.25", "2.03", "1.21"));
        trivia.add(new Trivia("Movies", "Back to the Future",
                "Complete the quote: \"Make like a tree and...?\"",
                "\"...stay put!\"", "\"...die old!\"", "\"...grow leaves!\"", "\"...get lost!\""));

        //Lord of the Rings
        trivia.add(new Trivia("Movies", "Lord of the Rings",
                "Gollum made a personal appearance during what awards show? ",
                "Kids Choice Awards", "Emmy Awards", "The Oscars", "MTV Video Awards"));
        trivia.add(new Trivia("Movies", "Lord of the Rings",
                "What is the most valuable item held within the Lonely Mountain?",
                "Gollum", "The Ring", "Smaug", "Arkenstone"));

        //Die Hard
        trivia.add(new Trivia("Movies", "Die Hard",
                "What do most cops do with their badge numbers?",
                "Race cars", "Gamble", "Stop crimes", "Play the lottery"));
        trivia.add(new Trivia("Movies", "Die Hard",
                "What is the name of McLean's partner in \"Die Hard 3?\"",
                "Kratos", "Hades", "Athena", "Zeus"));

        //Avatar
        trivia.add(new Trivia("Movies", "Avatar",
                "What is the name of the planet in Avatar?",
                "Panarama", "Pandana", "Pluto", "Pandora"));
        trivia.add(new Trivia("Movies", "Avatar",
                "How tall do the natives in Avatar stand?",
                "6 Feet", "7 Feet", "10 Feet", "9 Feet"));

        //Pirates of the Caribbean
        trivia.add(new Trivia("Movies", "Pirates of the Caribbean",
                "How many pieces were there among the pirate lords?",
                "11", "7", "8", "9"));
        trivia.add(new Trivia("Movies", "Pirates of the Caribbean",
                "How did Jack and the crew return to the original world?",
                "Traveled though a cave", "They never returned", "Climb the waterfall", "Flipped the Ship"));


        //TV TRIVIA
        //The Simpsons
        trivia.add(new Trivia("Television", "The Simpsons",
                "Who shot Mr. Burns?",
                "Bumblebee Man", "Hank Scorpio", "Apu", "Maggie"));
        trivia.add(new Trivia("Television", "The Simpsons",
                "Which Japanese laundry detergent's logo resembles Homer's likeness?",
                "Mr. Clean", "Mr. Dazzle", "Mr. Twinkle", "Mr. Sparkle"));

        //Family Guy
        trivia.add(new Trivia("Television", "Family Guy",
                "What car does God Himself drive?",
                "PT Cruiser", "The Popemobile", "Camero", "Escalade"));
        trivia.add(new Trivia("Television", "Family Guy",
                "On the 100th episode, what does Stewie finally accomplish?",
                "Resurrect Brian", "Become President", "Time travel to the future", "Kill Lois"));
        trivia.add(new Trivia("Television", "Family Guy",
                "What teenage pop star was Stewie crazy about until she turned out to be a fembot?",
                "Taylor Swift", "Selena Gomez", "Hilary Duff", "Miley Cyrus"));
        trivia.add(new Trivia("Television", "Family Guy",
                "What was the title of Brian's book?",
                "Further then the Ocean Travels", "Eat, Pray, Sniff", "Love, a Brian Story", "Faster then the Speed of Love"));

        //Futurama
        trivia.add(new Trivia("Television", "Futurama",
                "Who is the man with \"no name?\"",
                "Bender", "Phillip J. Fry", "Kip Kroker", "Zap Brannigan"));
        trivia.add(new Trivia("Television", "Futurama",
                "What show does the phrase, \"What makes a Man turn neutral, Power?\" come from?",
                "Endless Food", " Lust for Women", "Neutrality", "Lust of Gold"));

        //How I met your Mother
        trivia.add(new Trivia("Television", "How I met your Mother",
                "The phrase, \"Have you met...\" usually refers to which character?",
                "Mother", "Marshal", "Barney", "Ted"));
        trivia.add(new Trivia("Television", "How I met your Mother",
                "What do The Gang call themselves while wearing top hats?",
                "Old Timey", "Guv'nors", "Moneybags", "The Gentlemen"));

        //VIDEO GAME TRIVIA
        //Ratchet and Clank
        trivia.add(new Trivia("Video Games", "Ratchet & Clank",
                "Over the course of the series, Captain Qwark eventually goes from Hero to what?",
                "Zero", "Salesman", "Homeless", "Galactic Mayor"));
        trivia.add(new Trivia("Video Games", "Ratchet & Clank",
                "What common household hardware are used as the series' currency?",
                "Wingnuts", "Washers", "Screws", "Bolts"));
        trivia.add(new Trivia("Video Games", "Ratchet & Clank",
                "What villain was responsible for the extinction of the Lombax? ",
                "Lord Vorselon", "Gleeman Vox", "Dr.Nefarious", "Percival Tachyon"));

        //Mario World
        trivia.add(new Trivia("Video Games", "Mario",
                "What were the original Yoshi colours in Yoshi's Story?",
                "Green, Orange, Blue, Pink", "Just Red & Green", "Green, White, Blue, Red", "Green, Yellow, Blue, Red"));
        trivia.add(new Trivia("Video Games", "Mario",
                "What was Mario's original name?",
                "Luigi", "Rockman", "Shigeru", "Jumpman"));
        trivia.add(new Trivia("Video Games", "Mario",
                "Complete the phrase, \"You know what they say: All toasters...\"",
                "\"...toast bread!\"", "\"...toast bagels!\"", "\"...burn my toast!\"", "\"...toast toast!\""));

        //Far Cry
        trivia.add(new Trivia("Video Games", "Far Cry",
                "In \"Far Cry 4,\" which animal was not hunted for sport?",
                "Bears", "Honey Badgers", "Eagles", "Dogs"));
        trivia.add(new Trivia("Video Games", "Far Cry",
                "The player contracts what sickness in \"Far Cry 2\"?",
                "Hepatitis C", "AIDS", "Traveller's Diarrhea", "Malaria"));

        //Pokemon
        trivia.add(new Trivia("Video Games", "Pokemon",
                "How many Pokemon are there to catch by Generation 6?",
                "674", "742", "698", "719"));
        trivia.add(new Trivia("Video Games", "Pokemon",
                "How many possible evolutions does Eevee have?",
                "Six", "Seven", "Nine", "Eight"));

        //Assassins Creed
        trivia.add(new Trivia("Video Games", "Assassin's Creed",
                "Who was the first Assassin to work for the Templars?",
                "Altair Ibn-La'Ahad", "Desmond Miles", "Edward Kenway", "Shay Cormac"));
        trivia.add(new Trivia("Video Games", "Assassin's Creed",
                "Which of the following was not a featured setting in the series?",
                "Jerusalem", "The Caribbean", "Italy", "Chicago"));

        //Saints Row
        trivia.add(new Trivia("Video Games", "Saints Row",
                "In Saints Row 4, the Earth is destroyed by who?",
                "Phillipe Loren", "Cyrus Temple", "Satan", "Zinyak"));
        trivia.add(new Trivia("Video Games", "Saints Row",
                "What fictional character series is Matt Miller obsessed with?",
                "SaintBlade", "DanteBlade", "NightHawk", "NightBlade"));


    }
    public ArrayList<Trivia> arr() {
        return trivia;
    }
}
