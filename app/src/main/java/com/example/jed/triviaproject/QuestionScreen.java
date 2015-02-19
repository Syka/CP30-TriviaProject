package com.example.jed.triviaproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class QuestionScreen extends ActionBarActivity {
    public ArrayList<Trivia> trivia;
    Button b1, b2, b3, b4;
    TextView cat, question;
    int triv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);
        createTrivia();
        setScreen();

    }

    public void createTrivia() {
        trivia = new ArrayList<>();
        trivia.add(new Trivia("Movies", "Star Wars",
                "What is the probability of successfully navigating an asteroid field?",
                "1,547:1", "1,245,677:1", "10:1", "3,720:1"));
        trivia.add(new Trivia("Movies", "Marvel",
                "What does Rocket Raccoon require to escape the prison in Guardians of the Galaxy? ",
                "An Infinity Stone", "A keycard", "Stan Lee", "A prosthetic leg"));
        trivia.add(new Trivia("Television", "The Simpsons",
                "Who shot Mr. Burns?",
                "Bumblebee Man", "Hank Scorpio", "Apu", "Maggie"));
        trivia.add(new Trivia("Television", "Family Guy",
                "What car does God Himself drive?",
                "A PT Cruiser", "The Popemobile", "A Camero", "An Escalade"));
        trivia.add(new Trivia("Video Games", "Ratchet & Clank",
                "Over the course of the series, Captain Qwark eventually goes form Hero to what?",
                "Zero", "Salesman", "Homeless", "Galactic Mayor"));
        trivia.add(new Trivia("Video Games", "Mario",
                "What were the original Yoshi colours in Yoshi's Story?",
                "Green, Yellow, Blue & Pink", "Just Red & Green", "Green, White, Blue & Red", "Green, Yellow, Blue & Red"));
    }
    public void setScreen() {
        b1 = (Button) findViewById(R.id.btnA1);
        b2 = (Button) findViewById(R.id.btnA2);
        b3 = (Button) findViewById(R.id.btnA3);
        b4 = (Button) findViewById(R.id.btnA4);
        cat = (TextView) findViewById(R.id.txtCategory);
        question = (TextView) findViewById(R.id.txtQuestion);
        Random r = new Random();
        ArrayList<Integer> nums = new ArrayList<>();

        triv = r.nextInt(trivia.size());

        while (nums.size() < 4) {
            int random = r.nextInt(4);
            if (!nums.contains(random)) {
                nums.add(random);
            }
        }

        cat.setText(trivia.get(triv).getProperty());
        question.setText(trivia.get(triv).getQuestion());

        b1.setText(trivia.get(triv).getAnswers(nums.get(0)));
        b2.setText(trivia.get(triv).getAnswers(nums.get(1)));
        b3.setText(trivia.get(triv).getAnswers(nums.get(2)));
        b4.setText(trivia.get(triv).getAnswers(nums.get(3)));
    }
    public void TriviaOnClickListener(View v) {
        Button btn = (Button) v;
        if (btn.getText().equals(trivia.get(triv).getCA_4())) {
            Log.d("test", "Correct answer!");
        } else {
            Log.d("test", "Wrong answer!");
        }
        setScreen();
    }
}
