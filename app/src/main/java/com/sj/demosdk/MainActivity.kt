package com.sj.demosdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sj.mylibrarysdk.MySdk

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun launchSDK(view: View) {
        MySdk.showToast(this,"Welcome! This is SDK World")

    }
}