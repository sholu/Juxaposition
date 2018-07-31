package com.example.juxtaposition;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;

public class Exit extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exit);
	}

	public void a(View v) {
		Intent i = new Intent(this, Homepage.class);
		startActivity(i);
	}

	public void c(View v) {
		Intent i = new Intent(this, Credits.class);
		startActivity(i);
	}

	public void d(View v) {
		AlertDialog.Builder alert = new AlertDialog.Builder(this);
		alert.setTitle("Exit");
		alert.setMessage("Are you sure you want to exit");
		alert.setIcon(R.drawable.ic_launcher);
		alert.setPositiveButton("Yes", new OnClickListener() {

			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
			finish();

			}
		});
		alert.setNegativeButton("No", new OnClickListener() {

			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub

			}
		});
		alert.show();
	}

	public void b(View v) {
		Intent i = new Intent(this, Flipkart.class);
		startActivity(i);
	}
}
