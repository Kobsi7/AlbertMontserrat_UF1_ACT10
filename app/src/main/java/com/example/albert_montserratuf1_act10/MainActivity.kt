package com.example.albert_montserratuf1_act10

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton: Button = findViewById(R.id.btnSubmit)
        val toRelativeLayoutButton: Button = findViewById(R.id.btnToRelativeLayout)
        val toConstraintLayoutButton: Button = findViewById(R.id.btnToConstraintLayout)
        submitButton.setOnClickListener {
            Toast.makeText(this, "Registre complet", Toast.LENGTH_SHORT).show()
        }
        toRelativeLayoutButton.setOnClickListener {
            startActivity(Intent(this, RelativeActivity::class.java))
        }
        toConstraintLayoutButton.setOnClickListener {
            startActivity(Intent(this, ConstraintActivity::class.java))
        }
    }
}
