package com.yoko.PefkochoriGuide;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class settings extends Activity implements OnClickListener{
	ImageButton greek , english , russian , serbian;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings_activity);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		greek = (ImageButton)findViewById(R.id.greek);
		english = (ImageButton)findViewById(R.id.english);
		serbian = (ImageButton)findViewById(R.id.serbian);
		russian = (ImageButton)findViewById(R.id.russian);
		
		greek.setOnClickListener(this);
		english.setOnClickListener(this);
		serbian.setOnClickListener(this);
		russian.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v.getId() == R.id.greek)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("language" , "greek");
		    edit.commit();
		    try {
		        Thread.sleep(500);
			    Toast.makeText(getApplicationContext(), "Language set to GREEK", Toast.LENGTH_LONG).show();
			    finish();
		      } catch (Exception e) {
		        e.getLocalizedMessage();
		      }
		}
		else if(v.getId() == R.id.english)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("language" , "english");
		    edit.commit();
		    try {
		        Thread.sleep(500);
			    Toast.makeText(getApplicationContext(), "Language set to ENGLISH", Toast.LENGTH_LONG).show();
			    finish();
		      } catch (Exception e) {
		        e.getLocalizedMessage();
		      }
		}
		else if(v.getId() == R.id.russian)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("language" , "russian");
		    edit.commit();
		    try {
		        Thread.sleep(500);
			    Toast.makeText(getApplicationContext(), "Language set to RUSSIAN", Toast.LENGTH_LONG).show();
			    finish();
		      } catch (Exception e) {
		        e.getLocalizedMessage();
		      }
		}
		else if(v.getId() == R.id.serbian)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("language" , "serbian");
		    edit.commit();
		    try {
		        Thread.sleep(500);
			    Toast.makeText(getApplicationContext(), "Language set to SERBIAN", Toast.LENGTH_LONG).show();
			    finish();
		      } catch (Exception e) {
		        e.getLocalizedMessage();
		      }
		}
		
	}

}

