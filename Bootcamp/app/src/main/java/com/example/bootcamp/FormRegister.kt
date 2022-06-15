package com.example.bootcamp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.bootcamp.databinding.ActivityFormBinding
import com.example.bootcamp.databinding.ActivityMainBinding


class FormRegister: AppCompatActivity() {

    lateinit var binding: ActivityFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BottomAcept.setOnClickListener{
            val lanzar = Intent(this, Search::class.java)
            startActivity(lanzar)
        }

        binding.reverse.setOnClickListener{
            val lanzar = Intent(this, MainActivity::class.java)
            startActivity(lanzar)
        }
    }
}