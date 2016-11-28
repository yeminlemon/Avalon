package com.yemin.avalon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView textView = (TextView) findViewById(R.id.textview);
		textView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				view.animate().alpha(0.5f).start();
			}
		});

		Button startBtn = (Button) findViewById(R.id.start_btn);
		startBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this, NewActivity.class);
			 	startActivity(intent);
			}
		});
	}


}
