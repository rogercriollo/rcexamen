package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        llamainicio()
    }

    fun llamainicio() {
        val home = findViewById<Button>(R.id.btnirhome)

        home.setOnClickListener() {

            val saltar: Intent = Intent(this, opcionesmenu::class.java)
            startActivity(saltar)
        }
    }
}