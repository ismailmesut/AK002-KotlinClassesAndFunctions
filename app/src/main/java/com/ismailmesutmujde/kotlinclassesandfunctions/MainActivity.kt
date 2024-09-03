package com.ismailmesutmujde.kotlinclassesandfunctions

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var myTextView: TextView
    lateinit var myButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.textView)

        /*
        myButton.setOnClickListener {
            myTextView.text = "button clicked 2"
        }*/

        // 1) code block, reusable 2) input 3) output - return

        //println("hello kotlin")
        test()
        mySum(10,15)
        val sumResult = mySum(40,35)
        val result = myMultiply(10,20)

        println(sumResult)
        println(result)
    }

    // function
    fun test() {
        //println("test function")
    }

    fun mySum(a:Int, b:Int) {
        //println(a+b)


    }

    fun myMultiply(x:Int, y:Int) : Int {
        //println(x*y)
        val result = x * y
        myTextView.text = "Result : ${x*y}"
        return result
    }

    fun buttonClicked(view : View) {
        myTextView.text = "Button Clicked"
    }

}