package com.lws.ximalaya.ui.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lws.ximalaya.MainActivity;
import com.lws.ximalaya.R;

public class SplashActivity extends AppCompatActivity {
    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            goHome();

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        iniview();

    }
    public void goHome(){
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();

        }
    private void iniview() {
        Handler handler = new Handler();
        handler.postDelayed(mRunnable,2000);

    }
}
