package com.ly.uiadapter10;

import android.app.Application;

import com.ly.uiadapter10.utils.UiUtils;

public class MyApplication  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UiUtils.setDensity(this);
    }
}
