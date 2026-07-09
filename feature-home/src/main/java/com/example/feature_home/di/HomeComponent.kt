package com.example.feature_home.di

import com.example.core.di.CoreComponent
import com.example.feature_home.data.HomeRepository
import dagger.Component

@Component(dependencies = [CoreComponent::class])
interface HomeComponent {
    fun getRepository(): HomeRepository

    @Component.Builder
    interface Builder {
        fun coreComponent(coreComponent: CoreComponent): Builder
        fun build(): HomeComponent
    }

    companion object {
        fun create(coreComponent: CoreComponent): HomeComponent {
            return DaggerHomeComponent.builder()
                .coreComponent(coreComponent)
                .build()
        }
    }
}
