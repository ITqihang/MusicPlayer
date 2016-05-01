package com.itheima.playgame.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/4/14.
 */
public class ContactActivity extends Activity implements AdapterView.OnItemClickListener {

    private ListView lv;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_item);
        //初始化数据
        initData();
        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list));
        lv.setOnItemClickListener(this);
    }

    private void initData() {
        list = new ArrayList<>();
        for(int i = 0;i<50;i++){
            list.add("186060715"+i);
        }
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //获取被点击条目数据
        String num = list.get(position);
        Intent intent = new Intent();
        intent.putExtra("num",num);
        setResult(1,intent);
        finish();
    }
}
