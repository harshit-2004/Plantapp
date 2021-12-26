package com.example.plantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent

class SplashActivity : AppCompatActivity() {

    private val splashScreen = 5000
    override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash)

Handler().postDelayed({
    startActivity(intent)
   val intent = Intent(this@SplashActivity, PostActivity::class.java)
    startActivity(intent)
    finish()
},splashScreen.toLong())

        }}
