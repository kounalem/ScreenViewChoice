package com.example.screenviewpattern

import android.app.Application
import com.example.screenviewpattern.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ScreenViewPatternApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ScreenViewPatternApplication)
            modules(appModule)
        }
    }

}
