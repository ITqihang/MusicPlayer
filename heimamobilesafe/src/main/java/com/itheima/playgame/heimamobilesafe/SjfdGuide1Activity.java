package com.itheima.playgame.heimamobilesafe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016/4/17.
 */
public class SjfdGuide1Activity extends SjfdGuideBaseActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sjfd_guide1);
        Button next = (Button) findViewById(R.id.sjfd_guide1_next);
        next.setOnClickListener(this);
    }

    @Override
    public Class<? extends SjfdGuideBaseActivity> getPre() {
        return null;
    }

    @Override
    public Class<? extends SjfdGuideBaseActivity> getNext() {
        return null;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.setClass(SjfdGuide1Activity.this,SjfdGuide2Activity.class);
        startActivity(intent);
    }
}
