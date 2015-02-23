package com.example.jed.triviaproject;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HighScoreScreen extends ActionBarActivity {

    ListView listView;
    private static final String TAG = "Mongoose";
    public MySQLiteOpenHelper _sqlHelper = new MySQLiteOpenHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score_screen);
        Log.d("check","getting db");
        dropSQLLite();
        createSQLLite();
        setSQLLite();
        getSQLLite();





    }

    public void getSQLLite()
    {
        try {

            listView=(ListView)findViewById(R.id.ScoreList);

            List<String> scores=new ArrayList<String>();

            ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,scores);

            SQLiteDatabase db = _sqlHelper.getReadableDatabase();


            Cursor dbCursor = db.query("mytable", null, null, null,null, null," SCORE DESC");
            //Cursor dbCursor = db.query("mytable", null, null, null, null, null, null);


            dbCursor.moveToFirst();
            while (dbCursor.isAfterLast() == false) {
                adapter.add(dbCursor.getString(0) + " " + dbCursor.getString(1));
                Log.d(TAG, dbCursor.getString(0) + " " + dbCursor.getString(1));
                dbCursor.moveToNext();
            }


            dbCursor.close();
            db.close();
            listView.setAdapter(adapter);



        }
        catch(Exception e)
        {
            Log.d("Check",e.toString());
        }

    }
    public void setSQLLite()
    {
        try{
        SQLiteDatabase db = _sqlHelper.getWritableDatabase();
        for(int i =0; i<1; i++)
        {
            db.execSQL("INSERT INTO mytable (name,score)VALUES('ES','8394')");
            db.execSQL("INSERT INTO mytable (name,score)VALUES('JW','3043')");
            db.execSQL("INSERT INTO mytable (name,score)VALUES('DM','2343')");
            db.execSQL("INSERT INTO mytable (name,score)VALUES('TA','5734')");
            db.execSQL("INSERT INTO mytable (name,score)VALUES('JC','6745')");

        }
        }
        catch(Exception e)
        {
            Log.d("Check",e.toString());
        }
    }
    public void dropSQLLite()
    {
        try
        {
        SQLiteDatabase db = _sqlHelper.getWritableDatabase();
        db.execSQL("DROP TABLE " + "mytable");
    }
    catch(Exception e)
    {
        Log.d("Check",e.toString());
    }
    }
    public void createSQLLite()
    {
        try {
            SQLiteDatabase db = _sqlHelper.getWritableDatabase();
            db.execSQL("CREATE TABLE IF NOT EXISTS mytable (NAME TEXT, SCORE TEXT);");
        }
        catch(Exception e)
        {
            Log.d("Check",e.toString());
        }


    }



}
