package com.example.nabila_tie_mobile.Pertemuan3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.nabila_tie_mobile.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    // 1. Deklarasi variabel binding global
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 2. Inisialisasi ViewBinding
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 3. Tambahkan listener pada Button saat diklik
        binding.btnKirim.setOnClickListener {
            val noTujuan = binding.inputNoTujuan.text.toString().trim()

            if (noTujuan.isEmpty()) {
                Toast.makeText(this, "Harap isi nomor tujuan terlebih dahulu!", Toast.LENGTH_SHORT).show()
            } else {
                // Pindah ke ThirdResultActivity
                val intent = Intent(this, ThirdResultActivity::class.java)
                startActivity(intent)
            }
        }
    }
}