package com.ismailmesutmujde.kotlinclassesandfunctions

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var myTextView: TextView
    private lateinit var myButton : Button

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

        // Class
        val homer = Simpson("Homer", 50 , "Nuclear", 100)
        println(homer.name)
        homer.setHeight(50)

        // Nullability
        var myString : String? =  null
        myString = "test"
        println(myString)

        var myAge : Int? = null
        //myAge = 50
        // !! : %100 olarak bu değişken null değil
        // ?  : Nullable işlemi yapmaya devam et, sonuç nullsa null göster
        println(myAge!! * 10)


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