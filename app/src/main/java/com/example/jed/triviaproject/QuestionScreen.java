package com.example.jed.triviaproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;


public class QuestionScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);
        createTrivia();
    }
    public void createTrivia() {
        ArrayList<String> category = new ArrayList<>();
        category.add("Movies");
        category.add("TV");
        category.add("Video Games");


    }
    public void TriviaOnClickListener(View v) {

    }
}
