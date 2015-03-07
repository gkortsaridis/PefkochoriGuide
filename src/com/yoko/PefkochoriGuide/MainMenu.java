package com.yoko.PefkochoriGuide;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainMenu extends Activity implements OnClickListener {

	ImageButton hotels, foods, funs, rests, healths;
	String language;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
 
		hotels = (ImageButton) findViewById(R.id.to_hotels);
		foods = (ImageButton) findViewById(R.id.to_foods);
		funs = (ImageButton) findViewById(R.id.to_fun);
		rests = (ImageButton) findViewById(R.id.to_rest);
		healths = (ImageButton) findViewById(R.id.to_health);
		
		hotels.setOnClickListener(this);
		foods.setOnClickListener(this);
		funs.setOnClickListener(this);
		rests.setOnClickListener(this);
		healths.setOnClickListener(this);
		
		setPictures();
		
		
	}


	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		setPictures();
	}
	
	


	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		setPictures();
	}


	@Override
	public void onClick(View v) {
		if(v.getId() ==R.id.to_hotels)
    	{
    		//start see students activity!
    		startActivity(new Intent("HOTELS")); 
    	}
		else if(v.getId() ==R.id.to_foods)
    	{
    		//start see students activity!
    		startActivity(new Intent("FOODS")); 
    	}
		else if(v.getId() ==R.id.to_fun)
    	{
    		//start see students activity!
    		startActivity(new Intent("FUNS")); 
    	}
		else if(v.getId() ==R.id.to_rest)
    	{
    		//start see students activity!
    		startActivity(new Intent("OTHERS")); 
    	}
		else if(v.getId() ==R.id.to_health)
    	{
    		//start see students activity!
    		startActivity(new Intent("HEALTHS")); 
    	}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// TODO Auto-generated method stub
		
		MenuInflater awesome = getMenuInflater();
		awesome.inflate(R.menu.main_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
		// TODO Auto-generated method stub
		
		switch(item.getItemId())
		{
		case R.id.action_settings : 
			startActivity(new Intent("SETTINGS")); 
			return true;
		case R.id.about : 
			startActivity(new Intent("ABOUT")); 
			return true;
				
			
		} 
		
		return super.onOptionsItemSelected(item);
	}
	
	void setPictures()
	{
		//prota diabazo tin glossa
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
	    Editor edit = sp.edit();
	    language = sp.getString("language", "greek");
		
		if(language.equals("greek")) 
		{
			hotels.setBackgroundResource(R.drawable.wherestaygr);
			foods.setBackgroundResource(R.drawable.whateatgr);
			funs.setBackgroundResource(R.drawable.plfungr);
			rests.setBackgroundResource(R.drawable.usfbussgr);
			healths.setBackgroundResource(R.drawable.healthgr);	
		}
		else if(language.equals("english")) 
		{
			hotels.setBackgroundResource(R.drawable.wherestayen);
			foods.setBackgroundResource(R.drawable.whateaten);
			funs.setBackgroundResource(R.drawable.plfunen);
			rests.setBackgroundResource(R.drawable.usfbussen);
			healths.setBackgroundResource(R.drawable.healthen);	
		}
		else if(language.equals("russian")) 
		{
			hotels.setBackgroundResource(R.drawable.wherestayru);
			foods.setBackgroundResource(R.drawable.whateatru);
			funs.setBackgroundResource(R.drawable.plfunru);
			rests.setBackgroundResource(R.drawable.usfbussru);
			healths.setBackgroundResource(R.drawable.healthru);	
		}
		else if(language.equals("serbian")) 
		{
			hotels.setBackgroundResource(R.drawable.wherestaysr);
			foods.setBackgroundResource(R.drawable.whateatsr);
			funs.setBackgroundResource(R.drawable.plfunsr);
			rests.setBackgroundResource(R.drawable.usfbusssr);
			healths.setBackgroundResource(R.drawable.healthsr);	
		}
		
		
	}

	
	
}