package com.example.quizapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.MainActivity
import com.example.quizapp.R

class ResultActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private lateinit var resultImageView: ImageView
    private lateinit var congratsTextView: TextView
    private lateinit var userNameTextView: TextView
    private lateinit var scoreTextView: TextView
    private lateinit var exitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        resultTextView = findViewById(R.id.resultTextView)
        resultImageView = findViewById(R.id.resultImageView)
        congratsTextView = findViewById(R.id.congratsTextView)
        userNameTextView = findViewById(R.id.usernameTextView)
        scoreTextView = findViewById(R.id.scoreTextView)
        exitButton = findViewById(R.id.exitButton)

        val userName = intent.getStringExtra("USER_NAME")
        val score = intent.getIntExtra("SCORE", 0)
        val totalQuestions = intent.getIntExtra("TOTAL_QUESTIONS", 0)

        resultImageView.setImageResource(R.drawable.screenshot__21_)
        congratsTextView.text = "Congratulations!"
        userNameTextView.text = userName
        scoreTextView.text = "You scored $score out of $totalQuestions"

        exitButton.setOnClickListener {
            val intent = Intent(this@ResultActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}




