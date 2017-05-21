package com.example.canta.project3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by canta on 5/21/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "gameos.db";
    public static final String TABLE_NAME = "quickquiz_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "TOPIC";
    public static final String COL_3 = "NUMBER";
    public static final String COL_4 = "QUESTION";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,TOPIC TEXT,NUMBER INTEGER, QUESTION TEXT UNIQUE)" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData (String topic, int number, String question){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,topic);
        contentValues.put(COL_3,number);
        contentValues.put(COL_4,question);
        long result = db.insert(TABLE_NAME,null,contentValues);
        if(result == -1){
            return false;
        }else{
            Log.d("databaseInsert", "insertData: " + question);
            return true;
        }


    }

    public Cursor getData(String cat, int num){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor result = db.rawQuery("SELECT FROM " + TABLE_NAME + " WHERE ")
    }
}
