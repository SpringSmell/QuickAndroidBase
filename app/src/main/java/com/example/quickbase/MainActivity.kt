package com.example.quickbase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        titleTv.setOnClickListener {
            var i=cast<Long>()
        }
    }

     fun <T> cast():T{
         var str="120"
         return str .toInt() as T
    }
}
