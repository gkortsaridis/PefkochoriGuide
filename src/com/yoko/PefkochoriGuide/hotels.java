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
import android.widget.Button;
import android.widget.ImageButton;

public class hotels extends Activity implements OnClickListener{
	
	String language;
	ImageButton filomeni , fouli , lesse;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotels_activity);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		filomeni = (ImageButton) findViewById(R.id.to_filomeni);
		fouli    = (ImageButton)findViewById(R.id.to_fouli);
		lesse    = (ImageButton)findViewById(R.id.to_lesse);
		
		filomeni.setOnClickListener(this);
		fouli.setOnClickListener(this);
		lesse.setOnClickListener(this);
		
		setPictures();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.to_filomeni)
		{
			startActivity(new Intent("FILOMENI")); 
		}
		else if(v.getId()==R.id.to_fouli)
		{
			startActivity(new Intent("FOULI")); 
		}
		else if(v.getId()==R.id.to_lesse)
		{
			startActivity(new Intent("LESSE")); 
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
			fouli.setBackgroundResource(R.drawable.fouli_gr);
			filomeni.setBackgroundResource(R.drawable.filomeni_gr);
			lesse.setBackgroundResource(R.drawable.lesse_gr);
		}
		else
		{
			fouli.setBackgroundResource(R.drawable.fouli_en);
			filomeni.setBackgroundResource(R.drawable.filomeni_en);
			lesse.setBackgroundResource(R.drawable.lesse_en);			
		}
	}

}
