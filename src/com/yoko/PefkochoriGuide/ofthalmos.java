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

public class ofthalmos extends Activity implements OnClickListener{
	String language;
	TextView text;
	
	ImageView image_view;
	ImageButton phone , map , web;
	ImageView ofthalmos_1 , ofthalmos_2 , ofthalmos_3 , ofthalmos_4 , ofthalmos_5 , ofthalmos_6 , ofthalmos_7 , ofthalmos_8 , ofthalmos_9 , ofthalmos_10 ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ofthalmos_activity);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		ofthalmos_1 = (ImageView)findViewById(R.id.imageView1);
		ofthalmos_2 = (ImageView)findViewById(R.id.imageView2);
		ofthalmos_3 = (ImageView)findViewById(R.id.imageView3);
		ofthalmos_4 = (ImageView)findViewById(R.id.imageView4);
		ofthalmos_5 = (ImageView)findViewById(R.id.imageView5);
		ofthalmos_6 = (ImageView)findViewById(R.id.imageView6);
		ofthalmos_7 = (ImageView)findViewById(R.id.imageView7);
		ofthalmos_8 = (ImageView)findViewById(R.id.imageView8);
		ofthalmos_9 = (ImageView)findViewById(R.id.imageView9);
		ofthalmos_10 = (ImageView)findViewById(R.id.imageView10);
		ofthalmos_1.setOnClickListener(this);
	    ofthalmos_2.setOnClickListener(this);
		ofthalmos_3.setOnClickListener(this);
		ofthalmos_4.setOnClickListener(this);
		ofthalmos_5.setOnClickListener(this);
		ofthalmos_6.setOnClickListener(this);
		ofthalmos_7.setOnClickListener(this);
		ofthalmos_8.setOnClickListener(this);
		ofthalmos_9.setOnClickListener(this);
		ofthalmos_10.setOnClickListener(this);
		
		phone = (ImageButton)findViewById(R.id.phone_button);
		map  = (ImageButton)findViewById(R.id.map_button);
		web   = (ImageButton)findViewById(R.id.web_button);
		map.setOnClickListener(this);
		phone.setOnClickListener(this);
		web.setOnClickListener(this); 

		//prota diabazo tin glossa
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
	    Editor edit = sp.edit();
		text  = (TextView)findViewById(R.id.TextView01);
		language = sp.getString("language", "greek");
		if(language.equals("greek"))   text.setText(R.string.ofthalmos_gr);
   else if(language.equals("english")) text.setText(R.string.ofthalmos_en);
   else if(language.equals("serbian")) text.setText(R.string.ofthalmos_sr);	    
   else if(language.equals("russian")) text.setText(R.string.ofthalmos_ru);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		//Elegxei poia apo ta 3 koubia patithikan
		if(v.getId()==R.id.map_button)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "ofthalmos");
		    edit.putString("Number" , "0");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.web_button)
		{
			Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
            myWebLink.setData(Uri.parse("http://ofthalmos.gr/page/default.asp?id=3&la=1"));
            startActivity(myWebLink);
		}
		else if(v.getId()==R.id.phone_button)
		{
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:2374063622"));
			callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
			startActivity(callIntent);
		}
		
		//elegxei poia foto patithike sto scrollview
		if(v.getId()==R.id.imageView1)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "ofthalmos");
		    edit.putString("Number" , "1");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView2)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "ofthalmos");
		    edit.putString("Number" , "2");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView3)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "ofthalmos");
		    edit.putString("Number" , "3");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView4)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "ofthalmos");
		    edit.putString("Number" , "4");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView5)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "ofthalmos");
		    edit.putString("Number" , "5");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView6)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "ofthalmos");
		    edit.putString("Number" , "6");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView7)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "ofthalmos");
		    edit.putString("Number" , "7");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView8)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "ofthalmos");
		    edit.putString("Number" , "8");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView9)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "ofthalmos");
		    edit.putString("Number" , "9");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView10)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "ofthalmos");
		    edit.putString("Number" , "10");
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
	         Toast.makeText(ofthalmos.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
	      }
	   }
	

}
