package com.example.multilayoutlogger

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: MainActivity started")

        val btnSecond = findViewById<Button>(R.id.btnSecondActivity)
        val btnThird = findViewById<Button>(R.id.btnThirdActivity)

        btnSecond.setOnClickListener {
            Log.i(TAG, "Navigating to SecondActivity with extra data")
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
            startActivity(intent)
        }

        btnThird.setOnClickListener {
            Log.i(TAG, "Navigating to ThirdActivity")
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }
}
