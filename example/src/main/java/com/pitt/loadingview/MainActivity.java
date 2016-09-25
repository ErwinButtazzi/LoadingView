package com.pitt.loadingview;

import android.app.Activity;
import android.os.Bundle;

import com.pitt.loadingview.library.LoadingView;

public class MainActivity extends Activity {
    LoadingView loadingView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadingView = (LoadingView) findViewById(R.id.lv);
    }
}
