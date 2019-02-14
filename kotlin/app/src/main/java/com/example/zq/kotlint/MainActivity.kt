package com.example.zq.kotlint

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //数据类型
        val binaryType = 0b1100     //二进制
        val longType = 0x10f        //十六进制 hex decimal :以0x开头
        //注意 kotlin 不支持八进制
        val floatType = 12.3f       //float 类型
        val doubleType = 12.3       //小数默认double类型

        //数字下划线
        val oneMillion = 1_000_000
        val creditCardNumber = 1234_5678_9012_3456L
        val socialSecurityNumber = 999_99_9999L
        val hexBytes = 0xFF_EC_DE_5E
        val bytes = 0b11010010_01101001_10010100_10010010

        //数字装箱后不一定保留同一性，内存地址有可能会发生变化，
        //装箱之后由数字变成了对象，可能是生成了一个对象，相同的数字装箱多次，生成的装箱对象内存地址可能不同
        // == 比较的是值  === 比较的是内存地址
        val a: Int = 1000
        Log.d("MainActivity", "" + (a == a))  // true
        val b: Int? = a
        val c: Int? = a
        Log.d("MainActivity", "" + (b === c)) // false
        //数字装箱后虽然内存地址不一样，但是值还是相等的
        Log.d("MainActivity", "" + (b == c))

        //有自动装箱，限定了哪几种类型
        //但是不同的类型，不可以自动转换，要想转换必须使用强转，

        val remainder1 = 9 % 4
        val remainder2 = 9 % -4
        val remainder3 = -9 % 4
        val remainder4 = -9 % -4
        Log.d("MainActivity","\remainder1:" + remainder1 + "\rremainder2:" + remainder2 + "\remainder3:" + remainder3 + "\remainder4:" + remainder4)
    }
}
