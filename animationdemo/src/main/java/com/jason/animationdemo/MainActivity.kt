package com.jason.animationdemo

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animationDrawable: AnimationDrawable = id_view.background as AnimationDrawable;
        id_btn_start.setOnClickListener {
            animationDrawable.start()
        }

        id_btn_stop.setOnClickListener {
            animationDrawable.stop()
        }
    }
}