package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.myapplication.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    WebView mywebview = (WebView)findViewById(R.id.view);
    WebSettings mywebsettings = mywebview.getSettings();
    mywebview.loadUrl("file:///android_asset/index.html");
    mywebsettings.setJavaScriptEnabled(true);
    mywebview.setWebViewClient(new WebViewClient());
    
    }

}
