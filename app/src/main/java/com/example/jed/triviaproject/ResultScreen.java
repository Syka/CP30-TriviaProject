package com.example.jed.triviaproject;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ResultScreen extends ActionBarActivity {
    TextView TotalView, RatioView, ScoreView;
    EditText InitialScore;
    double right, totalTime;
    MySQLiteOpenHelper _sqlHelper = new MySQLiteOpenHelper(this);

    @Override
    public void onBackPressed() {}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);

        buildUI();
        getScore();
    }
    protected void buildUI() {
        TotalView = (TextView) findViewById(R.id.txtTotalTime);
        RatioView = (TextView) findViewById(R.id.txtRatio);
        ScoreView = (TextView) findViewById(R.id.txtScore);
    }
    protected double scoreCalc() {
        return (right *100);
    }
    protected void getScore() {
        totalTime = (double) getIntent().getExtras().getInt("totalTime");
        right = (double) getIntent().getExtras().getInt("right");

        TotalView.setText(String.format("%1$s s", getIntent().getExtras().getInt("totalTime")));
        RatioView.setText(String.format("%1$s/%2$s", getIntent().getExtras().getInt("right"),
                getIntent().getExtras().getInt("size")));
        ScoreView.setText(Integer.toString((int) scoreCalc()));
    }
    public void PlayAgainOnClickListener(View v) {
        InitialScore = (EditText) findViewById(R.id.etScore);

        if (InitialScore.getText().equals("")) {
            makeToast("Please enter your initials!");
        }
        else {
            try {
                SQLiteDatabase db = _sqlHelper.getWritableDatabase();
                db.execSQL("INSERT INTO mytable (name,score)VALUES('"
                        + InitialScore.getText().toString() + "','" + Integer.toString((int) scoreCalc()) + "')");
                InitialScore.setEnabled(false);
            } catch (Exception e) {
                Log.d("Check", e.toString());
            }
            makeToast(InitialScore.getText() + " has been added!");
            this.startActivity(new Intent(this, StartMenu.class));
        }
    }
    protected void makeToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
