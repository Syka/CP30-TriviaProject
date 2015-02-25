package com.example.jed.triviaproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class StartMenu extends ActionBarActivity {
    ImageButton startbutton;
    boolean Hardmode = false;

    @Override
    public void onBackPressed() {
        System.exit(0);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);
        startbutton = (ImageButton)findViewById(R.id.btnstart);
        startbutton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                shortclick();
            }
        });

        startbutton.setOnLongClickListener(new View.OnLongClickListener()
        {
            public boolean onLongClick(View v)
            {
                longclick();
                return true;
            }
        });
    }
    public void HighScoreButtonOnClickListener(View v) {
        Intent i = new Intent(this, HighScoreScreen.class);
        this.startActivity(i);
    }
    public void shortclick() {
        try {
            Intent i = new Intent(this, QuestionScreen.class);
            if(Hardmode) i.putExtra("Hardmode", Hardmode=true);
            else if(!Hardmode) i.putExtra("Hardmode", Hardmode=false);
            this.startActivity(i);
        } catch(Exception e) {
            Log.d("check", e.toString());
        }
    }
    public void longclick() {
        if (Hardmode) {
            Hardmode = false;
            Toast.makeText(this,"HARDMODE DISABLED",Toast.LENGTH_SHORT).show();
            Log.d("check","Long click " + Hardmode);
        } else {
            Hardmode = true;
            Toast.makeText(this,"HARDMODE ENABLED",Toast.LENGTH_SHORT).show();
            Log.d("check","Long click " + Hardmode);
        }
    }
}