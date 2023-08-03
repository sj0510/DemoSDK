package com.sj.mylibrarysdk

import android.content.Context
import android.widget.Toast

object MySdk {
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}