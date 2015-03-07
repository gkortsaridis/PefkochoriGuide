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

public class funs extends Activity implements OnClickListener{

	String language;
	ImageButton sushi , nono , fiki;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.funs_activity);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		sushi = (ImageButton)findViewById(R.id.sushi);
		nono = (ImageButton)findViewById(R.id.nono);
		fiki = (ImageButton)findViewById(R.id.fiki);
		sushi.setOnClickListener(this);
		nono.setOnClickListener(this);
		fiki.setOnClickListener(this); 
	
		setPictures();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v.getId() == R.id.sushi)
		{
			startActivity(new Intent("SUSHI"));
		}
		else if(v.getId() == R.id.nono)
		{
			startActivity(new Intent("NONO"));
		}
		else if(v.getId() == R.id.fiki)
		{
			startActivity(new Intent("FIKI"));
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
			sushi.setBackgroundResource(R.drawable.sushi_gr_en);
			nono.setBackgroundResource(R.drawable.nono_gr_en);
			fiki.setBackgroundResource(R.drawable.fiki_gr_en);
		}
		else
		{
			//edo kai ta 3 koubia einai idia alla ta ksanabazo opos kai na exei
			sushi.setBackgroundResource(R.drawable.sushi_gr_en);
			nono.setBackgroundResource(R.drawable.nono_gr_en);
			fiki.setBackgroundResource(R.drawable.fiki_gr_en);			
		}
	}
		
		
}
