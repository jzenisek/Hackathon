package com.hedgesmedia.breathingapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun breath2(view: View){
        val testIntent = Intent(this, Gif2::class.java)
        startActivity(testIntent)
    }

    fun breath1(view: View){
        val testIntent = Intent(this, Gif1::class.java)
        startActivity(testIntent)
    }
}
