package com.itheima.playgame.heimamobilesafe;

import android.os.Bundle;

/**
 * Created by Administrator on 2016/4/17.
 */
public class SjfdGuide5Activity extends SjfdGuideBaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sjfd_guide5);
    }

    @Override
    public Class<? extends SjfdGuideBaseActivity> getPre() {

        return SjfdGuide4Activity.class;
    }

    @Override
    public Class<? extends SjfdGuideBaseActivity> getNext() {

        return null;
    }
}
