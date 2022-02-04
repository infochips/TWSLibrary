package com.example.mytoastlibrary

import android.content.Context
import android.widget.Toast

object AwesomeToast {

    fun show(context: Context){
        Toast.makeText(context,"Hello E-Infochips",Toast.LENGTH_SHORT).show()
    }
}