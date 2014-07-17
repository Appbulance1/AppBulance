package com.example.mytest;

import com.example.mytest.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class First extends Activity{
	
	Button yo;
	TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.firstview);
		
		yo = (Button) findViewById(R.id.button1);
		tv = (TextView) findViewById(R.id.textView1);
		
		
		
		yo.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_orta = new Intent(First.this, Second.class);
				intent_orta.putExtra("cat", "test");
				startActivity(intent_orta);
			
				tv.setText("Test test");
			}
		});
}

}
