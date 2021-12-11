package com.jason.animationdemo.frame

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jason.animationdemo.R
import kotlinx.android.synthetic.main.activity_frame_animation.*
import kotlinx.android.synthetic.main.activity_main.*

class FrameAnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_animation)
        val animationDrawable: AnimationDrawable = id_view.background as AnimationDrawable;
        id_btn_start.setOnClickListener {
            animationDrawable.start()
        }

        id_btn_stop.setOnClickListener {
            animationDrawable.stop()
        }
    }
}