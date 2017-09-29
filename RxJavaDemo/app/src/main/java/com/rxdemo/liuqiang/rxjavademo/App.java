package com.rxdemo.liuqiang.rxjavademo;

import android.app.Application;
import android.content.Context;

/**
 * Created by liuqiang on 2017/9/28.
 */
public class App extends Application{
    public static Context appContext;
    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
    }
}
