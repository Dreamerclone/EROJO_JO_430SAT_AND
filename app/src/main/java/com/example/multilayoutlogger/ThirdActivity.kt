package com.example.multilayoutlogger

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    private val TAG = "ThirdActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        Log.d(TAG, "onCreate: ThirdActivity started")

        val btnAction = findViewById<Button>(R.id.btnAction)
        btnAction.setOnClickListener {
            Log.e(TAG, "Button Clicked! Performing action...")
            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}
