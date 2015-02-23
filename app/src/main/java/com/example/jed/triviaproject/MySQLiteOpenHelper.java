package com.example.jed.triviaproject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

public class MySQLiteOpenHelper extends SQLiteOpenHelper {


    private static final String DBNAME = "highscoreDB";
    private static final int DBVERSION =2;
    private static final String TBCRT = "CREATE TABLE mytable (NAME TEXT, SCORE TEXT);";

    public MySQLiteOpenHelper(Context context)
    {
        super(context, DBNAME, null, DBVERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(TBCRT);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion)
    {

    }


}


