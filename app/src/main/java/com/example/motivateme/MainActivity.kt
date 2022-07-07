package com.example.motivateme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    //override lifecylce method onCreate. This should initialize all important items for the code.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inflate the given layout to turn xml views into kotlin objects.
        setContentView(R.layout.activity_main)
    }
}