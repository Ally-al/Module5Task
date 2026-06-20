package com.example.core.di.qualifier

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Server1

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Server2
