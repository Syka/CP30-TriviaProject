package com.example.jed.triviaproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class QuestionScreen extends ActionBarActivity {
    Handler timeThread;
    ArrayList<Trivia> trivia;
    Button b1, b2, b3, b4;
    TextView cat, question, txtTimer;
    int triv, right = 0, wrong = 0, time = 59, totalTime = 0;

    @Override
    public void onBackPressed() {}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);
        txtTimer = (TextView) findViewById(R.id.txtTimer);

        createTrivia();
        setScreen();
        setTimeThread();
    }
    //creates Handler that controls the timer
    //in its own thread
    protected synchronized void setTimeThread() {
        timeThread = new Handler();
        timeThread.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (time <= 0) {
                    //sends game stats to results screen via intent
                    Intent i = new Intent(getQA(), ResultScreen.class);
                    i.putExtra("totalTime", totalTime);
                    i.putExtra("right", right);
                    i.putExtra("wrong", wrong);
                    getQA().startActivity(i);
                } else {
                    //continues timer while the game is running
                    time--; totalTime++;
                    txtTimer.setText(Integer.toString(time));
                    new Handler().postDelayed(this, 1000);
                }
            }
        }, 1000);
    }
    //posts instant changes to the
    //timer through its Handler
    protected void setTimer(int t) {
        timeThread.post(new Runnable() {
            @Override
            public void run() {
                txtTimer.setText(Integer.toString(time++));
            }
        });
    }
    //creates all trivia questions to be used
    //in the game
    protected void createTrivia() {
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
    //creates variables of game screen's UI elements
    protected void setScreen() {
        b1 = (Button) findViewById(R.id.btnA1);
        b2 = (Button) findViewById(R.id.btnA2);
        b3 = (Button) findViewById(R.id.btnA3);
        b4 = (Button) findViewById(R.id.btnA4);
        cat = (TextView) findViewById(R.id.txtCategory);
        question = (TextView) findViewById(R.id.txtQuestion);
        //starts the game
        setTriv();
    }
    //randomly generates the order of which
    //answers are displayed on the buttons and stores
    //into an ArrayList
    protected void setTriv() {
        ArrayList<Integer> nums = new ArrayList<>();
        Random r = new Random();
        int triv = r.nextInt(trivia.size());

        //ensures the four answers are
        //never duplicated
        while (nums.size() < 4) {
            int random = r.nextInt(4);
            if (!nums.contains(random)) nums.add(random);
        }
        getTriv(triv, nums);
    }
    //randomly chooses a trivia question
    //using the random answer order
    protected void getTriv(int t, ArrayList<?> nums) {
        cat.setText(trivia.get(t).getProperty());
        question.setText(trivia.get(t).getQuestion());

        b1.setText(trivia.get(t).getAnswers(Integer.parseInt(nums.get(0).toString())));
        b2.setText(trivia.get(t).getAnswers(Integer.parseInt(nums.get(1).toString())));
        b3.setText(trivia.get(t).getAnswers(Integer.parseInt(nums.get(2).toString())));
        b4.setText(trivia.get(t).getAnswers(Integer.parseInt(nums.get(3).toString())));
    }
    //adjusts time limit and score accordingly on button press
    public synchronized void TriviaOnClickListener(View v) {
        Button btn = (Button) v;
        if (btn.getText().equals(trivia.get(triv).getCA_4())) {
            right++;
            setTimer(time++);
        } else {
            wrong++;
            setTimer(time -= 2);
        }
        //chooses another question
        setTriv();
    }
    protected QuestionScreen getQA() {
        return this;
    }
}