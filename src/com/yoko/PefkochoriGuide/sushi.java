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

public class sushi extends Activity implements OnClickListener{
	String language;
	TextView text;
	
	ImageView image_view;
	ImageButton phone , map , web;
	ImageView sushi_1 , sushi_2 , sushi_3 , sushi_4 , sushi_5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sushi_activity);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		sushi_1 = (ImageView)findViewById(R.id.imageView1);
		sushi_2 = (ImageView)findViewById(R.id.imageView2);
		sushi_3 = (ImageView)findViewById(R.id.imageView3);
		sushi_4 = (ImageView)findViewById(R.id.imageView4);
		sushi_5 = (ImageView)findViewById(R.id.imageView5);
		sushi_1.setOnClickListener(this);
		sushi_2.setOnClickListener(this);
		sushi_3.setOnClickListener(this);
		sushi_4.setOnClickListener(this);
		sushi_5.setOnClickListener(this);
		
		
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
		if(language.equals("greek"))   text.setText(R.string.sushi_gr);
   else if(language.equals("english")) text.setText(R.string.sushi_en);
   else if(language.equals("serbian")) text.setText(R.string.sushi_sr);	    
   else if(language.equals("russian")) text.setText(R.string.sushi_ru);        
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		//Elegxei poia apo ta 3 koubia patithikan
		if(v.getId()==R.id.map_button)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "sushi");
		    edit.putString("Number" , "0");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.web_button)
		{
			Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
            myWebLink.setData(Uri.parse("https://www.facebook.com/sushibar.cafe"));
            startActivity(myWebLink);
		}
		else if(v.getId()==R.id.phone_button)
		{
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:6977332021"));
			callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
			startActivity(callIntent);
		}
		
		//elegxei poia foto patithike sto scrollview
		if(v.getId()==R.id.imageView1)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "sushi");
		    edit.putString("Number" , "1");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView2)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "sushi");
		    edit.putString("Number" , "2");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView3)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "sushi");
		    edit.putString("Number" , "3");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView4)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "sushi");
		    edit.putString("Number" , "4");
		    edit.commit();
		    startActivity(new Intent("FULLSCREEN"));
		}
		else if(v.getId()==R.id.imageView5)
		{
			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		    Editor edit = sp.edit();
		    edit.putString("Bussiness" , "sushi");
		    edit.putString("Number" , "5");
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
	         Toast.makeText(sushi.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
	      }
	   }
	

}
