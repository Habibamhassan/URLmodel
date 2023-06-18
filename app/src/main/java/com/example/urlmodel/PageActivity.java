package com.example.urlmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class PageActivity extends AppCompatActivity {
    static WebView mWebView;
    static Button forwardBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        mWebView = findViewById(R.id.webView);
        forwardBtn = findViewById(R.id.forwardButton);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        String url = getIntent().getStringExtra("url");
        mWebView.loadUrl(url);
        forwardBtn.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              // Perform action to navigate to the next page within the app
                                              Intent intent = new Intent(PageActivity.this, NextPageActivity.class);
                                              startActivity(intent);
                                          }

                                      }
        );
    }



}