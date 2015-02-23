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
    TriviaDriver td;
    Button b1, b2, b3, b4;
    TextView cat, question, txtTimer;
    int triv, right = 0, time = 59, totalTime = 0;

    @Override
    public void onBackPressed() {}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);
        txtTimer = (TextView) findViewById(R.id.txtTimer);

        td = new TriviaDriver();
        setScreen();
        setTimeThread();
    }
    //creates Handler that controls the timer
    //in its own thread
    protected void setTimeThread() {
        timeThread = new Handler();
        timeThread.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (time <= 0) {
                    //sends game stats to results screen via intent
                    getQA().startActivity(resultIntent());
                    finish();
                } else {
                    //continues timer while the game is running
                    time--;
                    totalTime++;
                    txtTimer.setText(Integer.toString(time));
                    new Handler().postDelayed(this, 1000);
                }
            }
        }, 1000);
    }
    //posts instant changes to the
    //timer through its Handler
    protected void setTimer(final int t) {
        timeThread.post(new Runnable() {
            @Override
            public void run() {
                txtTimer.setText(Integer.toString(t));
            }
        });
    }
    protected Intent resultIntent() {
        Intent i = new Intent(getQA(), ResultScreen.class);
        i.putExtra("totalTime", totalTime);
        i.putExtra("right", right);
        i.putExtra("size", td.getSize());
        return i;
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
        int triv = r.nextInt(td.getSize());

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
        cat.setText(td.getTrivia(t).getProperty());
        question.setText(td.getTrivia(t).getQuestion());

        b1.setText(td.getTrivia(t).getAnswers(Integer.parseInt(nums.get(0).toString())));
        b2.setText(td.getTrivia(t).getAnswers(Integer.parseInt(nums.get(1).toString())));
        b3.setText(td.getTrivia(t).getAnswers(Integer.parseInt(nums.get(2).toString())));
        b4.setText(td.getTrivia(t).getAnswers(Integer.parseInt(nums.get(3).toString())));
    }
    //adjusts time limit and score accordingly on button press
    public void TriviaOnClickListener(View v) {
        Button btn = (Button) v;
        if (btn.getText().equals(td.getTrivia(triv).getCA_4())) {
            right++;
            setTimer(time += 5);
        } else setTimer(time -= 2);
        //chooses another question
        setTriv();
    }
    //returns question screen activity
    protected QuestionScreen getQA() {
        return this;
    }
}