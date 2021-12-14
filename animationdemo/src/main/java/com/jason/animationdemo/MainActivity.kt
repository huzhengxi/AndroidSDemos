package com.jason.animationdemo

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jason.animationdemo.frame.FrameAnimationActivity
import com.jason.animationdemo.transitions.FirstActivity
import com.jason.animationdemo.view.ViewAnimationActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        id_btn_frame.setOnClickListener {
            startActivity(Intent(this, FrameAnimationActivity::class.java))
        }

        id_btn_view.setOnClickListener {
            startActivity(Intent(this, ViewAnimationActivity::class.java));
        }

        id_btn_transitions.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }
    }
}