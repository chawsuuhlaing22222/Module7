
package com.padc.csh.module7.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padc.csh.module7.R
import com.padc.csh.module7.adapters.CustomVHWithVPAdapter
import kotlinx.android.synthetic.main.activity_custom_view_with_vpactivity.*

class CustomViewWithVPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view_with_vpactivity)

        vp2.adapter=CustomVHWithVPAdapter()
    }
}