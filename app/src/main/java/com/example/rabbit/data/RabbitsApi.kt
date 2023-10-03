package com.example.rabbit.data

import retrofit2.http.GET

interface RabbitsApi {
    @GET("/randomrabbit")
    suspend fun getRandomRabbit(): Rabbit

    companion object{
        const val BASE_URL = "http://192.168.0.105:8080/randomrabbit"
    }
}