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

public class healths extends Activity implements OnClickListener{
	String language;
	ImageButton kokkinou;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.healths_activity);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		kokkinou = (ImageButton)findViewById(R.id.kokkinou);
		kokkinou.setOnClickListener(this);
		
		setPictures();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v.getId() == R.id.kokkinou)
		{
			startActivity(new Intent("KOKKINOU"));
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
			kokkinou.setBackgroundResource(R.drawable.kokkinou_gr);
		}
		else
		{
			kokkinou.setBackgroundResource(R.drawable.kokkinou_en);		
		}
	}

}
