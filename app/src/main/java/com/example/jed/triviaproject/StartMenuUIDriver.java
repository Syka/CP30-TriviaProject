package com.example.jed.triviaproject;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Evan on 2015-02-16.
 */
public class StartMenuUIDriver {
    public StartMenu _screen;
    public LinearLayout _linear;
    public LinearLayout _linearSpace;
    private LinearLayout.LayoutParams _layoutParams= new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

    public Button _startButton;
    public Button _highscoreButton;
    public TextView _titleText;
    public StartMenuUIDriver(StartMenu screen)
    {
        _screen = screen;

    }
    /* Orignial
    public void buildUI()
    {
        addLayout();
        addTitle();
        addStartButton();
        //addSpacer();
       // addHighScoreButton();

    }
    public void addLayout()
    {
        _linear = new LinearLayout(_screen);
        _linear.setOrientation(_linear.VERTICAL);


        _linear.setLayoutParams(_layoutParams);
        _screen.setContentView(_linear);
    }
    public void addTitle()
    {
        _titleText = new TextView(_screen);
        _titleText.setText("Quiz Game");
        _titleText.setGravity(Gravity.CENTER);
        _titleText.setTextSize(50);
        _linear.addView(_titleText);

    }
    /*
    public void addSpacer()
    {
        _linearSpace = new LinearLayout(_screen);
        _linearSpace.setOrientation(_linear.VERTICAL);
        _layoutParams.getLayoutParams().width=1;
        _linearSpace.setLayoutParams(_layoutParams);
        _screen.setContentView(_linearSpace);
    }

    public void addStartButton()
    {
        _startButton = new Button(_screen);
        _startButton.setText("Start");
        _startButton.setTextSize(40);
        _startButton.setTextColor(Color.parseColor("#FFFFFF"));
        _startButton.setBackgroundColor(Color.parseColor("#3399FF"));

       _linear.addView(_startButton);
    }
    public void addHighScoreButton()
    {
        _highscoreButton = new Button(_screen);
        _highscoreButton.setText("High Scores");
        _highscoreButton.setTextColor(Color.parseColor("#FFFFFF"));
        _highscoreButton.setBackgroundColor(Color.parseColor("#3399FF"));

        _linear.addView(_highscoreButton);
    }
    */

}
