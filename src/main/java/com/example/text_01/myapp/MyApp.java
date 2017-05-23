package com.example.text_01.myapp;

import android.app.Application;

import org.xutils.BuildConfig;
import org.xutils.x;

/**
 * Created by wangxiaoxiao on 2017/5/10.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);
    }
}
