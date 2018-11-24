package com.example.com.rentapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class checkremain extends AppCompatActivity {
    static RentListAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rentlist);
        ArrayList<Rentlistobject> data = new ArrayList<Rentlistobject>();
        data.add(new Rentlistobject("소강당","1"));
        data.add(new Rentlistobject("풋살장","2"));
        data.add(new Rentlistobject("대강당","3"));
        data.add(new Rentlistobject("테니스장","3"));
        adapter=new RentListAdapter(this,R.layout.rentlistitem,data);
        ListView listView = (ListView) findViewById(R.id.rentlistview);
        listView.setAdapter(adapter);
    }
}
