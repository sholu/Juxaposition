package com.example.juxtaposition;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;


public class Review1 extends Activity {
	EditText e1;
	sql1 s1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_review1);
		e1=(EditText)findViewById(R.id.editText1);
		s1=new sql1(Review1.this);
	}

public void a(View v){
	String a = e1.getText().toString();
	s1.open();
	s1.savemydata(a);
	s1.close();
	Toast.makeText(this,"Thank You", Toast.LENGTH_LONG).show();
	Intent i = new Intent(this,Exit.class);
	startActivity(i);
}
@Override
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	finish();
}

}
