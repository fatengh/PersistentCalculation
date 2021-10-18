package com.example.persistentcalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var ed1 :EditText
    private lateinit var ed2 :EditText

    private lateinit var btn :Button

    private lateinit var tv2 :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed1 = findViewById(R.id.ed1)
        ed2 = findViewById(R.id.ed2)

        btn = findViewById(R.id.btn)

        tv2 = findViewById(R.id.tv2)

        btn.setOnClickListener {
            multi()
        }
    }

    fun multi(){
        var x = ed1.text.toString().toFloat() * ed2.text.toString().toDouble()
        tv2.text = "Resulte: ${x.toString()}"
    }
}