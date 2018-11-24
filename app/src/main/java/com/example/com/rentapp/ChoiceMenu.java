package com.example.com.rentapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by com on 2018-11-11.
 */

public class ChoiceMenu extends AppCompatActivity {
    String ID;
    String PW;
    Button rentbutton;
    Button testingbtn;
    Button noticebtn;
    Button checkemptybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choicemenu);
        rentbutton=(Button)findViewById(R.id.rentform);
        checkemptybtn=(Button)findViewById(R.id.checkempty);

        TextView test=(TextView)findViewById(R.id.test1);
        final Intent intent=getIntent();
       ID=intent.getStringExtra("ID");
       PW=intent.getStringExtra("PW");
       test.setText(ID+"and"+PW);
       rentbutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent gorentintent=new Intent(getApplicationContext(),RentList.class);
               startActivity(gorentintent);
           }
       });
       checkemptybtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent checkempty =new Intent(getApplicationContext(),checkremain.class);
               startActivity(checkempty);
           }
       });



    }
}
