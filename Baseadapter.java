package com.example.baseadapter_example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Baseadapter extends BaseAdapter {
    String []data;
    Context context;

    public Baseadapter(String[] data, Context context) {
        this.data = data;
        this.context = context;
    }


    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view= LayoutInflater.from(context).inflate(R.layout.list_items,null);
        TextView textView=view.findViewById(R.id.tv);
        Button button=view.findViewById(R.id.bt);
        textView.setText(data[position]);
        button.setText(data[position]);
        return view;
    }
}
