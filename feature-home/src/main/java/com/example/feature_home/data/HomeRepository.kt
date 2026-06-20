package com.example.feature_home.data

import com.example.core.data.api.ApiInterface
import com.example.core.di.qualifier.Server1
import com.example.core.di.qualifier.Server2
import retrofit2.Retrofit
import javax.inject.Inject

class HomeRepository @Inject constructor(
    @Server1 private val retrofit1: Retrofit,
    @Server2 private val retrofit2: Retrofit
) {
    private val api1 = retrofit1.create(ApiInterface::class.java)
    private val api2 = retrofit2.create(ApiInterface::class.java)

    fun fetchDataFromServer1() {
        println("Fetching data from Server1 via $api1")
    }

    fun fetchDataFromServer2() {
        println("Fetching data from Server2 via $api2")
    }
}
