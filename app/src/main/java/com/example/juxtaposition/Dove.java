package com.example.juxtaposition;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;


public class Dove extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dove);
	}
	public void d(View v) {
		Intent i = new Intent(this, Sampoo.class);
		startActivity(i);
	}

	public void c(View v) {
		Intent i = new Intent(this, Loreal.class);
		startActivity(i);

	}



}
