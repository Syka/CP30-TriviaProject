package com.example.jed.triviaproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class QuestionScreen extends ActionBarActivity {
    public Handler timeThread;
    public TriviaDriver td;
    public Button b1, b2, b3, b4;
    public TextView cat, question, txtTimer;
    public int triv, right, time, totalTime, size,reward,penalty;
    public boolean noQuestions;
    public boolean Hardmode =false;
    private static final int SHORT_DELAY = 500;

    @Override
    public void onBackPressed() {}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);
        txtTimer = (TextView) findViewById(R.id.txtTimer);

        td = new TriviaDriver();
        Intent i = getIntent();
        Hardmode=i.getExtras().getBoolean("Hardmode");
        setVars();
        setScreen();
        setTimeThread();
    }
    protected void setVars() {
        right = 0;
        if(Hardmode == true)
        {
            penalty =10;
            Log.d("check","Penalty 10");

        }
        else{
            penalty = 3;
            Log.d("check","Penalty 3");
        }
        totalTime = 0;
        time = 59;
        size = td.arr().size();
        noQuestions = false;
        reward = 2;

    }
    //creates Handler that controls the timer
    //in its own thread
    protected void setTimeThread() {
        timeThread = new Handler();
        timeThread.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (time <= 0 || noQuestions) {
                    stopThread();
                    timeThread.removeCallbacks(this);
                } else {
                    //continues timer while the game is running
                    time--;
                    totalTime++;
                    txtTimer.setText(Integer.toString(time));
                    timeThread.postDelayed(this, 1000);
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
    protected void stopThread() {
        timeThread.post(new Runnable() {
            @Override
            public void run() {
                //sends game stats to results screen via intent
                getQA().startActivity(resultIntent());
                Thread.dumpStack();
            }
        });
    }
    protected Intent resultIntent() {
        Intent i = new Intent(getQA(), ResultScreen.class);
        i.putExtra("totalTime", totalTime);
        i.putExtra("right", right);
        Log.d("test", String.format("ArrayList size is: %1$s", td.arr().size()));
        i.putExtra("size", size);
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
        triv = r.nextInt(td.arr().size());

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
        cat.setText(td.arr().get(t).getProperty());
        question.setText(td.arr().get(t).getQuestion());

        b1.setText(td.arr().get(t).getAnswers(Integer.parseInt(nums.get(0).toString())));
        b2.setText(td.arr().get(t).getAnswers(Integer.parseInt(nums.get(1).toString())));
        b3.setText(td.arr().get(t).getAnswers(Integer.parseInt(nums.get(2).toString())));
        b4.setText(td.arr().get(t).getAnswers(Integer.parseInt(nums.get(3).toString())));
    }
    //adjusts time limit and score accordingly on button press
    public void TriviaOnClickListener(View v) {
        Button btn = (Button) v;
        if (td.arr().size() == 1) {
            checkAnswer(btn);
            noQuestions = true;
        } else {
            checkAnswer(btn);
            td.arr().remove(triv);
        }
        //chooses another question
        setTriv();
    }
    public synchronized void checkAnswer(Button b) {
        if (b.getText().equals(td.arr().get(triv).getCA())) {
            makeToast("Correct!");
            right++;
            setTimer(time += reward);
        } else {
            makeToast(String.format("The correct answer was: %1$s", td.arr().get(triv).getCA()));
            setTimer(time -= penalty);
        }
    }
    public void makeToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
    //returns question screen activity
    protected QuestionScreen getQA() {
        return this;
    }
}
