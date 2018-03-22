package com.example.lenovo.sciencefaculty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by lenovo on 3/22/2018.
 */

public class study extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
        WebView webView = (WebView)findViewById(R.id.web);
        webView.loadUrl(getIntent().getExtras().getString("url"));

    }
}
