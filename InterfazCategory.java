package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InterfazCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_category);
    }

    public void menuMainActivity(View view) {
        Intent i = new Intent(this, InterfazTicket.class);
        startActivity(i);
    }
}