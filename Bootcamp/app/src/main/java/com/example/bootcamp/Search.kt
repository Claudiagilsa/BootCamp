package com.example.bootcamp

import android.content.ClipData
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.bootcamp.databinding.ActivityFindBinding

class Search: AppCompatActivity() {

    lateinit var binding: ActivityFindBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFindBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navView.setOnClickListener{
            val lanzar = Intent(this, MainActivity::class.java)
            startActivity(lanzar)
        }

    }
}