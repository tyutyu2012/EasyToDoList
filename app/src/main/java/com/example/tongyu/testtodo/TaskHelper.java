package com.example.tongyu.testtodo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tongyu on 9/30/17.
 */

public class TaskHelper extends SQLiteOpenHelper
{

    public TaskHelper(Context context)
    {
        super(context, Task.DB_NAME, null, Task.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        String createTable = "CREATE TABLE " + Task.TaskEntry.TABLE + " ( " +
                                               Task.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                               Task.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";
        sqLiteDatabase.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISITS " + Task.TaskEntry.TABLE);
        onCreate(sqLiteDatabase);
    }
}
