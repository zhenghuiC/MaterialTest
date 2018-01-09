package com.example.testcardview;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.CollapsibleActionView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.testcardview.adapter.CustomAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //这段代码演示的是使用recycleView来替换NestedScrollView的滑动折叠效果.
        RecyclerView recyclerView =(RecyclerView)findViewById(R.id.recycle) ;
        CustomAdapter customAdapter =new CustomAdapter(this);
        List<String> list =new ArrayList<>();
        for(int i=0;i<30;i++){
            list.add(i+"");
        }
        customAdapter.setData(list);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(customAdapter);

        //下面的代码是使用NestedScrollView来展示折叠效果
        CollapsingToolbarLayout collapse =(CollapsingToolbarLayout)findViewById(R.id.collapse);
        ImageView imageView =(ImageView)findViewById(R.id.imageView);
        TextView textView =(TextView)findViewById(R.id.textView) ;
        Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar =getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        collapse.setTitle("测试效果");
        //设置要折叠的图片文件
        Glide.with(this).load(R.drawable.timg).into(imageView);

        //设置内容文字
        String content =nameContent();
        textView.setText(content);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private String nameContent(){
        StringBuilder stringBuilder =new StringBuilder();
        for(int i=0;i<500;i++){
            stringBuilder.append("测试");
        }
        return stringBuilder.toString();
    }
}
