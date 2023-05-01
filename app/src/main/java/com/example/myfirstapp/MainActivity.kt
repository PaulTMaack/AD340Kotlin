package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var shibaImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        shibaImage = findViewById(R.id.imageView)
        val toastText = "You Touched My Tralala!"
        val duration = Toast.LENGTH_LONG
        val toastButton: Button = findViewById(R.id.toastButton)
        toastButton.setOnClickListener {
            //TODO: Add stuff here. Need to make a toast.
            shibaImage.setImageResource(R.drawable.angry_shiba)
            Toast.makeText(applicationContext, toastText, duration).show()
        }
        shibaImage.setOnClickListener {
            val toastText = "I forgiv fren."
            Toast.makeText(applicationContext, toastText, duration).show()
            shibaImage.setImageResource(R.drawable.calmshiba)
        }
    }
}