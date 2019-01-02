package com.mehmetkaya.etoast

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

/**
 * Created by mehmetkaya on 02.01.2019.
 */

object EToast {
    fun makeText(context: Context, message: String, duration: Int, type: EToastType): Toast {
        val toast = Toast(context)
        toast.duration = duration
        val layout = LayoutInflater.from(context).inflate(R.layout.layout_etoast, null, false)
        val layoutEToast_toastText = layout.findViewById(R.id.layoutEToast_toastText) as TextView
        val layoutEToast_toastType = layout.findViewById(R.id.layoutEToast_toastType) as LinearLayout
        val layoutEToast_toastIcon = layout.findViewById(R.id.layoutEToast_toastIcon) as ImageView
        layoutEToast_toastText.text = message
        when (type) {
            EToastType.SUCCESS -> {
                layoutEToast_toastType.setBackgroundResource(R.drawable.shape_success)
                layoutEToast_toastIcon.setImageResource(R.drawable.ic_check)
            }
            EToastType.WARNING -> {
                layoutEToast_toastType.setBackgroundResource(R.drawable.shape_warning)
                layoutEToast_toastIcon.setImageResource(R.drawable.ic_pan_tool)
            }
            EToastType.ERROR -> {
                layoutEToast_toastType.setBackgroundResource(R.drawable.shape_error)
                layoutEToast_toastIcon.setImageResource(R.drawable.ic_clear)
            }
            EToastType.INFO -> {
                layoutEToast_toastType.setBackgroundResource(R.drawable.shape_info)
                layoutEToast_toastIcon.setImageResource(R.drawable.ic_info_outline)
            }
            EToastType.DEFAULT -> {
                layoutEToast_toastType.setBackgroundResource(R.drawable.shape_default)
                layoutEToast_toastIcon.visibility = View.GONE
            }
        }
        toast.view = layout
        return toast
    }
}