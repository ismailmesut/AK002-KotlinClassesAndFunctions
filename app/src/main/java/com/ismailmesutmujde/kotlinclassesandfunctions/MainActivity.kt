package com.ismailmesutmujde.kotlinclassesandfunctions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1) code block, reusable 2) input 3) output - return

        println("hello kotlin")
        test()
        mySum(10,15)
        mySum(40,35)
    }

    // function
    fun test() {
        println("test function")
    }

    fun mySum(a:Int, b:Int) {
        println(a+b)
    }

}