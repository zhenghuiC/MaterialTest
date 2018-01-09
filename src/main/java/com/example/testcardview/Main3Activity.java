package com.example.testcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.testcardview.adapter.CustomAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        RecyclerView recyclerView =(RecyclerView)findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("测试");
        adapter =new CustomAdapter(this);
        recyclerView.setAdapter(adapter);



        List<String> list =new ArrayList<>();
        for(int i=0;i<50;i++){
            list.add(i+"");
        }
        adapter.setData(list);


    }
}
