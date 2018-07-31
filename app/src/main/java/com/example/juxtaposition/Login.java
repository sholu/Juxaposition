package com.example.juxtaposition;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;

public class Login extends Activity {

	EditText e1, e2;
	SQL sq;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		e1 = (EditText) findViewById(R.id.editText1);
		e2 = (EditText) findViewById(R.id.editText2);
		sq = new SQL(Login.this);
	}

	public void a(View v) {
		String a = e1.getText().toString();
		String b = e2.getText().toString();
		Cursor cu = sq.getinfo();
		cu.moveToFirst();
		boolean login = false;
		do {
			if (a.equals(cu.getString(0)) && b.equals(cu.getString(1))) {
				login = true;
			}

		} while (cu.moveToNext());
		if (login) {
			Intent abc = new Intent(this, Homepage.class);
			startActivity(abc);
		}

	}

	public void b(View v) {
		Intent a = new Intent(this, Newuser.class);
		startActivity(a);

	}
@Override
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	finish();
}
}
