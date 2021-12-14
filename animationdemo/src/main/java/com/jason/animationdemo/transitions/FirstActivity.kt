package com.jason.animationdemo.transitions

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import android.util.Pair
import android.view.View
import com.jason.animationdemo.R
import kotlinx.android.synthetic.main.activity_first.*
import org.jetbrains.anko.onClick

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        idImage1.setOnClickListener { goSecondActivity(R.drawable.pic1, idImage1) }
        idImage2.setOnClickListener { goSecondActivity(R.drawable.pic2, idImage2) }
        idImage3.setOnClickListener { goSecondActivity(R.drawable.pic3, idImage3) }
        idImage4.setOnClickListener { goSecondActivity(R.drawable.pic4, idImage4) }
    }

    private fun goSecondActivity(resId: Int, view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("resId", resId)
        val transition = Explode()
        transition.excludeChildren(android.R.id.statusBarBackground, true)
        window.enterTransition = transition
        window.exitTransition = transition
        val shareElement = Pair.create(view, "image")
        val activityOption = ActivityOptions.makeSceneTransitionAnimation(this, shareElement)
        startActivity(intent, activityOption.toBundle())
    }
}