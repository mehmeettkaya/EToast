package com.mehmetkaya.etoastview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mehmetkaya.etoast.EToast
import com.mehmetkaya.etoast.EToastDuration
import com.mehmetkaya.etoast.EToastType
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityMain_btnShowSuccessToast.setOnClickListener {
            EToast.makeText(this, "Success EToast", EToastDuration.SHORT, EToastType.SUCCESS).show()
        }

        activityMain_btnShowErrorToast.setOnClickListener {
            EToast.makeText(this, "Error EToast", EToastDuration.SHORT, EToastType.ERROR).show()
        }

        activityMain_btnShowWarningToast.setOnClickListener {
            EToast.makeText(this, "Warning EToast", EToastDuration.SHORT, EToastType.WARNING).show()
        }

        activityMain_btnShowInfoToast.setOnClickListener {
            EToast.makeText(this, "Info EToast", EToastDuration.SHORT, EToastType.INFO).show()
        }

        activityMain_btnShowDefaultToast.setOnClickListener {
            EToast.makeText(this, "Default EToast", EToastDuration.SHORT, EToastType.DEFAULT).show()
        }
    }
}
