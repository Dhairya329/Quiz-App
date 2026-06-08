package com.example.quizapp.ui

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizapp.R
import com.example.quizapp.model.Questions
import com.example.quizapp.utils.ConstantQuestions

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var questionTextView: TextView
    private lateinit var flagImage: ImageView
    private lateinit var progressBar: ProgressBar
    private lateinit var progressTextView: TextView
    private lateinit var submitButton: Button

    private lateinit var option1: TextView
    private lateinit var option2: TextView
    private lateinit var option3: TextView
    private lateinit var option4: TextView

    private var questionCount = 0
    private lateinit var questionsList: MutableList<Questions>

    private var selectedOptionPosition: Int = 0
    private var answered = false

    var username = ""

    var score: Int = 0

    private lateinit var currentQuestion: Questions

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_questions)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        questionTextView = findViewById(R.id.question_textView)
        flagImage = findViewById(R.id.flag_imageView)
        progressBar = findViewById(R.id.progressBar)
        progressTextView = findViewById(R.id.progress_textView)
        submitButton = findViewById(R.id.submit_button)

        option1 = findViewById(R.id.option1_textView)
        option2 = findViewById(R.id.option2_textView)
        option3 = findViewById(R.id.option3_textView)
        option4 = findViewById(R.id.option4_textView)

        submitButton.setOnClickListener(this)

        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
        option4.setOnClickListener(this)

        username = intent.getStringExtra("USER_NAME").toString()

        questionsList = ConstantQuestions.getQuestions()
        Log.d("QuestionsSize: ", "Questions List: ${questionsList.size}")

        showNextQuestion()

    }

    private fun showNextQuestion() {

        resetOptions()

        currentQuestion = questionsList[questionCount]

        val question = questionsList[questionCount]
        flagImage.setImageResource(question.image)
        questionTextView.text = question.question
        progressBar.progress = questionCount + 1

        progressTextView.text =
            getString(R.string.resultText, questionCount + 1, questionsList.size)

        option1.text = question.optionOne
        option2.text = question.optionTwo
        option3.text = question.optionThree
        option4.text = question.optionFour

        submitButton.text = "CHECK"

        answered = false
        selectedOptionPosition = 0
    }

    private fun resetOptions() {

        val options = ArrayList<TextView>()
        options.add(0, option1)
        options.add(1, option2)
        options.add(2, option3)
        options.add(3, option4)

        for (option in options) {
            option.setTextColor(ContextCompat.getColor(this, R.color.midnight_slate))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    private fun selectedOption(textView: TextView, selectedOptionNum: Int) {

        resetOptions()

        selectedOptionPosition = selectedOptionNum

        textView.setTextColor(Color.parseColor("#C9A24D"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)

    }

    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.option1_textView -> {
                selectedOption(option1, 1)
            }

            R.id.option2_textView -> {
                selectedOption(option2, 2)
            }

            R.id.option3_textView -> {
                selectedOption(option3, 3)
            }

            R.id.option4_textView -> {
                selectedOption(option4, 4)
            }

            R.id.submit_button -> {
                if (!answered) {
                    checkAnswer()
                    return
                } else {
                    if (questionCount == questionsList.size - 1) {

                        val intent1 = Intent(this@QuestionsActivity, ResultActivity::class.java)
                        intent1.putExtra("USER_NAME", username)
                        intent1.putExtra("SCORE", score)
                        intent1.putExtra("TOTAL_QUESTIONS", questionsList.size)

                        Log.d("RESULT_INTENT", "username=$username score=$questionCount")
                        startActivity(intent1)
                        finish()
                    } else {
                        questionCount++
                        showNextQuestion()
                    }
                }
            }

        }
    }

    private fun checkAnswer() {

        if (selectedOptionPosition == 0) {
            // No option selected
            return
        }

        answered = true

        if (selectedOptionPosition == currentQuestion.correctAnswer) {

            score++

            when (selectedOptionPosition) {

                1 -> option1.background =
                    ContextCompat.getDrawable(this, R.drawable.correct_option_border_bg)

                2 -> option2.background =
                    ContextCompat.getDrawable(this, R.drawable.correct_option_border_bg)

                3 -> option3.background =
                    ContextCompat.getDrawable(this, R.drawable.correct_option_border_bg)

                4 -> option4.background =
                    ContextCompat.getDrawable(this, R.drawable.correct_option_border_bg)
            }
        } else {
            when (selectedOptionPosition) {

                1 -> option1.background =
                    ContextCompat.getDrawable(this, R.drawable.wrong_option_border_bg)

                2 -> option2.background =
                    ContextCompat.getDrawable(this, R.drawable.wrong_option_border_bg)

                3 -> option3.background =
                    ContextCompat.getDrawable(this, R.drawable.wrong_option_border_bg)

                4 -> option4.background =
                    ContextCompat.getDrawable(this, R.drawable.wrong_option_border_bg)
            }

            showCorrectAnswer()
        }

        submitButton.text = if (questionCount == questionsList.size - 1) "FINISH" else "NEXT"
    }

    fun showCorrectAnswer() {
        val correctAns = currentQuestion.correctAnswer

        when (correctAns) {

            1 -> option1.background =
                ContextCompat.getDrawable(this, R.drawable.correct_option_border_bg)

            2 -> option2.background =
                ContextCompat.getDrawable(this, R.drawable.correct_option_border_bg)

            3 -> option3.background =
                ContextCompat.getDrawable(this, R.drawable.correct_option_border_bg)

            4 -> option4.background =
                ContextCompat.getDrawable(this, R.drawable.correct_option_border_bg)
        }
    }
}







