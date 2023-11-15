package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        setTheme(R.style.Theme_Prueba)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        llamarreg()
        llamahome()
    }



    fun llamarreg() {
        val reg = findViewById<Button>(R.id.btnirreg)


        reg.setOnClickListener() {

            val saltar: Intent = Intent(this, registro::class.java)
            startActivity(saltar)
        }
    }

    fun llamahome() {
        val home = findViewById<Button>(R.id.btnirhome)

        home.setOnClickListener() {

            val saltar: Intent = Intent(this, opcionesmenu::class.java)
            startActivity(saltar)
        }
    }


}