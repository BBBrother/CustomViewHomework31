package com.example.customviewhomework31

enum class ButtonCondition (val value: Int){
    INCREASE(R.string.increase),
    DECREASE(R.string.decrease);

    fun switch() = when (this){
        INCREASE -> DECREASE
        DECREASE -> INCREASE
    }
}