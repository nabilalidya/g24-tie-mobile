package com.example.nabila_tie_mobile.Pertemuan3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nabila_tie_mobile.databinding.ActivityThirdResultBinding

class ThirdResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}