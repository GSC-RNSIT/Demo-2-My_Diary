package com.example.demo_2;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	static final String KEY = "com.example.demo_2.MESSAGE";
	private EditText editText;
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editText=(EditText) findViewById(R.id.editText1);
		textView=(TextView) findViewById(R.id.textView1);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Context context=getApplicationContext();
			CharSequence text="Sorry, no settings available!";
			int duration=Toast.LENGTH_SHORT;
			
			Toast toast=Toast.makeText(context, text, duration);
			toast.show();
			return true;
		}
		else if (id==R.id.action_send){
			
			String textMessage=editText.getText().toString();
			if (textMessage.length()!=0){
				Intent intent=new Intent(this,Send.class);
				intent.putExtra(KEY,textMessage);
				startActivity(intent); 
			}
			else {
				Toast toast=Toast.makeText(this, "Sorry, enter some text first!", Toast.LENGTH_SHORT);
			    toast.show();
			}
		
			
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
