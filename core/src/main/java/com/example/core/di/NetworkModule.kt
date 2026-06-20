package com.example.core.di

import com.example.core.di.qualifier.Server1
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


@Module
class NetworkModule {

    @Provides
    @Server1
    fun provideRetrofit1(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://server1.com")
            .build()
    }
}
