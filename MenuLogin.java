package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_login);
    }
    public void menuMainActivity(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void menuInicio(View view) {
        Intent i = new Intent(this, MenuInicial.class);
        startActivity(i);
    }

}