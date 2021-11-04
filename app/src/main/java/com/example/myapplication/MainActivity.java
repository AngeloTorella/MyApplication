package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.myapplication.interfaces.service;
import com.example.myapplication.models.ApiRespuesta;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public TextView texto;
    public TextView market;
    private Retrofit retrofit;
    private final String TAG="api";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto=findViewById(R.id.textoprueba);
        market=findViewById(R.id.market);
        retrofit=new Retrofit.Builder().baseUrl("https://www.alphavantage.co/").addConverterFactory(GsonConverterFactory.create()).build();

        obtenerDatos();
    }

    private void obtenerDatos(){
        service servicio= retrofit.create(service.class);
        Call<ApiRespuesta> respuestaCall= servicio.obtenerDatos();

        respuestaCall.enqueue(new Callback<ApiRespuesta>() {
            @Override
            public void onResponse(Call<ApiRespuesta> call, Response<ApiRespuesta> response) {
                if(response.isSuccessful()){
                    ApiRespuesta apiRespuesta= response.body();
                    Log.e(TAG,"symbol"+apiRespuesta.getSymbol());
                    texto.setText(apiRespuesta.getSymbol());
                    market.setText("market capitalization"+apiRespuesta.getCurrency().toString());
                }
                else{
                    Log.e(TAG,"on response"+response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<ApiRespuesta> call, Throwable t) {
                Log.e(TAG,"on failure"+t.getMessage());
            }
        });
    }
}