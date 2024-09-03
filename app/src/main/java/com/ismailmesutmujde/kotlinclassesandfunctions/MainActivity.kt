package com.ismailmesutmujde.kotlinclassesandfunctions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("hello kotlin")
        test()
    }

    // function
    fun test() {
        println("test function")
    }

}