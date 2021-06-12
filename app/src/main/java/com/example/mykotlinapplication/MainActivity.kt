package com.example.mykotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mykotlinapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var countOfClick = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            test1()
        }

        binding.button2.setOnClickListener {
            test2()
        }

        binding.button3.setOnClickListener {
            test3()
        }

        binding.button4.setOnClickListener {
            test4()
        }

        binding.button5.setOnClickListener {
            test5()
        }

        binding.button6.setOnClickListener {
            test6()
        }
    }

    private fun test1() {
        println(AudiQ7)
        val car = CarData("D", 2)
        binding.textView.text = "model " + AudiQ7.name + "; price " + AudiQ7.price
    }

    private fun test2() {
        val myCar = CarData("Maserati Levante", 6000000)
        val hisCar = myCar.copy(price = 7000000)
        binding.textView.text = hisCar.name + " " + hisCar.price
    }

    private fun test3() {
        countOfClick++
        when(countOfClick) {
            1 -> binding.textView.text = "Вы кликнули один раз!"
            2 -> binding.textView.text = "Второй раз!"
            3 -> binding.textView.text = "Третий!"
            4 -> binding.textView.text = "О-па, о-па, четвёртый!"
            else -> binding.textView.text = "А это уже слишком много."
        }
    }

    private fun test4() {
        var myString = ""
       val myArray = listOf<String>("1", "3", "5", "7", "9")
        myArray.forEach { myString += it }
        binding.textView.text = myString
    }

    private fun test5() {
        var myString = ""
        for (i in 10 downTo 0 step 2){
            myString += i
        }
        binding.textView.text = myString
    }

    private fun test6() {
        var myString = ""
        repeat(20){
            myString += 3
        }
        binding.textView.text = myString
    }
}
