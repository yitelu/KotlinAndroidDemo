package com.ytl.kotlinandroiddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var returnVauleLambda = { a:Int, b:Int ->
            println("Multiplication")
            a * b
        }
        println(returnVauleLambda(9, 5))

        reassignedVar()

        myTheNullability()

        runThatArray()
    }

    fun reassignedVar() {
        print("dude  ")
        var age = 3
        println("Current Age :" + age)
        //after 10 years
        age = 13
        println("\n10 years later..Current Age : " + age)
    }

    fun myTheNullability(){
        print("hey")
//        var nullableGreeting: String? = "hey Kotlin"
//        nullableGreeting = null
//        println("check null")
//        println(nullableGreeting + " check null")
    }

    fun runThatArray(){
        val array = arrayOf(1, 2, 3, 4, 5, 6)
        //longhand
        array.forEach { item -> println(item * 4) }
        //Shorthand
        array.forEach { println(it * 4) }
    }
}
