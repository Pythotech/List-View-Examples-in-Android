package com.example.baseadapter_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String data[]={"AJAY","HARJINDER","MANISH JOSHI","VIJAY","RUPAL GUPTA","MANISH JOSHI","VIJAY","RAJA","ROHIT","MANISH JOSHI","VIJAY",
            "AJAY"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView view=findViewById(R.id.List);
        Baseadapter baseadapter=new Baseadapter(data,MainActivity.this);
        view.setAdapter(baseadapter);
    }
}