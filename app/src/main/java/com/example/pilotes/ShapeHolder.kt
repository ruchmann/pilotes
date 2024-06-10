package com.example.pilotes

import android.graphics.Paint
import android.graphics.RadialGradient
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape

public class ShapeHolder(private var shape: ShapeDrawable) {
    private var x = 0f
    private var y = 0f
    private var color = 0
    private var gradient: RadialGradient? = null
    private var alpha = 1f
    private var paint: Paint? = null

    fun setPaint(value: Paint?) {
        paint = value
    }

    fun getPaint(): Paint? {
        return paint
    }

    fun setX(value: Float) {
        x = value
    }

    fun getX(): Float {
        return x
    }

    fun setY(value: Float) {
        y = value
    }

    fun getY(): Float {
        return y
    }

    fun setShape(value: ShapeDrawable?) {
        if (value != null) {
            shape = value
        }
    }

    fun getShape(): ShapeDrawable? {
        return shape
    }

    fun getColor(): Int {
        return color
    }

    fun setColor(value: Int) {
        shape!!.paint.color = value
        color = value
    }

    fun setGradient(value: RadialGradient?) {
        gradient = value
    }

    fun getGradient(): RadialGradient? {
        return gradient
    }

    fun setAlpha(alpha: Float) {
        this.alpha = alpha
        shape?.alpha = (alpha * 255f + .5f).toInt()
    }

    fun getWidth(): Float {
        if(shape!=null)
        {
            return shape!!.getShape().getWidth()
        }
        else
        {
            val circle = OvalShape()
            circle.resize(50f, 50f)
            val drawable = ShapeDrawable(circle)
            return drawable.shape.width
        }

        //return shape!!.getShape().getWidth()
    }

    fun setWidth(width: Float) {
        val s = shape?.getShape()
        if (s != null) {
            s.resize(width, s.height)
        }
    }

    fun getHeight(): Float {
        if(shape!=null)
        {
            return shape!!.getShape().getHeight()
        }
        else
        {
            val circle = OvalShape()
            circle.resize(50f, 50f)
            val drawable = ShapeDrawable(circle)
            return drawable.shape.height
        }
       // return shape?.getShape()?.getHeight() ?:null
    }

    fun setHeight(height: Float) {
        val s = shape?.getShape()

        if (s != null) {
            s.resize(s.width, height)
        }
    }

    fun ShapeHolder(s: ShapeDrawable?) {
        println("creació Shape")
        if (s != null) {
            shape = s
        }
    }

}