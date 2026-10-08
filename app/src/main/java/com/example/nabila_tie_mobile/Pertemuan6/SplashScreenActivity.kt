package com.example.nabila_tie_mobile.Pertemuan6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.nabila_tie_mobile.MainActivity
import com.example.nabila_tie_mobile.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val sharedPref = getSharedPreferences("user_pref", MODE_PRIVATE)

        lifecycleScope.launch {
            delay(2000) // Delay 2 detik

            // Pengecekan isLogin sesuai Bagian 4 Modul
            val isLogin = sharedPref.getBoolean("isLogin", false)

            val targetActivity = if (isLogin) {
                MainActivity::class.java
            } else {
                AuthActivity::class.java
            }

            val intent = Intent(this@SplashScreenActivity, targetActivity)
            startActivity(intent)
            finish()
        }
    }
}