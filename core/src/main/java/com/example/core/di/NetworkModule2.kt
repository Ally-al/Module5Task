package com.example.core.di

import com.example.core.di.qualifier.Server2
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


@Module
class NetworkModule2 {

    @Provides
    @Server2
    fun provideRetrofit2(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://server2.com")
            .build()
    }
}
