package com.example.app.di

import com.example.feature_home.data.HomeRepository
import com.example.feature_home.di.HomeComponent
import dagger.Component

@Component(
    dependencies = [HomeComponent::class]
)
interface AppComponent {
    fun getRepository(): HomeRepository
}
