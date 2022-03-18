package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        fun girarDados (lados:Int) {

            val valor = (1..lados).random()

            val texresult = findViewById<TextView>(R.id.text1)

            texresult.text = valor.toString()
        }

        var opc = intent.getIntExtra("DADO",0)

        var buttonGirar = findViewById<Button>(R.id.girar)

        buttonGirar.setOnClickListener(){

            when (opc){
                1 -> {
                   girarDados(6)
                }
                2 -> {
                    girarDados(12)
                }
                else -> {

                    girarDados(20)
                }


            }
        }

       var buttonVolt = findViewById<Button>(R.id.buttonVoltar)

        buttonVolt.setOnClickListener(){
            finish()
        }


    }
}