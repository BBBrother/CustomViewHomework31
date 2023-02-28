package com.example.customviewhomework31

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class CounterView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View (context, attrs, defStyleAttr) {


    private var counterChange = true
    var buttonCondition = ButtonCondition.INCREASE
    private var counterClick = 0
    private var radius = 0.0f

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        textAlign = Paint.Align.CENTER
        textSize = 80.0f
        typeface = Typeface.create( "", Typeface.BOLD)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        when (counterClick) {
            in -11..-1 -> {
                paint.color = Color.GRAY
                radius = 400.0f
            }

            in 0..10 -> {
                paint.color = Color.GREEN
                radius = 500.0f

            }

            in 11..20 -> {
                paint.color = Color.YELLOW
                radius = 600.0f
            }

            in 21..99 -> {
                paint.color = Color.RED
                radius = 700.0f
            }

            else -> {paint.color = Color.BLUE}
        }

        canvas.drawCircle((width / 2).toFloat(), (height / 2).toFloat(), radius, paint)
        paint.color = Color.BLACK

        canvas.drawText(counterClick.toString(),(width / 2).toFloat(), (height / 2).toFloat(), paint)
    }

    init {
        isClickable = true
    }

    override fun performClick(): Boolean {
        if (super.performClick()) return true
        if (counterChange)
            counterClick ++
        else
            counterClick--

        invalidate()
        return true
    }

    fun switch() {
        buttonCondition.switch()
        counterChange = !counterChange
    }

    fun changeButton(): String{
        buttonCondition = if (!counterChange) {
            ButtonCondition.INCREASE
        } else {
            ButtonCondition.DECREASE
        }
        return buttonCondition.toString()
    }
}