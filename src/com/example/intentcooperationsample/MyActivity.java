package com.example.intentcooperationsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends Activity implements OnClickListener{
	
	Button mButtonFinish01;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myactivity);
		
		Intent myIntent = this.getIntent();
		String myValue = myIntent.getStringExtra("MYVALUE");
		Toast.makeText(this, "MyValue:"+myValue, Toast.LENGTH_LONG).show();

		mButtonFinish01 = (Button) findViewById(R.id.ButtonFinish01);
		mButtonFinish01.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		if(v.equals(mButtonFinish01)){
			
			Intent myIntent = new Intent();
			myIntent.putExtra("RESULT", "result of Intent");
			
			setResult(1, myIntent); 
            this.finish(); 
		}
	}
}