package com.example.toastlib

import android.content.Context
import android.widget.Toast

class ToastMessage {
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}