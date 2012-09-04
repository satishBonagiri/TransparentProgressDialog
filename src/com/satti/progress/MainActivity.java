package com.satti.progress;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		showDialog();
	}

	private void showDialog() {
		View view = View.inflate(MainActivity.this, R.layout.dialog, null);

		Dialog dialog = new Dialog(this, R.style.NewDialog);
		dialog.setContentView(view);

		dialog.show();

	}

}
