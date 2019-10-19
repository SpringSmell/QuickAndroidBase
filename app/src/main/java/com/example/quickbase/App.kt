package com.example.quickbase

import android.app.Application
import org.quick.base.QuickAndroid

class App:Application() {

    override fun onCreate() {
        super.onCreate()
        QuickAndroid.init(this)
    }
}