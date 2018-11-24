package com.example.com.rentapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by com on 2018-11-11.
 */

public class RentList extends AppCompatActivity {
    static RentListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rentlist);
        ArrayList<Rentlistobject> data = new ArrayList<Rentlistobject>();
        data.add(new Rentlistobject("강의실 사용 신청서","1"));
        data.add(new Rentlistobject("학생 야간 잔류 신청서","2"));
        data.add(new Rentlistobject("학생시설물 사용 신청서","3"));
        adapter=new RentListAdapter(this,R.layout.rentlistitem,data);
        ListView listView = (ListView) findViewById(R.id.rentlistview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View vClicked,
                                    int position, long id) {
                //   String name = (String) ((TextView)vClicked.findViewById(R.id.textItem1)).getText();
                String name = ((Rentlistobject) adapter.getItem(position)).listname;
                String num=((Rentlistobject) adapter.getItem(position)).numlist;
                Toast.makeText(RentList.this, name + " selected",
                        Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),sendRent.class);
                intent.putExtra("whatrent",num);
                startActivity(intent);


            }
        });

    }
}
