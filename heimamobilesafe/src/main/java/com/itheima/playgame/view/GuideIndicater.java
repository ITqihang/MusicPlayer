package com.itheima.playgame.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.itheima.playgame.heimamobilesafe.R;

/**
 * Created by Administrator on 2016/4/17.
 */
public class GuideIndicater extends LinearLayout{
    public GuideIndicater(Context context) {
        this(context,null);

    }

    public GuideIndicater(Context context, AttributeSet attrs) {
        super(context, attrs);
        //获取读取布局文件的对象
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.GuideIndicater);
        //读取设置的当前页面
        int step = a.getInt(R.styleable.GuideIndicater_step, -1);
        int total = a.getInt(R.styleable.GuideIndicater_total, -1);
        a.recycle();
        //设置布局方向
        setOrientation(LinearLayout.HORIZONTAL);
        //设置图片
        ImageView imageView=null;
        for(int i = 1;i<=total;i++){
            //创建ImageView对象
            imageView = new ImageView(context);
            if(i==step) {
                imageView.setImageResource(android.R.drawable.presence_online);
            }else{
                imageView.setImageResource(android.R.drawable.presence_offline);
            }
            this.addView(imageView);
        }
    }
}
