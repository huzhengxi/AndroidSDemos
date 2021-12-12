package com.jason.animationdemo.view

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.jason.animationdemo.R
import kotlinx.android.synthetic.main.activity_view_animation.*

class ViewAnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_animation)

        id_txt_alpha.setOnClickListener {
            val alphaAnimation: Animation =
                AnimationUtils.loadAnimation(this, R.anim.alpha)
            id_txt_alpha.startAnimation(alphaAnimation)
        }

        id_btn_scale.setOnClickListener {
            id_btn_scale.startAnimation(AnimationUtils.loadAnimation(this, R.anim.scale))
        }

        id_btn_translate.setOnClickListener {
            id_btn_translate.startAnimation(AnimationUtils.loadAnimation(this, R.anim.translate))
        }
    }
}