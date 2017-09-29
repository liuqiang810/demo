package com.rxdemo.liuqiang.rxjavademo.utils;

import android.widget.Toast;
import com.rxdemo.liuqiang.rxjavademo.App;

/**
 * Created by liuqiang on 2017/9/28.
 */
public class ToastUtil {
    public static void toast(String msg){
        Toast.makeText(App.appContext,msg,Toast.LENGTH_SHORT).show();
    }
}
