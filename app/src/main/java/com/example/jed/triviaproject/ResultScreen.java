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
    Button SubmitButton;
    double right, totalTime;
    public MySQLiteOpenHelper _sqlHelper = new MySQLiteOpenHelper(this);

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

        TotalView.setText(String.format("%1$s s", i.getExtras().getInt("totalTime")));
        RatioView.setText(String.format("%1$s/%2$s", i.getExtras().getInt("right"), i.getExtras().getInt("size")));
        ScoreView.setText(Integer.toString((int) scoreCalc()));
    }
    protected double scoreCalc() {
        return (right / totalTime) * 1000;
    }
    public void PlayAgainOnClickListener(View v) {
        InitialScore = (EditText) findViewById(R.id.etScore);
        try
        {
                SQLiteDatabase db = _sqlHelper.getWritableDatabase();

                db.execSQL("INSERT INTO mytable (name,score)VALUES('" + InitialScore.getText().toString() + "','" + Integer.toString((int) scoreCalc()) + "')");
                Log.d("check", InitialScore.getText().toString().toUpperCase() + " " + Integer.toString((int) scoreCalc()));
                InitialScore.setEnabled(false);

        }
        catch (Exception e)
        {
            Log.d("Check", e.toString());
        }
        this.startActivity(new Intent(this, StartMenu.class));
    }
}
