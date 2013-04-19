package com.example.intentcooperationsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IntentCooperationSample extends Activity  implements View.OnClickListener {
	
	Button mButton01;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	
		mButton01 = (Button) findViewById(R.id.Button01);
		mButton01.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		if(v.equals(mButton01)){
			Intent selectIntent = new Intent();
			selectIntent.putExtra("MYVALUE", "Value of mine");
			selectIntent.setClassName("com.example.intentcooperationsample",
					"com.example.intentcooperationsample.MyActivity");
			startActivityForResult(selectIntent, 1);
		}
	}
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == 1) {
			String result = data.getStringExtra("RESULT");
			Toast.makeText(this, "Result:"+result, Toast.LENGTH_LONG).show();
	    }
	}
}