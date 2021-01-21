package com.natlusrun.kotlinfirstapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var firstValue = 0
    private var secondValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operations()
    }

    private fun operations() {
        add_btn.setOnClickListener(this)
        minus_btn.setOnClickListener(this)
        multiply_btn.setOnClickListener(this)
        divide_btn.setOnClickListener(this)
    }

    private fun getNumber() {
        firstValue = Integer.parseInt(first_number.text.toString())
        secondValue = Integer.parseInt(second_number.text.toString())

    }

    private fun add(firstValue: Int, secondValue: Int): Int {
        return firstValue + secondValue
    }

    private fun minus(firstValue: Int, secondValue: Int): Int {
        return firstValue - secondValue
    }

    private fun multiply(firstValue: Int, secondValue: Int): Int {
        return  firstValue * secondValue
    }

    private fun divide(firstValue: Int, secondValue: Int): Int {
        return firstValue / secondValue
    }

    override fun onClick(p0: View?) {
        if (first_number.text.isNotEmpty() && second_number.text.isNotEmpty()) {
            when (p0?.id) {
                R.id.add_btn -> {
                    getNumber()
                    setResults(add(firstValue, secondValue))
                }
                R.id.minus_btn -> {
                    getNumber()
                    setResults(minus(firstValue, secondValue))
                }
                R.id.divide_btn -> {
                    if(second_number.text.isNotEmpty()){
                        getNumber()
                        setResults(divide(firstValue, secondValue))
                    }else{
                        showToast("На 0 делить нельзя!")
                    }

                }
                R.id.multiply_btn -> {
                    getNumber()
                    setResults(multiply(firstValue, secondValue))
                }
            }
        } else {
            showToast("Запаолните все поля пожалуйста!")
        }
    }

    private fun setResults(res: Int) {
        result_tv.text = ("Result:$res")
    }
}