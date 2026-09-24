package com.example.nabila_tie_mobile.Pertemuan4

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.nabila_tie_mobile.R

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val name = intent.getStringExtra("NAME")
        val from = intent.getStringExtra("FROM")
        val age = intent.getIntExtra("AGE", 0)

        Log.d("FourthActivityData", "Nama: $name, Asal: $from, Umur: $age")

        val btnBackToMain = findViewById<Button>(R.id.btnBackToMain)
        btnBackToMain.setOnClickListener {
            finish()
        }
    }
}