package com.example.testcardview.adapter;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.testcardview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人 16925
 * 时间  2018/1/9.
 * 类描述 ：
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    Context context;
    LayoutInflater layoutInflater;
    List<String> list =new ArrayList<>();

    public CustomAdapter(Context content){
        this.context =content;
        layoutInflater =LayoutInflater.from(content);
    }

    //设置数据
    public void setData(List<String> llist){
        list =llist;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =layoutInflater.inflate(R.layout.item_recycle,null);
        ViewHolder holder =new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Glide.with(context).load(R.drawable.timg).into(holder.itemImage);
        holder.itemText.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView itemText ;
        ImageView itemImage;
        public ViewHolder(View itemView) {
            super(itemView);
            itemText =(TextView)itemView.findViewById(R.id.item_tv);
            itemImage =(ImageView)itemView.findViewById(R.id.item_img);
        }
    }
}
