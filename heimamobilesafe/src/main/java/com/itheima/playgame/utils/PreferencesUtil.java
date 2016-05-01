package com.itheima.playgame.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2016/4/17.
 */
public class PreferencesUtil {

    private static final String FILE_NAME = "config";

    public static boolean getBoolean(Context context, String keyBindsiminfo, boolean defValue) {
        //读取sp中的数据
        SharedPreferences sp = context.getSharedPreferences(FILE_NAME, Context.MODE_APPEND);
        return sp.getBoolean("keyBindsiminfo",defValue);
    }
    public static void putBoolean(Context context, String keyBindsiminfo, boolean value) {
        //将数据写入sp中
        //context.getSharedPreferences();
        SharedPreferences sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean("keyBindsiminfo",value);
        edit.commit();
    }
    public static String getString(Context context, String keyBindsiminfo, String defValue) {
        //读取sp中的数据
        SharedPreferences sp = context.getSharedPreferences(FILE_NAME, Context.MODE_APPEND);
        return sp.getString("keyBindsiminfo",defValue);
    }
    public static void putString(Context context, String keyBindsiminfo, String value) {
        //将数据写入sp中
        //context.getSharedPreferences();
        SharedPreferences sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString("keyBindsiminfo",value);
        edit.commit();
    }
}
