package com.example.mykotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mykotlinapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            test1()
        }

        binding.button2.setOnClickListener {

        }

    }

    private fun test1() {
        println(AudiQ7)
        val car = CarData("D", 2)
        binding.textView.setText("model " + AudiQ7.a + "; price " + AudiQ7.b)
    }
}