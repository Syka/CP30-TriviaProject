package com.example.jed.triviaproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class StartMenu extends ActionBarActivity {
    @Override
    public void onBackPressed() {
        System.exit(0);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);
    }
    public void StartButtonOnClickListener(View v) {
        Intent i = new Intent(this, QuestionScreen.class);
        this.startActivity(i);
    }
    public void HighScoreButtonOnClickListener(View v) {
        Intent i = new Intent(this, HighScoreScreen.class);
        this.startActivity(i);
    }
}
