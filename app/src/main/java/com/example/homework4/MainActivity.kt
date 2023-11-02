package com.example.homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        findViewById<AppCompatImageButton>(R.id.imageButton5).setOnClickListener {
            findViewById<AppCompatTextView>(R.id.textView3).setText("Left Button pushed!!!")
        }

        findViewById<AppCompatImageButton>(R.id.imageButton6).setOnClickListener {
            findViewById<AppCompatTextView>(R.id.textView3).setText("Right Button pushed!!!")
        }


    }
}