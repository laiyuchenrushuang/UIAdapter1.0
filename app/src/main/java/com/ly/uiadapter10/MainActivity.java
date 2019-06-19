package com.ly.uiadapter10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.ly.uiadapter10.utils.AppUtils;
import com.ly.uiadapter10.utils.UiUtils;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        UiUtils.setOrientation(this, AppUtils.HEIGHT);
        setContentView(R.layout.activity_main);
    }
}
