package com.example.juxtaposition;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;


public class Welcome extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
	}
public void a(View v)
{
	Intent abc= new Intent(this,Login.class);
	startActivity(abc);
}
@Override
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	finish();
}


}
