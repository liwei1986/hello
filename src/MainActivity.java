package com.example.activitylannuch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
 private TextView textView;
 private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 textView=(TextView)findViewById(R.id.textView);
		textView.setText(this.toString());
		button=(Button)findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			  Intent intent = new Intent();
			  intent.setClass(MainActivity.this, MainActivity.class);
			  startActivity(intent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
