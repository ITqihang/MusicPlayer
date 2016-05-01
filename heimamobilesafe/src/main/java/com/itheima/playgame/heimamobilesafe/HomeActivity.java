package com.itheima.playgame.heimamobilesafe;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.itheima.playgame.adapter.GridViewAdapter;
import com.itheima.playgame.bean.GridViewBean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/4/15.
 */
public class HomeActivity extends Activity implements AdapterView.OnItemClickListener {

    private ImageView logo;
    private int[] icon;
    private String[] title;
    private String[] description;
    private ArrayList<GridViewBean> mData;
    private GridView home_gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //初始化数据
        initData();
        //初始化控件
        initView();
        //给logo添加动画
        addAnimoteLogo();
        //初始化GridView
        initGridView();
        //设置监听事件
        home_gv.setOnItemClickListener(this);
    }


    private void initData() {
        icon = new int[]{
                R.drawable.sjfd,
                R.drawable.srlj,
                R.drawable.rjgj,
                R.drawable.jcgl,
                R.drawable.lltj,
                R.drawable.sjsd,
                R.drawable.hcql,
                R.drawable.cygj,
        };
        title = new String[]{
                "手机防盗",
                "骚扰拦截",
                "软件管家",
                "进程管理",
                "流量统计",
                "手机杀毒",
                "缓存清理",
                "常用工具",
        };
        description = new String[]{
                "远程定位手机",
                "全面拦截骚扰",
                "管理您的软件",
                "管理正在运行",
                "流量一目了然",
                "病毒无法藏身",
                "系统快如火箭",
                "常用工具大全",
        };
        //将数据添加至集合内
        mData = new ArrayList<GridViewBean>();
        GridViewBean gvb = null;
        for(int i=0;i<icon.length;i++) {
            gvb = new GridViewBean(title[i],description[i],icon[i]);
            mData.add(gvb);
        }

    }


    private void initGridView() {
        GridViewAdapter adapter = new GridViewAdapter(this ,mData);
        home_gv.setAdapter(adapter);
    }
    private void addAnimoteLogo() {
        ObjectAnimator animatot = ObjectAnimator.ofFloat(logo,"rotationY",0,90,180,270,360);
        animatot.setDuration(2000);
        animatot.setRepeatCount(ObjectAnimator.INFINITE);
        animatot.setRepeatMode(ObjectAnimator.REVERSE);
        animatot.start();
       // ObjectAnimator.
    }

    private void initView() {
        logo = (ImageView) findViewById(R.id.home_iv_logo);
        home_gv = (GridView) findViewById(R.id.home_activity_gv);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                handleSjfd();
                break;
            case 7:
                handleCygj();
            default:
                break;
        }
    }

    private void handleCygj() {
        Intent intent = new Intent();
        intent.setClass(this,CommonToolActivity.class);
        startActivity(intent);
    }

    private void handleSjfd() {
        //创建意图
        Intent intent = new Intent();
        intent.setClass(HomeActivity.this,SjfdGuide1Activity.class);
        startActivity(intent);

    }
}
