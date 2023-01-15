package com.padc.csh.module7.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padc.csh.module7.R
import kotlinx.android.synthetic.main.activity_news_item_detail.*

class NewsItemDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_item_detail)

        fab.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}