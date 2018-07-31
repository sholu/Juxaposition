package com.example.juxtaposition;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import android.database.sqlite.SQLiteOpenHelper;

public class sql1 {
	Context c;
	SQLiteDatabase s;
	srijan sr;

	String d_name = "data_name1";
	String table = "table_name";
	int version = 1;

	String s_no = "s_no";
	String comment = "comment";

	public sql1(Review1 review1) {
		// TODO Auto-generated constructor stub
		c = review1;

	}

	public sql1(Sampoo sampoo) {
		// TODO Auto-generated constructor stub
		c = sampoo;
	}

	public class srijan extends SQLiteOpenHelper {

		public srijan(Context context) {
			super(context, d_name, null, version);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase arg0) {
			// TODO Auto-generated method stub
			String abc = "CREATE TABLE " + table + " ( " + s_no
					+ " INTEGER PRIMARY KEY AUTOINCREMENT, " + comment
					+ " TEXT NOT NULL );";
			arg0.execSQL(abc);

		}

		@Override
		public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
			arg0.execSQL("drop table" + table);
			onCreate(arg0);
			// TODO Auto-generated method stub

		}
	}

	public void open() {
		// TODO Auto-generated method stub
		sr = new srijan(c);
		s = sr.getWritableDatabase();

	}

	public void savemydata(String a) {
		// TODO Auto-generated method stub
		ContentValues values = new ContentValues();
		values.put(comment, a);
		s.insert(table, null, values);

	}

	public void close() {
		// TODO Auto-generated method stub
		s.close();

	}

	public String view() {
		// TODO Auto-generated method stub
		String st = "";
		String[] columns = { s_no, comment };
		Cursor cu = s.query(table, columns, null, null, null, null, null);

		cu.moveToFirst();
		int snum = cu.getColumnIndex(s_no);
		int na = cu.getColumnIndex(comment);

		for (cu.moveToFirst(); !cu.isAfterLast(); cu.moveToNext()) {
			st = st + cu.getString(snum) + "" + cu.getString(na) + "" + "\n";
		}
		return st;
	}

}
