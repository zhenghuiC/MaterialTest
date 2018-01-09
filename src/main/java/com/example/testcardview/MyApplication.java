package com.example.testcardview;

import android.app.Application;
import android.content.Context;

/**
 * 创建人 16925
 * 时间  2018/1/9.
 * 类描述 ：
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context =getApplicationContext();
    }

    public static Context getContext(){
        return  context;
    }
}
