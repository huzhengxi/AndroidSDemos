package com.jason.servicedemo2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.onClick

open class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_server_btn.onClick {
            Log.e(TAG, "start_server_btn-onclick: ")
            startService(Intent(MainActivity@this, MyService::class.java))
        }

        stop_server_btn.onClick {
            stopService(Intent(MainActivity@this, MyService::class.java))
        }
    }

}