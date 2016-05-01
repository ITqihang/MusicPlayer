package com.itheima.playgame.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.itheima.playgame.heimamobilesafe.R;

/**
 * Created by Administrator on 2016/4/26.
 */
public class SettingItemStyle extends RelativeLayout{

    public SettingItemStyle(Context context) {
        this(context,null);
    }

    public SettingItemStyle(Context context, AttributeSet attrs) {
        super(context, attrs);
        //读取属性值
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.SettingItemView);
        //读取属性值
        String title = a.getString(R.styleable.SettingItemView_titles);
        int i = a.getInt(R.styleable.SettingItemView_bgType, -1);
        //读取开关图片设置情况
        boolean icon = a.getBoolean(R.styleable.SettingItemView_iconSwitch, true);
        if(title==null){
            throw new RuntimeException("必须设置title属性");
        }
        if(i==-1){
            throw new RuntimeException("必须设置bg属性");
        }
        //回收资源
        a.recycle();
        //绑定布局
        View view = View.inflate(context, R.layout.view_setting_item, null);
        this.addView(view);
        //获取控件
        TextView tv_name = (TextView) view.findViewById(R.id.setting_item_tv_name);
        ImageView im_switch = (ImageView) view.findViewById(R.id.setting_item_im_switch);
        tv_name.setText(title);
        //设置开关是否可见
        im_switch.setVisibility(icon?View.VISIBLE:View.INVISIBLE);
        switch (i){
            case 0:
                view.setBackgroundResource(R.drawable.first_normal);
                break;
            case 1:
                view.setBackgroundResource(R.drawable.middle_normal);
                break;
            case 2:
                view.setBackgroundResource(R.drawable.last_normal);
                break;
            default:
                break;
        }
    }
}
