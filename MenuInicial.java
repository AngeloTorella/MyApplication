package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);
    }

    public void menuLogin(View view){
        Intent i= new Intent(this,MenuLogin.class);
        startActivity(i);
    }

    public void menuRegistro(View view){
        Intent i= new Intent(this, MenuRegistro.class);
        startActivity(i);
    }

}