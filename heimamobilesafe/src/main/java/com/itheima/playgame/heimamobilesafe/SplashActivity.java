package com.itheima.playgame.heimamobilesafe;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/4/15.
 */
public class SplashActivity extends Activity {

    private Handler handler = new Handler(){

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
            //初始化数据库
            initDataBase();
            gotoHomePage();
        }
    private void initDataBase() {
        //读取asserts中的数据库文件
        try {
            AssetManager assets = getAssets();
            InputStream is = assets.open("address.db");
            //InputStream is = SplashActivity.this.getClass().getClassLoader().getResourceAsStream("assets/"+"address.db");
            //获取file文件路径
            File filesDir = getFilesDir();
            File file = new File(filesDir, "address.db");
            //创建输出流写入到文件
            FileOutputStream fos = new FileOutputStream(file);
            //频繁的读写数据
            int len = -1;
            byte[] by = new byte[1024];
            while((len = is.read(by))!=-1){
                fos.write(by,0,len);
            }
            Toast.makeText(this,"初始化完成！",Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void gotoHomePage() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(SplashActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        }, 1500);

    }
}
