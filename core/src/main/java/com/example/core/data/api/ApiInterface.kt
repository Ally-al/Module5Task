package com.example.core.data.api

import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("test")
    suspend fun getData(): Response<Unit>
}
