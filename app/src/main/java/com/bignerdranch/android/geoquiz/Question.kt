package com.bignerdranch.android.geoquiz

import androidx.annotation.StringRes

/** Question Class - Will hold all the questions **/
data class Question(@StringRes val textResId: Int,
                    val answer: Boolean,
                    var answered: Boolean = false){

}