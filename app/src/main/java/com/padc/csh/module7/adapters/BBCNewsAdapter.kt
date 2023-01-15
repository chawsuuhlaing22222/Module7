package com.padc.csh.module7.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.csh.module7.R
import com.padc.csh.module7.delegate.NewsItemDelegate
import com.padc.csh.module7.viewholders.BBCNewsViewHolder
import com.padc.csh.module7.viewholders.BaseViewHolder
import com.padc.csh.module7.viewholders.CustomPostViewHolder

class BBCNewsAdapter(var delegate: NewsItemDelegate): RecyclerView.Adapter<BaseViewHolder>() {

    private val BBCNEWS_ITEM_TYPE=1
    private val CUSTOM_ITEM_TYPE=2
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {

       when(viewType){

           BBCNEWS_ITEM_TYPE->{
               var itemView=LayoutInflater.from(parent.context).inflate(R.layout.bbc_news_layout,parent,false)
               return BBCNewsViewHolder(itemView,delegate)
           }

           CUSTOM_ITEM_TYPE->{
               var itemView=LayoutInflater.from(parent.context).inflate(R.layout.custom_post_layout,parent,false)
               return CustomPostViewHolder(itemView,delegate)
           }

           else->{
               var itemView=LayoutInflater.from(parent.context).inflate(R.layout.custom_post_layout,parent,false)
               return CustomPostViewHolder(itemView,delegate)
           }
       }

    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 12
    }

    override fun getItemViewType(position: Int): Int {
        return when{
            position%3==0->{
                BBCNEWS_ITEM_TYPE
            }
            else -> {CUSTOM_ITEM_TYPE}
        }
    }
}