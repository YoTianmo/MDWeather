package com.sanousun.mdweather.app

import android.app.Application
import com.facebook.stetho.Stetho

/**
 * 全局入口
 */

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
    }
}