package com.itheima.playgame.heimamobilesafe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.ImageView;

import com.itheima.playgame.utils.Constants;
import com.itheima.playgame.utils.PreferencesUtil;

import static com.itheima.playgame.utils.PreferencesUtil.*;

/**
 * Created by Administrator on 2016/4/17.
 */
public class SjfdGuide2Activity extends SjfdGuideBaseActivity{

    private String simInfo;
    private ImageView iv_lock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sjfd_guide2);
        //初始化控件
       initView();
    }

    private void initView() {
        iv_lock = (ImageView) findViewById(R.id.sjfd_guide2_iv_lock);
    }

    @Override
    public Class<? extends SjfdGuideBaseActivity> getPre() {
        return SjfdGuide1Activity.class;
    }
    @Override
    public Class<? extends SjfdGuideBaseActivity> getNext() {
        return SjfdGuide3Activity.class;
    }

   //设置点击事件
    public void BindSIM(View view){
        simInfo = PreferencesUtil.getString(this, Constants.KEY_BINDSIMINFO,null);
        //对获取的结果进行判断
        if(simInfo!=null){
            //如果之前是绑定的，则不需要处理
            return;
        }else{
            //如果没有绑定则读取SIM卡信息
            TelephonyManager tmanger = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
            simInfo = tmanger.getSimSerialNumber();
            //将读取到的数据存入sp中
            PreferencesUtil.putString(this,Constants.KEY_BINDSIMINFO,simInfo);
            iv_lock.setImageResource(R.drawable.lock);
        }
    }

}
