package com.example.materialbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textButton.setOnClickListener {
            Toast.makeText(this , "Text Button was clicked", Toast.LENGTH_SHORT).show()
        }

        outlinedButton.setOnClickListener {
            Toast.makeText(this , "Outlined Button was clicked", Toast.LENGTH_SHORT).show()
        }

        containedButton.setOnClickListener {
            Toast.makeText(this , "Contained Button was clicked", Toast.LENGTH_SHORT).show()
        }

    }
}