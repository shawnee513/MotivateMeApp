package com.example.motivateme

import android.content.Context
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //Declare our references to views before layout inflation
    private lateinit var name: EditText
    private lateinit var message: TextView

    //override lifecylce method onCreate. This should initialize all important items for the code.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inflate the given layout to turn xml views into kotlin objects.
        setContentView(R.layout.activity_main)

        //Set the value to our declared views
        name = findViewById(R.id.activity_main_et_name)
        message = findViewById(R.id.main_activity_tx_message)

        //Get a reference to the button view from our layout and st a clickListener
        val updateButton: Button = findViewById(R.id.activity_main_bt_update)
        updateButton.setOnClickListener { updateMessage() }
    }

    //Get a name from an edit text and display a personalized message
    private fun updateMessage(){
        //Get the username from the editText
        val username = name.text

        //Pick a motivational message
        val motivationalMessages = listOf("Keep working hard!", "Never give up!", "Keep your head up!", "Difficulty is growth!", "Today is the first day of the rest of your life")
        val index = (0..4).random()
        val currentMessage = motivationalMessages[index]

        //Update the textView to display our message
        if(username.toString() == ""){
            message.text = "Make Sure to enter your name!"
        }else{
            message.text = "Hello $username! $currentMessage"
        }

        //Clear the editext and use setText because editText's require an editable
        name.setText("")

        //Hide the keyboard
        hideKeyboard()
    }

    //hide the keyboard using an InputMethodManager
    private fun hideKeyboard(){
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(name.windowToken, 0)
    }
}