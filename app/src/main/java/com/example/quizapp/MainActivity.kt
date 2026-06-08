package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizapp.ui.QuestionsActivity

class MainActivity : AppCompatActivity() {

    private lateinit var startButton: Button
    private lateinit var nameEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        startButton = findViewById(R.id.startButton)
        nameEditText = findViewById(R.id.nameEditText)

        startButton.setOnClickListener {
            if(!nameEditText.text.isEmpty()){
                val name = nameEditText.text.toString()
                val intent = Intent(this@MainActivity, QuestionsActivity::class.java)
                intent.putExtra("USER_NAME", name)
                startActivity(intent)
                finish()
            }
            else{
                // nameEditText.error = "Please enter your name"
                Toast.makeText(this,"Please enter your name", Toast.LENGTH_SHORT).show()
            }
        }

    }
}







