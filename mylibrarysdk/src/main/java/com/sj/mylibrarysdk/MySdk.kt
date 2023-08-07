package com.sj.mylibrarysdk

import android.content.Context
import android.widget.Toast

public class ToastSDK {
    public fun showToast(context: Context, message: String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}
