package com.it.imagesbrowser;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
	int index=3;
	public void fun(View view) {
		ImageView asd = (ImageView) findViewById(R.id.show_iv);
		int[] imgs = { R.drawable.b1, R.drawable.b2, R.drawable.b3,
				R.drawable.b4, R.drawable.b5, R.drawable.b6 };
		int id = view.getId();
		if (id == R.id.left_btn) {
			System.out.println("left");
			asd.setImageResource(imgs[index]);			
			if(index == 0)
				index = 6;
			index--;
		} else if (id == R.id.right_btn) {
			System.out.println("right");
			asd.setImageResource(imgs[index]);
			if(index == 5)
				index = -1;
			index++;
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
