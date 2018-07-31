package com.example.juxtaposition;

import android.os.Bundle;


import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.annotation.SuppressLint;
import android.app.Activity;

public class Flipkart extends Activity {
	EditText e1;
	WebView web;

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_flipkart);

		web = (WebView) findViewById(R.id.webView1);
		web.getSettings().setJavaScriptEnabled(true);
		web.setWebViewClient(new WebViewClient() {

			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				// TODO Auto-generated method stub
				web.loadUrl(url);
				e1.setText(url);
				return super.shouldOverrideUrlLoading(view, url);
			}
		});
		web.loadUrl("http://www.flipkart.com/");
	}

	
}
