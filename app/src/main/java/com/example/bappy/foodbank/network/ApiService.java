package com.example.bappy.foodbank.network;


import com.example.bappy.foodbank.model.ResponseReadFood;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("kategori/museum/data_museum.php")
    Call<ResponseReadFood> readfood();
}
