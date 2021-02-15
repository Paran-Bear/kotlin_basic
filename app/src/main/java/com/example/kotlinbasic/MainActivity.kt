package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var stat=1
        btn.setOnClickListener{
            if(stat==1){
            hello.setText("Bye World")
            btn.setText("Clicked !!")
            stat=0
            }
            else
            {
                hello.setText("hello World")
                btn.setText("Click !!")
                stat=1
            }

        }
    }
}