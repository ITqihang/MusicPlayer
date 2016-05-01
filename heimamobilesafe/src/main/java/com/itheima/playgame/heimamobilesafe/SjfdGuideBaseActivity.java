package com.itheima.playgame.heimamobilesafe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import static android.view.GestureDetector.*;

/**
 * Created by Administrator on 2016/4/17.
 */
public abstract class SjfdGuideBaseActivity extends Activity{


    private GestureDetectorCompat mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化手势监听器
        //获取起始点坐标
//获取终点坐标
//分别获取XY分别移动了多少
//对移动位置进行判断
//上一步

//下一步

        mDetector = new GestureDetectorCompat(this, new SimpleOnGestureListener(){
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                //获取起始点坐标
                float startX = e1.getRawX();
                float startY = e1.getRawY();
                //获取终点坐标
                float endX = e2.getRawX();
                float endY = e2.getRawY();
                //分别获取XY分别移动了多少
                float distanceX = Math.abs(endX - startX);
                float distanceY = Math.abs(endY - startY);
                //对移动位置进行判断
                if(endX>startX){
                    //上一步
                   toPrePage();
                }else{
                    //下一步
                    toNextPage();
                }
                return false;

            }
        });
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }


    public abstract Class<? extends SjfdGuideBaseActivity> getPre();

    public abstract Class<? extends SjfdGuideBaseActivity> getNext();
    public void toNext(View view){
        toNextPage();
    }
    public void toPre(View view){
        toPrePage();
    }
    public void toNextPage(){
        Class<? extends SjfdGuideBaseActivity> clsPre = getNext();
        Log.w("tag",clsPre+"");
        if(clsPre==null){
            return;
        }
        Intent intent = new Intent(SjfdGuideBaseActivity.this,clsPre);
        startActivity(intent);
    }
    public void toPrePage(){
        Class<? extends SjfdGuideBaseActivity> clsNext = getPre();
        Log.w("tag",clsNext+"");
        if(clsNext==null){
            return;
        }
        Intent intent = new Intent(SjfdGuideBaseActivity.this,clsNext);
        startActivity(intent);
    }
}
