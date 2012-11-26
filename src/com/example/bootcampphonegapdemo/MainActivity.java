package com.example.bootcampphonegapdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import org.apache.cordova.*;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//super.loadUrl("file:///android_asset/www/index.htm");
		//super.loadUrl("http://gdg.mx");
		super.loadUrl("http://jquerymobile.com/demos/1.2.0/");
	}

}
