package com.friska.hitung

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.friska.hitung.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etPanjang = findViewById<EditText>(R.id.etPanjang)
        val etLebar = findViewById<EditText>(R.id.etLebar)
        val etTinggi = findViewById<EditText>(R.id.etTinggi)
        val btnHitung = findViewById<Button>(R.id.btnHitung)
        val tvLuasPermukaan = findViewById<TextView>(R.id.tvLuasPermukaan)
        val tvVolume = findViewById<TextView>(R.id.tvVolume)

        btnHitung.setOnClickListener{
            val panjang = etPanjang.text.toString().toDoubleOrNull()
            val lebar = etLebar.text.toString().toDoubleOrNull()
            val tinggi = etLebar.text.toString().toDoubleOrNull()

            if (panjang != null && lebar != null && tinggi != null){
                val luaspermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi)
                val volume = panjang * lebar * tinggi

                tvLuasPermukaan.text = "luas permukaan : $luaspermukaan"
                tvVolume.text = "volume : $volume"
            } else {
                tvLuasPermukaan.text = "input tidak sesuai"
                tvVolume.text =""
            }
        }
    }
}