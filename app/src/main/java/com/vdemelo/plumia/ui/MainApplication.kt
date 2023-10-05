package com.vdemelo.plumia.ui

import android.app.Application
import com.vdemelo.plumia.di.appModule
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            modules(appModule())
        }

    }

}
