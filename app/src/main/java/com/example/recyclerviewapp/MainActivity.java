package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rView;
    ArrayList<String> des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        des = new ArrayList<String>();
        des.add("Item new 1");
        des.add("Item new 2");
        des.add("Item new 3");
        des.add("Item new 4");
        des.add("Item new 5");

        rView = findViewById(R.id.rView);
        rView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c = new CustomAdapter(des);
        rView.setAdapter(c);


    }
}