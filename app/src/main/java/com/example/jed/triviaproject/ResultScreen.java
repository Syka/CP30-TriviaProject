package com.example.jed.triviaproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ResultScreen extends ActionBarActivity {
    TextView TotalView, RatioView, ScoreView;
    int totalTime, right, wrong;

    @Override
    public void onBackPressed() {}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);
        TotalView = (TextView) findViewById(R.id.txtTotalTime);
        RatioView = (TextView) findViewById(R.id.txtRatio);
        ScoreView = (TextView) findViewById(R.id.txtScore);
        getScore();
    }
    protected void getScore() {
        Intent i = getIntent();
        totalTime = i.getExtras().getInt("totalTime");
        right = i.getExtras().getInt("right");
        wrong = i.getExtras().getInt("wrong");

        TotalView.setText(Integer.toString(i.getExtras().getInt("totalTime")));
        RatioView.setText(getRatio(right, wrong));
        ScoreView.setText(getScore(totalTime, Integer.parseInt(getRatio(right, wrong))));
    }
    protected String getRatio(int r, int w) {
        return Integer.toString(r / w);
    }
    protected String getScore(int tt, int r) {
        return Integer.toString(Math.round((tt * r) * 100));
    }
    public void PlayAgainOnClickListener(View v) {
        Intent i = new Intent(this, QuestionScreen.class);
        this.startActivity(i);
    }
}
