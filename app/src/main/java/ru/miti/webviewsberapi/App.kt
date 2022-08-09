package ru.miti.webviewsberapi

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

class App : Application() {

    lateinit var retrofit: Retrofit

    companion object {
        lateinit var application: App
    }

    override fun onCreate() {
        super.onCreate()
        application = this
        retrofit = Retrofit.Builder()
            .baseUrl("https://api.vk.com/method/")
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
    }
}
