package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var shibaImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ImageView
        shibaImage = findViewById(R.id.imageView)

        //TextView
        val counterTextView:TextView = findViewById(R.id.counter)
        //Buttons
        val shibaFoodButton: Button = findViewById(R.id.foodButton)
        shibaFoodButton.setOnClickListener {
            val toastText = "I forgiv fren."
            Toast.makeText(applicationContext, toastText, Toast.LENGTH_LONG).show()
            shibaImage.setImageResource(R.drawable.calmshiba)
        }
        val initiateToastButton: Button = findViewById(R.id.toastButton)
        initiateToastButton.setOnClickListener {
            //TODO: Add stuff here. Need to make a toast.
            val toastText = "You Touched My Tralala!"
            shibaImage.setImageResource(R.drawable.angry_shiba)
            Toast.makeText(applicationContext, toastText, Toast.LENGTH_SHORT).show()
        }
        val incrementCountButton: Button = findViewById(R.id.increment)
        incrementCountButton.setOnClickListener{
            val currentCounterText:Int = Integer.parseInt(counterTextView.text as String)
            val nextCounterText:Int = currentCounterText + 1
            val toastText = "$currentCounterText -> $nextCounterText"
            Toast.makeText(applicationContext, toastText, Toast.LENGTH_SHORT).show()
            counterTextView.setText("$nextCounterText")
        }
        val decrementCountButton: Button = findViewById(R.id.decrement)
        decrementCountButton.setOnClickListener{
            val currentCounterText:Int = Integer.parseInt(counterTextView.text as String)
            val nextCounterText:Int = currentCounterText - 1
            val toastText = "$currentCounterText -> $nextCounterText"
            Toast.makeText(applicationContext, toastText, Toast.LENGTH_SHORT).show()
            counterTextView.setText("$nextCounterText")
        }
        val resetCountButton:Button = findViewById(R.id.resetButton)
        resetCountButton.setOnClickListener{
            val currentCounterText:Int = Integer.parseInt(counterTextView.text as String)
            val toastText = "$currentCounterText -> 0"
            Toast.makeText(applicationContext, toastText, Toast.LENGTH_SHORT).show()
            counterTextView.setText("0")
        }





    }
}