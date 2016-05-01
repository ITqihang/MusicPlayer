package com.itheima.playgame.mymusicplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016/4/29.
 */
public class HomeActivity extends Activity implements View.OnClickListener {

    private Button mPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home);
            //初始化控件
        initView();
    }

    private void initView() {
        mPlay = (Button) findViewById(R.id.home_butt_play);
        //设置点击事件
        mPlay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        MediaPlayer player = MediaPlayer.create(this, R.raw.jiangnan);
        player.start();
        //player.setAudioStreamType();
    }
}
