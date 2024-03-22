package com.example.quizapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.quizapp.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityScoreBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityScoreBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_score)
        setContentView(binding.root)

       binding.score.setText("congrats your score is ${intent.getIntExtra("SCORE", 0)}")
    }
}