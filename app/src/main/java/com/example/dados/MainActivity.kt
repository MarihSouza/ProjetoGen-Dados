package com.example.dados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intentSegunda = Intent(this,MainActivity2::class.java)

        var buttonD6 = findViewById<Button>(R.id.Dado6L)
        var buttonD12 = findViewById<Button>(R.id.Dado12L)
        var buttonD20 = findViewById<Button>(R.id.Dado20L)


        buttonD6.setOnClickListener {
           startActivity(intentSegunda)
            intentSegunda.putExtra("DADO",1)

        }
        buttonD12.setOnClickListener {
            startActivity(intentSegunda)
            intentSegunda.putExtra("DADO",2)
        }
        buttonD20.setOnClickListener {
            startActivity(intentSegunda)
            intentSegunda.putExtra("DADO",3)
        }


    }





}




