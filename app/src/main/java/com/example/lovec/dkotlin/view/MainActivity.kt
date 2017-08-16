package com.example.lovec.dkotlin.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import com.example.lovec.dkotlin.R
import com.example.lovec.dkotlin.basicsyntax.functionMore

class MainActivity : AppCompatActivity() {
    var funMore= functionMore()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sum = funMore.sum(2, 3)
        println(sum)
    }

}
