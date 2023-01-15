package com.padc.csh.module7.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.padc.csh.module7.R
import com.padc.csh.module7.adapters.BBCNewsAdapter
import com.padc.csh.module7.delegate.NewsItemDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),NewsItemDelegate {
    private lateinit var newsAdapter:BBCNewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        toolbar.setNavigationOnClickListener {
            startActivity(Intent(this,CustomViewWithVPActivity::class.java))
        }

        newsAdapter=BBCNewsAdapter(this)
        rvNews.adapter=newsAdapter
        rvNews.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        //rvNews.layoutManager=GridLayoutManager(this,2)
    }

    override fun onTapNews() {
       startActivity(Intent(this,NewsItemDetailActivity::class.java))
    }

    override fun onCustomPost() {
        startActivity(Intent(this,CustomPostDetailActivity::class.java))
    }

}