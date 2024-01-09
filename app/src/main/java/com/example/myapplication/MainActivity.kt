package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val enteredFirstName=findViewById<EditText>(R.id.firstName)
        val enteredLastName=findViewById<EditText>(R.id.lastName)
        val enteredAge=findViewById<EditText>(R.id.age)
        val submitButton=findViewById<Button>(R.id.submitButton)


        submitButton.setOnClickListener(){


                val firstName = enteredFirstName.text.toString()
                val lastName = enteredLastName.text.toString()
                val age = enteredAge.text.toString()

                val intent: Intent = Intent(
                    this@MainActivity,
                    MainActivity2::class.java
                )

                intent.putExtra("First Name",firstName)
                intent.putExtra("Last Name",lastName)
                intent.putExtra("Age",age)


                startActivity(intent)


        }
    }
}