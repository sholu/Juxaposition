package com.example.juxtaposition;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {
MediaPlayer oursong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oursong=MediaPlayer.create(MainActivity.this,R.raw.az);
        oursong.start();
final Intent abc=new Intent(this,Welcome.class);
        
        Thread timer=new Thread(){
        	
        	@Override
        	public void run() {
        		try {
					sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		finally
        		{
        			startActivity(abc);
        		}
        		// TODO Auto-generated method stub
        		super.run();
        	}
        };
        timer.start();
    }
@Override
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	oursong.release();
	finish();
}

    
}
