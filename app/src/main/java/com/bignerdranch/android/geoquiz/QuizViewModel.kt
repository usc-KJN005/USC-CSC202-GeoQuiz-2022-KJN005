package com.bignerdranch.android.geoquiz

import androidx.lifecycle.ViewModel

/** This section is to used to retain data between screen orientation changes **/

class QuizViewModel : ViewModel() {

    /** Stores Question Variables **/
    var currentIndex = 0
    var isCheater = false //Cheat Variable

    /** Question references - Includes if question is true or false **/
    private val questionBank = listOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true)
    )

    val currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer

    val currentQuestionText: Int
        get() = questionBank[currentIndex].textResId

    fun moveToPrevious() {
        currentIndex = (currentIndex - 1) % questionBank.size
        if (currentIndex == -1) currentIndex = questionBank.lastIndex
    }

    fun moveToNext() {
        currentIndex = (currentIndex + 1) % questionBank.size
    }

}