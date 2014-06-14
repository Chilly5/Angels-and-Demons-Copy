package com.example.angelsanddemons;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.activity_main);
		
		//TextView textView = (TextView) findViewById(R.id.titletext);
		//Typeface q = Typeface.createFromAsset(getAssets(), "myfont.ttf");
		//textView.setTypeface(q);
		
		ImageView title = (ImageView)findViewById(R.id.imageView1);
		AlphaAnimation fadeIn = new AlphaAnimation(0.0f , 1.0f ) ; 
		title.startAnimation(fadeIn);
		fadeIn.setDuration(2000);
		fadeIn.setFillAfter(true);
		
		ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton1);
		imageButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v){
				start_button(v);
			}
		});
		
	}

	
	public void start_button(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, SetupMenu.class);
		startActivity(intent);
		overridePendingTransition(0,0);
	}
}
