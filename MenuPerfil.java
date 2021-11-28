package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuPerfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_perfil);
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