package com.itheima.playgame.heimamobilesafe;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2016/4/17.
 */
public class SjfdGuide3Activity extends SjfdGuideBaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sjfd_guide3);
    }

    @Override
    public Class<? extends SjfdGuideBaseActivity> getPre() {
        return SjfdGuide2Activity.class;
    }

    @Override
    public Class<? extends SjfdGuideBaseActivity> getNext() {

        return SjfdGuide4Activity.class;
    }
}
