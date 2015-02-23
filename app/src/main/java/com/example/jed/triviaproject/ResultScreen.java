package com.example.jed.triviaproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ResultScreen extends ActionBarActivity {
    @Override
    public void onBackPressed() {}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);
    }
    public void PlayAgainOnClickListener(View v) {
        Intent i = new Intent(this, QuestionScreen.class);
        this.startActivity(i);
    }
}
