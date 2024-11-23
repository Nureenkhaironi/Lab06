package com.nureenkhaironi.lab06

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nureenkhaironi.lab06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.courses.setOnClickListener {
            binding.infoTextView.text = "Android ATC 801 consists of topics ranging from " +
                    "UI Creation, App Development, and Firebase"
        }

        binding.Exams.setOnClickListener {
            binding.infoTextView.text = "The exam consists of 45 multiple-choice questions to be completed in 1 hour 30 minutes."
        }

        binding.Freelance.setOnClickListener {
            binding.infoTextView.text = "You are a good programmer"
        }
    }
}