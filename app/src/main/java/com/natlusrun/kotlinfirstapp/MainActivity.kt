package com.natlusrun.kotlinfirstapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        operations()
    }

    fun test(){
        result_tv.setText("test text")
    }
    @SuppressLint("SetTextI18n")
    fun operations() {
        add_btn.setOnClickListener(View.OnClickListener {
            val firstValue: String = first_number.text.toString()
            val secondValue: String = second_number.text.toString()

            val result = add(firstValue, secondValue)

            result_tv.setText("Result:" + result)

        })

        minus_btn.setOnClickListener(View.OnClickListener {

            val firstValue: String = first_number.text.toString()
            val secondValue: String = second_number.text.toString()
            val result = minus(firstValue, secondValue)
            result_tv.setText("Result:" + result)
        })

        multiply_btn.setOnClickListener(View.OnClickListener {

            val firstValue: String = first_number.text.toString()
            val secondValue: String = second_number.text.toString()
           // inputIsNotEmpty()
            val result = multiply(firstValue, secondValue)
            result_tv.setText("Result:" + result)
        })

        divide_btn.setOnClickListener(View.OnClickListener {

            val firstValue: String = first_number.text.toString()
            val secondValue: String = second_number.text.toString()
            val result = divide(firstValue, secondValue)
            result_tv.setText("Result:" + result)
        })
    }


    fun add(firstValue: String, secondValue: String): Int {
        val a: Int = Integer.parseInt(firstValue)
        val b: Int = Integer.parseInt(secondValue)

        val sum: Int = a + b
        return sum
    }

    fun minus(firstValue: String, secondValue: String): Int {
        val a: Int = Integer.parseInt(firstValue)
        val b: Int = Integer.parseInt(secondValue)

        val diff: Int = a - b
        return diff
    }

    fun multiply(firstValue: String, secondValue: String): Int {
        val a: Int = Integer.parseInt(firstValue)
        val b: Int = Integer.parseInt(secondValue)

        val product: Int = a * b
        return product
    }

    fun divide(firstValue: String, secondValue: String): Int {
        val a: Int = Integer.parseInt(firstValue)
        val b: Int = Integer.parseInt(secondValue)

        val reverso: Int = a / b
        return reverso
    }


}