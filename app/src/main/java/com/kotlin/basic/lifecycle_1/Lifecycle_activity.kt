package com.kotlin.basic.lifecycle_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kotlin.basic.R

class Lifecycle_activity : AppCompatActivity() {

    val thisName = "Lifecycle_activity"

    // step_1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
        Log.d(thisName,"onCreate()")
    }

    // step_2
    override fun onStart() {
        super.onStart()
        Log.d(thisName,"onStart()")
    }

    // step_3
    override fun onResume() {
        super.onResume()
        Log.d(thisName,"onResume()")
    }

    // step_4
    override fun onPause() {
        super.onPause()
        Log.d(thisName,"onPause()")
    }

    // step_5
    override fun onStop() {
        super.onStop()
        Log.d(thisName,"onStop()")
    }

    // step_5
    override fun onRestart() {
        super.onRestart()
        Log.d(thisName,"onRestart()")
    }

    // step_6
    override fun onDestroy() {
        super.onDestroy()
        Log.d(thisName,"onDestroy()")
    }
}