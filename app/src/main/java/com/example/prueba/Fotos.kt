
package com.example.prueba

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class Fotos : AppCompatActivity() {
    private val startForResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                val intent = result.data
                val imageBitmap = intent?.extras?.get("data") as Bitmap
                val imageView = findViewById<ImageView>(R.id.imageView)
                imageView.setImageBitmap(imageBitmap)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fotos)
        llamareg()
    }

    fun llamareg() {
        val reg = findViewById<Button>(R.id.idregresar)

        reg.setOnClickListener {
            val saltar = Intent(this, opcionesmenu::class.java)
            startActivity(saltar)

            val btnCamara = findViewById<Button>(R.id.btnCamara)
            btnCamara.setOnClickListener {
                startForResult.launch(Intent(MediaStore.ACTION_IMAGE_CAPTURE))
            }




            }
        }
    }

