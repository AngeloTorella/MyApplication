package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menuHome(View view) {
        Intent i = new Intent(this, MenuInicial.class);
        startActivity(i);
    }

    public void menuPortafolio(View view) {
        Intent i = new Intent(this, MenuPortafolio.class);
        startActivity(i);
    }

    public void menuCalendario(View view) {
        Intent i = new Intent(this, InterfazCalendario.class);
        startActivity(i);
    }

    public void menuPerfil(View view) {
        Intent i = new Intent(this, MenuPerfil.class);
        startActivity(i);
    }
    public void menuCategoria(View view) {
        Intent i = new Intent(this, InterfazCategory.class);
        startActivity(i);
    }
}