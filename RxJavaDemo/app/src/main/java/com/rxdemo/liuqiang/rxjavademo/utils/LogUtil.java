package com.rxdemo.liuqiang.rxjavademo.utils;

import android.util.Log;
import com.rxdemo.liuqiang.rxjavademo.AppConfig;

/**
 * Created by liuqiang on 2017/9/28.
 */
public class LogUtil {
    public static void e(String msg){
        if(AppConfig.DEBUG){
            Log.e("",msg);
        }
    }
    public static void v(String msg){
        if(AppConfig.DEBUG){
            Log.v("",msg);
        }
    }
}
