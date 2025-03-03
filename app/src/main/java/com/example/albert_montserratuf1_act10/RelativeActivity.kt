package com.example.albert_montserratuf1_act10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RelativeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)

        val toLinearLayoutButton: Button = findViewById(R.id.btnToLinearLayout)
        val toConstraintLayoutButton: Button = findViewById(R.id.btnToConstraintLayout)
        val submitButton: Button = findViewById(R.id.btnSubmit2)

        submitButton.setOnClickListener {
            Toast.makeText(this, "Registre complet", Toast.LENGTH_SHORT).show()
        }

        toLinearLayoutButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java)) // Cambia a LinearLayout
        }

        toConstraintLayoutButton.setOnClickListener {
            startActivity(Intent(this, ConstraintActivity::class.java)) // Cambia a ConstraintLayout
        }
    }
}



