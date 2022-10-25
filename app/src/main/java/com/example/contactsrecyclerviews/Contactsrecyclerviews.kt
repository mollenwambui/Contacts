package com.example.contactsrecyclerviews

import android.app.Application
import android.content.Context

class Contactsrecyclerviews:Application() {
    companion object{
        lateinit var appContext:Context
    }

    override fun onCreate() {
        super.onCreate()
        appContext=applicationContext

    }
}