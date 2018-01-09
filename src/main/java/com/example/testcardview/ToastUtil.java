package com.example.testcardview;

import android.content.Context;
import android.widget.Toast;

/**
 * 创建人 16925
 * 时间  2018/1/9.
 * 类描述 ：定义一个公共输出Toast的方法
 */

public class ToastUtil {
    public static void showToast(String content){
        Toast.makeText(MyApplication.getContext(), content, Toast.LENGTH_SHORT).show();
    }
}
