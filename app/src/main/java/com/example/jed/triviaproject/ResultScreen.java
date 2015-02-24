package com.example.jed.triviaproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ResultScreen extends ActionBarActivity {
    TextView TotalView, RatioView, ScoreView;
    double right, totalTime;

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
        totalTime = (double) i.getExtras().getInt("totalTime");
        right = (double) i.getExtras().getInt("right");

        TotalView.setText(Integer.toString(i.getExtras().getInt("totalTime")));
        RatioView.setText(String.format("%1$s/%2$s", i.getExtras().getInt("right"),
                i.getExtras().getInt("size")));
        ScoreView.setText(Double.toString(scoreCalc()));
    }
    public double scoreCalc() {
        return right / totalTime * 1000;
    }
    public void PlayAgainOnClickListener(View v) {
        this.startActivity(new Intent(this, StartMenu.class));
    }
}
