package com.example.customviewhomework31

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counter = findViewById<CounterView>(R.id.counter_view)
        val button = findViewById<Button>(R.id.button_increase_decrease).apply { text = counter.buttonCondition.toString() }
        button.setOnClickListener{
            button.apply { text = counter.changeButton() }
            counter.switch()
        }
    }
}