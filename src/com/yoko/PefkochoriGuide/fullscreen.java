package com.yoko.PefkochoriGuide;


import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.Toast;

public class fullscreen extends Activity implements OnGestureListener{
	
	private GestureDetector gDetector;
	ImageView the_image;
    int counter,max;
    String buss;
    String num;
    
    //HOTELS IMAGES
	int filomeni[]  = {R.drawable.filomeni1 , R.drawable.filomeni2 , R.drawable.filomeni3 , R.drawable.filomeni4 , R.drawable.filomeni5 , R.drawable.filomeni6};
	int fouli[]     = {R.drawable.fouli1 , R.drawable.fouli2 , R.drawable.fouli3};
	int lesse[]     = {R.drawable.lesse1 , R.drawable.lesse2 , R.drawable.lesse3 , R.drawable.lesse4};
	
	//FOODS IMAGES
	int bakalis[]   = {R.drawable.bakalis1 , R.drawable.bakalis2 , R.drawable.bakalis3 , R.drawable.bakalis4 , R.drawable.bakalis5 , R.drawable.bakalis6 ,R.drawable.bakalis7};
	
	//FUNS IMAGES
	int sushi[]     = {R.drawable.sushi1 , R.drawable.sushi2 , R.drawable.sushi3 , R.drawable.sushi4 , R.drawable.sushi5};
	int nono[]      = {R.drawable.nono1 , R.drawable.nono2 , R.drawable.nono3};
	int fiki[]      = {R.drawable.fiki1 , R.drawable.fiki2 , R.drawable.fiki3 , R.drawable.fiki4 ,R.drawable.fiki5};
	
	//OTHERS IMAGES
	int ofthalmos[] = { R.drawable.ofthalmos1 , R.drawable.ofthalmos2 , R.drawable.ofthalmos3 , R.drawable.ofthalmos4 , R.drawable.ofthalmos5 ,R.drawable.ofthalmos6 , R.drawable.ofthalmos7 , R.drawable.ofthalmos8 , R.drawable.ofthalmos9 , R.drawable.ofthalmos10 }; 						
	int memories[]  = { R.drawable.memories1 , R.drawable.memories2 , R.drawable.memories3 , R.drawable.memories4 , R.drawable.memories5 , R.drawable.memories6 , R.drawable.memories7 , R.drawable.memories8 , R.drawable.memories9 };
	int fishspa[]   = { R.drawable.fishspa1 , R.drawable.fishspa2 };
	int vlachos[]   = { R.drawable.vlachos1 , R.drawable.vlachos2 ,R.drawable.vlachos3 , R.drawable.vlachos4 , R.drawable.vlachos5 };
	int xatzis[]    = { R.drawable.xatzis1 , R.drawable.xatzis2 , R.drawable.xatzis3 , R.drawable.xatzis4 , R.drawable.xatzis5 };
	int photospeed[]= {R.drawable.photospeed1 , R.drawable.photospeed2 , R.drawable.photospeed3 , R.drawable.photospeed4 , R.drawable.photospeed5 , R.drawable.photospeed6 }; 
	int tobacco[]   = { R.drawable.tobacco1 , R.drawable.tobacco2 , R.drawable.tobacco3 ,R.drawable.tobacco4 };
	
	//HEALTHS IMAGES
	int kokkinou[]  = {R.drawable.kokkinou1 , R.drawable.kokkinou2};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fullscreen);
		the_image = (ImageView)findViewById(R.id.full_image);
		gDetector = new GestureDetector(this);
		
		//prota diabazo poia epixeirisi apothikeutike , kai poia fotografia
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
	    Editor edit = sp.edit();
	    buss = sp.getString("Bussiness", "Unknown");
	    num = sp.getString("Number", "0");
	    if(num.equals("0"))
	    {
		         if(buss.equals("filomeni")) the_image.setImageResource(R.drawable.filomeni_map);
		    else if(buss.equals("fouli"))    the_image.setImageResource(R.drawable.fouli_map);
		    else if(buss.equals("lesse"))    the_image.setImageResource(R.drawable.lesse_map);
		    else if(buss.equals("bakalis"))  the_image.setImageResource(R.drawable.bakalis_map);
		    else if(buss.equals("sushi"))    the_image.setImageResource(R.drawable.sushi_map);
		    else if(buss.equals("nono"))     the_image.setImageResource(R.drawable.nono_map);
		    else if(buss.equals("fiki"))     the_image.setImageResource(R.drawable.fiki_map);	  	    
		    else if(buss.equals("ofthalmos"))the_image.setImageResource(R.drawable.ofthalmos_map);	  
		    else if(buss.equals("memories")) the_image.setImageResource(R.drawable.memories_map);	  	    
		    else if(buss.equals("fishspa"))  the_image.setImageResource(R.drawable.fishspa_map);	  
		    else if(buss.equals("vlachos"))  the_image.setImageResource(R.drawable.vlachos_map);	  
		    else if(buss.equals("xatzis"))   the_image.setImageResource(R.drawable.xatzis_map);	  	 
		    else if(buss.equals("photospeed"))the_image.setImageResource(R.drawable.photospeed_map);	  
		    else if(buss.equals("tobacco"))  the_image.setImageResource(R.drawable.tobacco_map);	
		    else if(buss.equals("kokkinou")) the_image.setImageResource(R.drawable.kokkinou_map);	  	    	
	    }
	    else
	    {
		    //allazo to string tou counter se int
		    try {
		        counter = Integer.parseInt(num);
		    } catch(NumberFormatException nfe) {
		       System.out.println("Could not parse " + nfe);
		    } 
		    //analogos tin epixeirisi orizo ton megisto arithmo fotografion
		    if(buss.equals("fouli")) max = fouli.length;
	   else if(buss.equals("filomeni")) max = filomeni.length;
	   else if(buss.equals("lesse")) max = lesse.length;	  
	   else if(buss.equals("bakalis")) max = bakalis.length;	
	   else if(buss.equals("sushi")) max = sushi.length;
	   else if(buss.equals("nono")) max = nono.length;	
	   else if(buss.equals("fiki")) max = fiki.length;	
	   else if(buss.equals("ofthalmos")) max = ofthalmos.length;	  	    
	   else if(buss.equals("memories")) max = memories.length;	  
	   else if(buss.equals("fishspa")) max = fishspa.length;	  	    
	   else if(buss.equals("vlachos")) max = vlachos.length;	  
	   else if(buss.equals("xatzis")) max = xatzis.length;	  
	   else if(buss.equals("photospeed")) max = photospeed.length;	  
	   else if(buss.equals("tobacco")) max = tobacco.length;	  	    
	   else if(buss.equals("kokkinou")) max = kokkinou.length;	  
		    
		    //kai kalo tin sinartisi pou emfanizei tin eikona
		    showPictures(buss , counter);
	    }
	    
	}

	@Override
	public boolean onFling(MotionEvent start, MotionEvent finish, float xVelocity, float yVelocity) {
	        if (start.getRawX() < finish.getRawX()) {
	        	//Toast.makeText(getApplicationContext(),"PREV PIC!", Toast.LENGTH_SHORT).show();
	        	if(counter >= 2)
	        	{	
	        	counter--;
	        	showPictures(buss , counter);
	        	}
	        } else {
	        	//Toast.makeText(getApplicationContext(),"NEXT PIC!", Toast.LENGTH_SHORT).show();
	        	if(counter < max)
	        	{
	        		counter++;
	        		showPictures(buss , counter);
	        	}
	        	
	        }
	        return true;
	}
	
	
	
	@Override
	public boolean onTouchEvent(MotionEvent me) {
	return gDetector.onTouchEvent(me);
	}

	@Override
	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void showPictures(String bussiness , int cnt)
	{
	    if(bussiness.equals("filomeni")){ the_image.setImageResource(filomeni[cnt-1]); }
   else if(bussiness.equals("fouli"))    the_image.setImageResource(fouli[cnt-1]);
   else if(bussiness.equals("lesse"))    the_image.setImageResource(lesse[cnt-1]);
   else if(bussiness.equals("bakalis"))  the_image.setImageResource(bakalis[cnt-1]);
   else if(bussiness.equals("sushi"))    the_image.setImageResource(sushi[cnt-1]);
   else if(bussiness.equals("nono"))     the_image.setImageResource(nono[cnt-1]);
   else if(bussiness.equals("fiki"))     the_image.setImageResource(fiki[cnt-1]);	  	    
   else if(bussiness.equals("ofthalmos"))the_image.setImageResource(ofthalmos[cnt-1]);	  
   else if(bussiness.equals("memories")) the_image.setImageResource(memories[cnt-1]);	  	    
   else if(bussiness.equals("fishspa"))  the_image.setImageResource(fishspa[cnt-1]);	  
   else if(bussiness.equals("vlachos"))  the_image.setImageResource(vlachos[cnt-1]);	  
   else if(bussiness.equals("xatzis"))   the_image.setImageResource(xatzis[cnt-1]);	  	 
   else if(bussiness.equals("photospeed"))the_image.setImageResource(photospeed[cnt-1]);	  
   else if(bussiness.equals("tobacco"))  the_image.setImageResource(tobacco[cnt-1]);	
   else if(bussiness.equals("kokkinou")) the_image.setImageResource(kokkinou[cnt-1]);	  	    
	}
	
	
}