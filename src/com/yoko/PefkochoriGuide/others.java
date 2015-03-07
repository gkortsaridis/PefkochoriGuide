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

public class others extends Activity implements OnClickListener{
	String language;
	ImageButton ofthalmos , memories , fishspa , vlachos , xatzis , photospeed , tobacco;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.others_activity);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		ofthalmos  = (ImageButton)findViewById(R.id.to_ofthalmos);
		memories   = (ImageButton)findViewById(R.id.to_memories);
		fishspa    = (ImageButton)findViewById(R.id.to_fishspa);
		vlachos    = (ImageButton)findViewById(R.id.to_vlachos);
		xatzis     = (ImageButton)findViewById(R.id.to_xatzis);
		photospeed = (ImageButton)findViewById(R.id.to_photospeed);
		tobacco    = (ImageButton)findViewById(R.id.to_tobacco);
		ofthalmos.setOnClickListener(this);
		memories.setOnClickListener(this);
		fishspa.setOnClickListener(this);
		vlachos.setOnClickListener(this);
		xatzis.setOnClickListener(this);
		photospeed.setOnClickListener(this);
		tobacco.setOnClickListener(this);
		
		setPictures();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v.getId() == R.id.to_ofthalmos)
		{
			startActivity(new Intent("OFTHALMOS"));
		}
		else if(v.getId() == R.id.to_memories)
		{
			startActivity(new Intent("MEMORIES"));
		}
		else if(v.getId() == R.id.to_fishspa)
		{
			startActivity(new Intent("FISHSPA"));
		}
		else if(v.getId() == R.id.to_vlachos)
		{
			startActivity(new Intent("VLACHOS"));
		}
		else if(v.getId() == R.id.to_xatzis)
		{
			startActivity(new Intent("XATZIS"));
		}
		else if(v.getId() == R.id.to_photospeed)
		{
			startActivity(new Intent("PHOTOSPEED"));
		}
		if(v.getId() == R.id.to_tobacco)
		{
			startActivity(new Intent("TOBACCO"));
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
			ofthalmos.setBackgroundResource(R.drawable.ofthalmos_gr);
			memories.setBackgroundResource(R.drawable.memories_gr);
			fishspa.setBackgroundResource(R.drawable.fishspa_gr_en);
			vlachos.setBackgroundResource(R.drawable.vlachos_gr);
			xatzis.setBackgroundResource(R.drawable.xatzis_gr);
			photospeed.setBackgroundResource(R.drawable.photospeed_gr_en);
			tobacco.setBackgroundResource(R.drawable.tobacco_gr_en);
		}
		else
		{
			ofthalmos.setBackgroundResource(R.drawable.ofthalmos_en);
			memories.setBackgroundResource(R.drawable.memories_en);
			fishspa.setBackgroundResource(R.drawable.fishspa_gr_en);
			vlachos.setBackgroundResource(R.drawable.vlachos_en);
			xatzis.setBackgroundResource(R.drawable.xatzis_en);
			photospeed.setBackgroundResource(R.drawable.photospeed_gr_en);
			tobacco.setBackgroundResource(R.drawable.tobacco_gr_en);
		}
	}

}