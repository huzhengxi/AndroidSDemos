package com.jason.animationdemo.view

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.jason.animationdemo.R
import kotlinx.android.synthetic.main.activity_view_animation.*

class ViewAnimationActivity : AppCompatActivity() {
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.renew, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.id_menu_renew -> {
                recreate()
            }
        }
        return super.onOptionsItemSelected(item)
    }

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

        id_btn_rotate.setOnClickListener {
            id_btn_rotate.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))
        }
    }
}