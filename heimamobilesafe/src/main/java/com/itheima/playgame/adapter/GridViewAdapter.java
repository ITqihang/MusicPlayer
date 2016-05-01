package com.itheima.playgame.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.itheima.playgame.bean.GridViewBean;
import com.itheima.playgame.heimamobilesafe.HomeActivity;
import com.itheima.playgame.heimamobilesafe.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/4/17.
 */
public class GridViewAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<GridViewBean> mData;
    public GridViewAdapter(Context context, ArrayList<GridViewBean> mData) {
        this.context=context;
        this.mData=mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context, R.layout.activity_home_gw_item,null);

        GridViewBean data = mData.get(position);
        //获取控件
        ImageView home_image = (ImageView) view.findViewById(R.id.activity_home_iamge);
        TextView home_tv_title = (TextView) view.findViewById(R.id.activity_home_tv_title);
        TextView home_tv_desc = (TextView) view.findViewById(R.id.activity_home_tv_dese);
        //动态修改元素
        home_image.setImageResource(data.getIcon());
        home_tv_title.setText(data.getTitle());
        home_tv_desc.setText(data.getDescription());
        return view;
    }
}
