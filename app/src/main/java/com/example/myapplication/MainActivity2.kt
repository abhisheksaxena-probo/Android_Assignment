package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val firstNameReceiver=findViewById<TextView>(R.id.firstName)
        val lastNameReceiver=findViewById<TextView>(R.id.lastName)
        val ageReceiver=findViewById<TextView>(R.id.age)


        val intent: Intent = getIntent();

        val recievedFirstName=intent.getStringExtra("First Name")
        val recievedLastName=intent.getStringExtra("Last Name")
        val recievedAge=intent.getStringExtra("Age")

        firstNameReceiver.setText(recievedFirstName)
        lastNameReceiver.setText(recievedLastName)
        ageReceiver.setText(recievedAge)

    }
}