package com.example.juxtaposition;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;

public class Sampoo extends Activity {
	sql1 s1;
	String x;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sampoo);
		s1 = new sql1(Sampoo.this);
		
	}

	public void d(View v) {
		Intent i = new Intent(this, Homepage.class);
		startActivity(i);
	}

	public void c(View v) {
		Intent i = new Intent(this, Dove.class);
		startActivity(i);

	}

	public void a(View v) {
		Intent i = new Intent(this, Review1.class);
		startActivity(i);
	}

	public void b(View v) {
		
		s1.open();
		x = s1.view();
		s1.close();
		Dialog d = new Dialog(this);
		d.setTitle("Public Views");
		TextView tv = new TextView(getApplicationContext());
		tv.setText(x);
		d.setContentView(tv);
		d.show();

	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
