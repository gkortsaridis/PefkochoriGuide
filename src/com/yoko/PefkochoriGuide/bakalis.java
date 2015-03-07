package com.yoko.PefkochoriGuide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
public class bakalis extends Activity implements OnClickListener{
	String language;
	ImageButton phone , location , web;
	ImageView bakalis_1 , bakalis_2 , bakalis_3 , bakalis_4 , bakalis_5 , bakalis_6 , bakalis_7 ;
	TextView text;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bakalis_activity);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		bakalis_1 = (ImageView)findViewById(R.id.imageView1);
		bakalis_2 = (ImageView)findViewById(R.id.imageView2);
		bakalis_3 = (ImageView)findViewById(R.id.imageView3);
		bakalis_4 = (ImageView)findViewById(R.id.imageView4);
		bakalis_5 = (ImageView)findViewById(R.id.imageView5);
		bakalis_6 = (ImageView)findViewById(R.id.imageView6);
		bakalis_7 = (ImageView)findViewById(R.id.imageView7);
		bakalis_1.setOnClickListener(this);
	    bakalis_2.setOnClickListener(this);
		bakalis_3.setOnClickListener(this);
		bakalis_4.setOnClickListener(this);
		bakalis_5.setOnClickListener(this);
		bakalis_6.setOnClickListener(this);
		bakalis_7.setOnClickListener(this);
		
		text  = (TextView)findViewById(R.id.TextView01);
		phone = (ImageButton)findViewById(R.id.phone_button);
		location  = (ImageButton)findViewById(R.id.map_button);
		web   = (ImageButton)findViewById(R.id.web_button);
		location.setOnClickListener(this);
		phone.setOnClickListener(this);
		web.setOnClickListener(this); 
		
		//prota diabazo tin glossa
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
	    Editor edit = sp.edit();
	    language = sp.getString("language", "greek");
	    if(language.equals("greek"))   text.setText(R.string.bakalis_gr);
   else if(language.equals("english")) text.setText(R.string.bakalis_en);
   else if(language.equals("serbian")) text.setText(R.string.bakalis_sr);	    
   else if(language.equals("russian")) text.setText(R.string.bakalis_ru);				

        
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		//Elegxei poia apo ta 3 koubia patithikan
		if(v.getId()==R.id.map_button)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "bakalis");
		    edit.putString("Number" , "0");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.web_button)
		{
			Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
            myWebLink.setData(Uri.parse("https://www.facebook.com/BakalisRestaurant"));
            startActivity(myWebLink);
		}
		else if(v.getId()==R.id.phone_button)
		{
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:2374063060"));
			callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
			startActivity(callIntent);
		}
		
		//elegxei poia foto patithike sto scrollview
		if(v.getId()==R.id.imageView1)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "bakalis");
		    edit.putString("Number" , "1");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView2)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "bakalis");
		    edit.putString("Number" , "2");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView3)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "bakalis");
		    edit.putString("Number" , "3");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView4)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "bakalis");
		    edit.putString("Number" , "4");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView5)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "bakalis");
		    edit.putString("Number" , "5");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView6)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "bakalis");
		    edit.putString("Number" , "6");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView7)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "bakalis");
		    edit.putString("Number" , "7");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		
	}
	
	 protected void sendEmail() {
	      Log.i("Send email", "");

	      String[] TO = {"yoko.4.life@gmail.com"};
	      Intent emailIntent = new Intent(Intent.ACTION_SEND);
	      emailIntent.setData(Uri.parse("mailto:"));
	      emailIntent.setType("text/plain");


	      emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
	      emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
	      emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");

	      try {
	         startActivity(Intent.createChooser(emailIntent, "Send mail..."));
	         finish();
	         Log.i("Finished sending email...", "");
	      } catch (android.content.ActivityNotFoundException ex) {
	         Toast.makeText(bakalis.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
	      }
	   }
	

}
