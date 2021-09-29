package com.example.kionapp

import android.app.Application
import com.example.kionapp.di.module.appModule
import com.example.kionapp.di.module.repoModule
import com.example.kionapp.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}
