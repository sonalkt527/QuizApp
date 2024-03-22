package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityLoginBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
        Firebase.auth.createUserWithEmailAndPassword(binding.Email.editableText.toString(),
        binding.Password.editableText.toString()).addOnCompleteListener {
            if(it.isSuccessful)
            {
                Toast.makeText(this, "user created !!!", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "user not created !!!", Toast.LENGTH_LONG).show()
            }
        }
        }
    }
}