package com.example.module5

import android.app.Application
import com.example.app.di.AppComponent
import com.example.app.di.DaggerAppComponent
import com.example.core.di.DaggerCoreComponent
import com.example.feature_home.di.DaggerHomeComponent

class DaggerApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        val coreComponent = DaggerCoreComponent.create()

        val homeComponent = DaggerHomeComponent.builder()
            .coreComponent(coreComponent)
            .build()

        appComponent = DaggerAppComponent.builder()
            .homeComponent(homeComponent)
            .build()

        // проверка DI
        val repository = appComponent.getRepository()

        repository.fetchDataFromServer1()
        repository.fetchDataFromServer2()
    }
}
