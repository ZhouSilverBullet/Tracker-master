package com.sxu.trackerlibrary.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/*******************************************************************************
 * Description: 创建保存事件的数据库
 *
 * Author: Freeman
 *
 * Date: 2018/11/26
 *
 * Copyright: all rights reserved by Freeman.
 *******************************************************************************/
public class DatabaseHelper extends SQLiteOpenHelper {

	private final static int DEFAULT_DB_VERSION = 1;
	private final static String DEFAULT_DB_NAME = "event_db";
	public final static String DEFAULT_TABLE_NAME = "event_table";

	public final static String COLUMN_KEY_ID = "id";
	public final static String COLUMN_KEY_TYPE = "type";
	public final static String COLUMN_KEY_PATH = "path";
	public final static String COLUMN_KEY_DURATION = "duration";
	public final static String COLUMN_KEY_EVENT_TIME = "event_time";

	private final String EVENT_SQL = "create table " + DEFAULT_TABLE_NAME + "(" +
			COLUMN_KEY_ID + " integer primary key autoincrement, " +
			COLUMN_KEY_TYPE + " integer, " +
			COLUMN_KEY_PATH + " varchar, " +
			COLUMN_KEY_DURATION + " long, " +
			COLUMN_KEY_EVENT_TIME + " long)";

	public DatabaseHelper(Context context) {
		super(context, DEFAULT_DB_NAME, null, DEFAULT_DB_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase sqLiteDatabase) {
		sqLiteDatabase.execSQL(EVENT_SQL);
	}

	@Override
	public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

	}
}
