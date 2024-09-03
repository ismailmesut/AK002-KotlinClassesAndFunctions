package com.ismailmesutmujde.kotlinclassesandfunctions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
        return result
    }

}