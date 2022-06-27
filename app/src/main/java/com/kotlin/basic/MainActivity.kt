package com.kotlin.basic

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.basic.lifecycle_1.Lifecycle_activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent = Intent(this, Lifecycle_activity::class.java)
        startActivity(intent)

    }


}