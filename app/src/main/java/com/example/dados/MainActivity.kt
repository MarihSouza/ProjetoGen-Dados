package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonD6 = findViewById<Button>(R.id.Dado6L)
        var buttonD12 = findViewById<Button>(R.id.Dado12L)
        var buttonD20 = findViewById<Button>(R.id.Dado20L)

        buttonD6.setOnClickListener {
            girarDados(6)
        }
        buttonD12.setOnClickListener {
            girarDados(12)
        }
        buttonD20.setOnClickListener {
            girarDados(20)
        }


    }
    fun girarDados (lados:Int){

        val valor = (1..lados).random()

        val texresult = findViewById<TextView>(R.id.text1)

        texresult.text = valor.toString()


    }

}




