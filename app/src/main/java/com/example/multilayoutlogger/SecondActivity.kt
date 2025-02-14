package com.example.multilayoutlogger

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private val TAG = "SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
        Log.d(TAG, "Received Intent Extra: $message")
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()


        val etName = findViewById<EditText>(R.id.etName)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val name = etName.text.toString()
            val email = etEmail.text.toString()

            if (name.isEmpty() || email.isEmpty()) {
                Log.w(TAG, "Empty input fields detected")
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                Log.i(TAG, "Form submitted: Name=$name, Email=$email")
                Toast.makeText(this, "Name: $name\nEmail: $email", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
