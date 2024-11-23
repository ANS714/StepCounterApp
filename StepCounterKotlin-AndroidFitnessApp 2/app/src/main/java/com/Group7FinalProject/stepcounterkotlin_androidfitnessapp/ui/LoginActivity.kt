package com.Group7FinalProject.stepcounterkotlin_androidfitnessapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.Group7FinalProject.stepcounterkotlin_androidfitnessapp.R

class LoginActivity : AppCompatActivity() {
    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Initialize UI elements
        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        // Set click listener for the login button using a lambda expression
        buttonLogin.setOnClickListener {
            // Handle login button click
            val username = editTextUsername.text.toString().trim()
            val password = editTextPassword.text.toString().trim()
            login(username, password)
        }
    }

    private fun login(username: String, password: String) {
        // Simple login logic for demonstration purposes
        if (username == "group07" && password == "Infs611") {
            // Login successful, navigate to MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Finish LoginActivity to prevent going back on Back press
        } else {
            // Login failed, show a toast message
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
        }
    }
}
