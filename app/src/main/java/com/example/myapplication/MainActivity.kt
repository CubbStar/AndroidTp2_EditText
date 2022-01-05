package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.voirText)
        val editText = findViewById<EditText>(R.id.zoneText)

        button.setOnClickListener{
            val text = editText.text.toString()
            if (text != "") {
                Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Vous n'avez rien ecris", Toast.LENGTH_SHORT).show()
            }

        }
    }
}