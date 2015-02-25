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
                "The volcanic world of Mustafar in \"Revenge of the Sith\" was George Lucas' rendition of what?",
                "The sun", "His worst nightmare", "Florida", "Hell"));

        //Marvel
        trivia.add(new Trivia("Movies", "Marvel",
                "What does Rocket Raccoon require to escape the prison in \"Guardians of the Galaxy?\"",
                "An Infinity Stone", "A keycard", "Stan Lee", "A prosthetic leg"));
        trivia.add(new Trivia("Movies", "Marvel",
                "Of the Avengers, which movie star played as a different superhero?",
                "Scarlett Johansson", "Robert Downey Jr.", "Tobey Maguire", "Chris Evans"));
        trivia.add(new Trivia("Movies", "Marvel",
                "Star-Lord's \"Awesome Mix Vol. 1\" is stored on what physical media?",
                "Blu-ray Disc", "CD", "MP3", "Cassette"));

        //Back to the Future
        trivia.add(new Trivia("Movies", "Back to the Future",
                "How many jigawatts are needed to go back in time?",
                "2.09", "1.25", "2.03", "1.21"));
        trivia.add(new Trivia("Movies", "Back to the Future",
                "Complete the quote: \"Make like a tree and...?\"",
                "\"...stay put!\"", "\"...die old!\"", "\"...grow leaves!\"", "\"...get lost!\""));

        //Lord of the Rings
        trivia.add(new Trivia("Movies", "Lord of the Rings",
                "Besides The One Ring, how many Rings of Power actually exist in Middle-Earth?",
                "20", "14", "18", "19"));
        trivia.add(new Trivia("Movies", "Lord of the Rings",
                "Gollum made a personal appearance during what awards show? ",
                "Kids Choice Awards", "Emmy Awards", "The Oscars", "MTV Video Awards"));
        trivia.add(new Trivia("Movies", "Lord of the Rings",
                "What is the most valuable item held within the Lonely Mountain?",
                "Gollum", "The One Ring", "The Philosopher's Stone", "The Arkenstone"));

        //Die Hard
        trivia.add(new Trivia("Movies", "Die Hard",
                "What do most cops do with their badge numbers?",
                "Race cars", "Gamble", "Stop crimes", "Play the lottery"));
        trivia.add(new Trivia("Movies", "Die Hard",
                "What is the name of McLean's partner in \"Die Hard 3?\"",
                "Kratos", "Hades", "Athena", "Zeus"));

        //Avatar
        trivia.add(new Trivia("Movies", "Avatar",
                "What is the name of the planet in \"Avatar?\"",
                "Puerto Rico", "Pandana", "Pluto", "Pandora"));
        trivia.add(new Trivia("Movies", "Avatar",
                "In \"Avatar,\" how tall do the native Na'vi stand?",
                "6 ft.", "7 ft.", "10 ft.", "9 ft."));

        //Pirates of the Caribbean
        trivia.add(new Trivia("Movies", "Pirates of the Caribbean",
                "The Pirate Lords each held trinkets that was collectively referred to as what?",
                "Pieces of Nine", "Seven Pieces of Eight", "Eleven Pieces of Nine", "Nine Pieces of Eight"));
        trivia.add(new Trivia("Movies", "Pirates of the Caribbean",
                "How did Jack and the crew return to the original world in \"At World's End?\"",
                "Traveled though a cave", "Tap their heels together three times", "Climb the waterfall", "Flip the ship"));

        //TV TRIVIA
        //The Simpsons
        trivia.add(new Trivia("Television", "The Simpsons",
                "Who shot Mr. Burns?",
                "Bumblebee Man", "Hank Scorpio", "Apu", "Maggie"));
        trivia.add(new Trivia("Television", "The Simpsons",
                "The logo that resembled Homer's likeless belonged to what Japanese laundry detergent?",
                "Mr. Clean", "Mr. Dazzle", "Mr. Twinkle", "Mr. Sparkle"));
        trivia.add(new Trivia("Television", "The Simpsons",
                "Homer feared he had been fatally poisoned after eating what?",
                "Free goo", "Pistol whip", "Beer nuts", "Blowfish"));
        trivia.add(new Trivia("Television", "The Simpsons",
                "Dan Castellaneta, the voice of Homer, voices how many characters in total?",
                "1", "13", "42", "26"));

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
                "\"Faster Than The Speed Of Sound\"", "\"Dog Meets World\"", "\"Love: A Story About Brian\"", "\"Faster Than The Speed Of Love\""));

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
                "What common household hardware is used as the series' currency?",
                "Wingnuts", "Washers", "Screws", "Bolts"));
        trivia.add(new Trivia("Video Games", "Ratchet & Clank",
                "Which villain was responsible for the Lombax exodus?",
                "Lord Vorselon", "Gleeman Vox", "Dr. Nefarious", "Percival Tachyon"));

        //Mario
        trivia.add(new Trivia("Video Games", "Mario",
                "In \"Super Mario World,\" eating red Koopa shells gives Yoshi the ability to do what?",
                "Grow twice its size", "Give Mario a 1-Up", "Become invincible", "Spit fireballs"));
        trivia.add(new Trivia("Video Games", "Mario",
                "What was Mario's original name?",
                "Luigi", "Rockman", "Shigeru", "Jumpman"));
        trivia.add(new Trivia("Video Games", "Mario",
                "In \"Super Mario 64,\" Princess Peach invites Mario to her castle to do what?",
                "Fix her sink", "Find Yoshi", "Resuce her from Bowser", "Eat cake"));

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
                "6", "7", "9", "8"));
        trivia.add(new Trivia("Video Games", "Pokemon",
                "Who is Professor Oak's grandson?",
                "Gerry Oak", "Buttface", "Jerry Oak", "Gary Oak"));

        //Assassins Creed
        trivia.add(new Trivia("Video Games", "Assassin's Creed",
                "Who was the first Assassin to work for the Templars?",
                "Altair Ibn-La'Ahad", "Desmond Miles", "Edward Kenway", "Shay Cormac"));
        trivia.add(new Trivia("Video Games", "Assassin's Creed",
                "Which of the following was not a featured setting in the series?",
                "Jerusalem", "The Caribbean", "Italy", "Chicago"));

        //Saints Row
        trivia.add(new Trivia("Video Games", "Saints Row",
                "In \"Saints Row 4,\" the Earth is destroyed by who?",
                "Phillipe Loren", "Cyrus Temple", "Satan", "Zinyak"));
        trivia.add(new Trivia("Video Games", "Saints Row",
                "What fictional series is Matt Miller obsessed with?",
                "SaintBlade", "DanteBlade", "NightHawk", "NightBlade"));
    }
    public ArrayList<Trivia> arr() {
        return trivia;
    }
}
