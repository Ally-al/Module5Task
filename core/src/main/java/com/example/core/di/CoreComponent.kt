package com.example.core.di

import com.example.core.di.qualifier.Server1
import com.example.core.di.qualifier.Server2
import dagger.Component
import retrofit2.Retrofit

@Component(
    modules = [NetworkModule::class, NetworkModule2::class]
)
interface CoreComponent {
    @Server1
    fun retrofit1(): Retrofit

    @Server2
    fun retrofit2(): Retrofit
}
