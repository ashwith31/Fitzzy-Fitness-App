package com.example.fitnesscapstone.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.fitnesscapstone.R;

public class VidWebViewActivity extends AppCompatActivity {
    WebView web;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vid_web_view);
        progressBar=(ProgressBar)findViewById(R.id.web_progress) ;

        web=(WebView)findViewById(R.id.webv);
        web.setWebViewClient(new WebViewClient());
        web.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                progressBar.setProgress(newProgress);
            }
        });
        web.getSettings().setJavaScriptEnabled(true);
        if(getIntent()!=null){
            web.loadUrl(getIntent().getExtras().getString("vidUrl"));
        }
    }
}
