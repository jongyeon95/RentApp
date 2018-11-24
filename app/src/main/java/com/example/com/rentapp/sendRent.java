package com.example.com.rentapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by com on 2018-11-11.
 */

public class sendRent extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        String whatrent=intent.getStringExtra("whatrent");
        if (whatrent.equals("1")){
            setContentView(R.layout.rent_a1);
        }
        else if (whatrent.equals("2")){
            setContentView(R.layout.rent_a2);
        }
        else if (whatrent.equals("3")){
            setContentView(R.layout.rent_a3);
        }

        else {
            Intent intentback = new Intent(getApplicationContext(), ChoiceMenu.class);
            startActivity(intentback);
        }

    }
}
