package com.example.motivateme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //override lifecylce method onCreate. This should initialize all important items for the code.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inflate the given layout to turn xml views into kotlin objects.
        setContentView(R.layout.activity_main)

        //Get a reference to the button view from our layout and st a clickListener
        val updateButton: Button = findViewById(R.id.activity_main_bt_update)
        updateButton.setOnClickListener { updateMessage() }
    }

    //Get a name from an edit text and display a personalized message
    private fun updateMessage(){
        val name: EditText = findViewById(R.id.activity_main_et_name)
        val message: TextView = findViewById(R.id.main_activity_tx_message)

        //Get the username from the editText
        val username = name.text

        //Update the textView to display our message
        message.text = "Hello $username!"
    }
}