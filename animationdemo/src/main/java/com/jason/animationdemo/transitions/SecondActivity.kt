package com.jason.animationdemo.transitions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import com.jason.animationdemo.R
import kotlinx.android.synthetic.main.activity_second.*
import org.jetbrains.anko.imageResource

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val transition = Explode()
        transition.excludeChildren(android.R.id.statusBarBackground, true)
        window.enterTransition = transition
        window.exitTransition = transition

        val resId = intent.extras?.getInt("resId")
        if (resId != null) {
            idImage.imageResource = resId
        }
    }
}