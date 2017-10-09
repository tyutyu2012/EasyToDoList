package com.example.tongyu.testtodo;

import android.provider.BaseColumns;

/**
 * Created by tongyu on 9/30/17.
 */

public class Task
{
    public static final String DB_NAME = "Name";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns
    {
        public static final String TABLE = "task";
        public static final String COL_TASK_TITLE = "title";
    }
}
