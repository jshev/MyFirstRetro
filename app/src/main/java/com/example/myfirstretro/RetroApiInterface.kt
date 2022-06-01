package com.example.myfirstretro

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetroApiInterface {
    //singleton
    @GET("books.json")
    fun getAllBooks() : Call<List<Books>>

    companion object {
        //var BASE_URL = "https://pokeapi.co/api/v2/"
        var BASE_URL = "https://thapasabiran.github.io/Data/"
        fun create(): RetroApiInterface {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(RetroApiInterface::class.java)
        }
    }
}