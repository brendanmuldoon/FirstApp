package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var total:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayTotal()

        addButtonListener()

        minusButtonListener()

    }

    private fun minusButtonListener() {
        binding.subtractButton.setOnClickListener {
            total --
            displayTotal()
        }
    }

    private fun addButtonListener() {
        binding.addButton.setOnClickListener{
            total ++
            displayTotal()
        }
    }

    private fun displayTotal() {
        binding.displayTotalTextView.text=total.toString()
    }
}