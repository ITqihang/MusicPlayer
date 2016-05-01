package com.itheima.playgame.mymusicplayer;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SplashActivity extends AppCompatActivity {

    Handler handler = new Handler(){

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        gotoHomePage();
    }

    private void gotoHomePage() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(SplashActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        },1500);
    }
}
