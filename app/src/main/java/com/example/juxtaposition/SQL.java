package com.example.juxtaposition;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQL {

	public SQL(Login login) {
		// TODO Auto-generated constructor stub
		c = login;
	}

	public SQL(Newuser newuser) {
		// TODO Auto-generated constructor stub
		c=newuser;
	}

	String d_name = "dname";
	String table = "table1";
	int version = 1;
	String s_no = "s_no";
	String username = "username";
	String pass = "password";
	SQLiteDatabase s;
	Context c;
	aayush a;

	public class aayush extends SQLiteOpenHelper {
		public aayush(Context context) {
			super(context, d_name, null, version);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase arg0) {
			// TODO Auto-generated method stub
			 String abc = "CREATE TABLE " + table + " ( " + s_no
	                    + " INTEGER PRIMARY KEY AUTOINCREMENT, " + username
	                    + " TEXT NOT NULL, " + pass + " TEXT NOT NULL );";
	            arg0.execSQL(abc);
	            
	        }

		

		@Override
		public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
			// TODO Auto-generated method stub
			arg0.execSQL("drop table" + table);
            onCreate(arg0);
		}

	}

	public Cursor getinfo() {
		// TODO Auto-generated method stub
		a = new aayush(c);
        s = a.getReadableDatabase();
        String[] columns = { username, pass };
        Cursor CR = s.query(table, columns, null, null, null, null, null);
		return CR;
	}

	public void open() {
		// TODO Auto-generated method stub
		a = new aayush(c);
        s = a.getWritableDatabase();
		
	}

	public void savemydata(String a2, String b) {
		// TODO Auto-generated method stub
		ContentValues values = new ContentValues();
        values.put(username, a2);
        values.put(pass, b);
        s.insert(table, null, values);
		
	}

	public void close() {
		// TODO Auto-generated method stub
		s.close();
		
	}
}
