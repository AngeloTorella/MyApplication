package com.example.myapplication.interfaces;

import com.example.myapplication.models.ApiRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface service {

    @GET("query?function=OVERVIEW&symbol=AAPL&apikey=ZQBM92LGRBP4Q3F0")
    Call<ApiRespuesta> obtenerDatos();

}
