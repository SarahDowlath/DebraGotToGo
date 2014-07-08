package com.papodec.gottahgo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class Splash extends ActionBarActivity{

	@Override
	protected void onCreate(Bundle Splashbundle) {
		// TODO Auto-generated method stub
		super.onCreate(Splashbundle);
		setContentView(R.layout.splash);
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(5000);	
				} catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openMainActivity = new Intent("com.papodec.gottahgo.MAINACTIVITY");
					startActivity(openMainActivity);
				}
			}
		};
		timer.start();
	}
	
	@Override
	protected void onPause(){
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
