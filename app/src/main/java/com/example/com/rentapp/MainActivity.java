package com.example.com.rentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginbtn=(Button)findViewById(R.id.loginbtn);
        final EditText idtextv=(EditText) findViewById(R.id.editID);
        final EditText pwtextv=(EditText) findViewById(R.id.editpw);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ChoiceMenu.class);
                intent.putExtra("ID",idtextv.getText().toString());
                intent.putExtra("PW",pwtextv.getText().toString());
                startActivity(intent);
            }
        });
    }
}
