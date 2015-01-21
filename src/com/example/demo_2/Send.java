package com.example.demo_2;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Send extends ActionBarActivity {
	
	private TextView textView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_send);
		
		textView=(TextView) findViewById(R.id.textView1);
		Intent intent=getIntent();
		String message=intent.getStringExtra(MainActivity.KEY);
		textView.setText("You just said "+message);
		textView.setTextSize(30);
		
	}
}
