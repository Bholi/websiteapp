package com.bholi.pcworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webView);
        String url = "https://techbholi.blogspot.com/";
        webView.loadUrl(url);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setAllowContentAccess(true);

    }

    @Override
    public void onBackPressed(){
        if (webView.canGoBack())
        {
            webView.canGoBack();
        }
        else {
            super.onBackPressed();
        }
    }

}