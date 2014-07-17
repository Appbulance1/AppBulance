package com.example.mytest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Second extends Activity{

	Context appContext;
    Intent sender;
    String sended;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.secondview);
        
        appContext = this.getApplicationContext();
        sender=getIntent();
        sended=sender.getExtras().getString("cat");
        
        String[] arr={"One","Two","Three"};
        ListView listView = (ListView) findViewById(R.id.listView1);
        
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
          android.R.layout.simple_list_item_1, android.R.id.text1, arr);
        
     // Assign adapter to ListView
        listView.setAdapter(adapter); 
        
        // ListView Item Click Listener
        listView.setOnItemClickListener(new OnItemClickListener() {

              @Override
              public void onItemClick(AdapterView<?> parent, View view,
                 int position, long id) {
            	  
              }
        });
}
}


