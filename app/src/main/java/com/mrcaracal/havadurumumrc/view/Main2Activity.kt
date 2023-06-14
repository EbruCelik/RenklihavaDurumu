package com.mrcaracal.havadurumumrc.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mrcaracal.havadurumumrc.R

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2_main)

        val textView2 = findViewById<TextView>(R.id.textView2)

        val nameGet: String? = intent.getStringExtra("Name")

        textView2.text = nameGet

        val buttonGeri = findViewById<Button>(R.id.btn_geri)

        buttonGeri.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

    }
}