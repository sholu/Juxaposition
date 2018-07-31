package com.example.juxtaposition;




import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class Newuser extends Activity {
	EditText e1, e2;
	SQL sq;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_newuser);
		e1=(EditText)findViewById(R.id.editText1);
		e2=(EditText)findViewById(R.id.editText2);
		sq = new SQL(Newuser.this);
	}
	public void a(View v) {
		String a = e1.getText().toString();
		String b = e2.getText().toString();
		sq.open();
		sq.savemydata(a, b);
		sq.close();
		Toast.makeText(this, "Registration Successful", Toast.LENGTH_LONG)
				.show();
		Intent aa = new Intent(this, Login.class);
		startActivity(aa);
	}
}
