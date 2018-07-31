package com.example.juxtaposition;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class Homepage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_homepage);
	}

	public void a(View v) {
		Intent i = new Intent(this, Toothpaste.class);
		startActivity(i);
	}

	public void b(View v) {
		Intent i = new Intent(this, Perfumes.class);
		startActivity(i);
	}

	public void c(View v) {
		Intent i = new Intent(this, Hairoil.class);
		startActivity(i);
	}

	public void d(View v) {
		Intent i = new Intent(this, Soaps.class);
		startActivity(i);

	}

	public void e(View v) {
		Intent i = new Intent(this, Sampoo.class);
		startActivity(i);
		
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}
