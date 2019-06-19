package com.ly.uiadapter10;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.ly.uiadapter10.utils.UiUtils;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i("lylog", "BaseActivity");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//全屏显示
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);//没标题栏
        setOrientation();
        super.onCreate(savedInstanceState);
    }

    private void setOrientation() {
        UiUtils.setDefault(BaseActivity.this);
    }
}
