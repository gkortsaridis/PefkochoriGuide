package com.yoko.PefkochoriGuide;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class foods extends Activity implements OnClickListener{
	String language;
	ImageButton bakalis;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.foods_activity);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		bakalis = (ImageButton)findViewById(R.id.bakalis);
		bakalis.setOnClickListener(this);
		
		setPictures();
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v.getId() == R.id.bakalis)
		{
			startActivity(new Intent("BAKALIS"));
		}
		
	}
	
	
	void setPictures()
	{
		//prota diabazo tin glossa
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
	    Editor edit = sp.edit();
	    language = sp.getString("language", "greek");
		

		if(language.equals("greek")) 
		{
			bakalis.setBackgroundResource(R.drawable.bakalis_gr);
		}
		else
		{
			bakalis.setBackgroundResource(R.drawable.bakalis_en);			
		}
	}

}

