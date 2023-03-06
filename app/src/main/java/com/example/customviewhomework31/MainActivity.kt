package com.example.customviewhomework31

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counter = findViewById<CounterView>(R.id.counter_view)
        val button = findViewById<Button>(R.id.button_increase_decrease).apply { text = counter.buttonCondition.toString() }
//        val animator = ValueAnimator.ofFloat(1f, 0f)
//        animator.addUpdateListener { animation ->
//            counter.alpha = (animation.animatedValue as Float)
//        }
//        animator.duration = 2000
        val set = AnimationUtils.loadAnimation(this,R.anim.rotation_and_skale_set_animation)
        set.fillAfter = true
        button.setOnClickListener{
//            button.apply { text = counter.changeButton() }
//            counter.switch()
//            ObjectAnimator.ofFloat(counter, View.ROTATION, 0f, 360f).start()
//            animator.start()
//            counter.animate().rotationBy(0f).rotation(360f).start()
//            counter.startAnimation(set)
            startActivity(Intent(this, SecndActivity::class.java))
        }
    }
}