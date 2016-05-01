package com.itheima.playgame.db;

import android.content.Context;
import android.database.sqlite.SQLiteQuery;

import java.io.File;

/**
 * Created by Administrator on 2016/4/26.
 */
public class NumberRegionDao {

    private Context context;
    public NumberRegionDao(Context context){
        this.context=context;
    }
    public void Query(String number){
        //读取file文件
        File dest = context.getFilesDir();
        File file = new File(dest, "address.db");

    }
}
