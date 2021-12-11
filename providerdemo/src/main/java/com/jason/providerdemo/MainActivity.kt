package com.jason.providerdemo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        get_sms_btn.setOnClickListener {
            val uri = Uri.parse("content://sms")
            val cursor = contentResolver.query(uri, null, null, null, null)
            if (cursor != null) {
                var sms = "";
                while (cursor.moveToNext()) {
                    for (i in 0 until cursor.columnCount) {
                        sms = "$sms, ${cursor.getString(i)}"
                    }
                    Log.e(TAG, "onCreate: " + sms)
                }
            }
        }

        expand_list_btn.setOnClickListener {
            startActivity(Intent(this, ExpandListActivity::class.java))
        }
    }
}