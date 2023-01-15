package com.padc.csh.module7.viewholders

import android.view.View
import com.padc.csh.module7.delegate.NewsItemDelegate

class CustomPostViewHolder(itemView:View,delegate: NewsItemDelegate):BaseViewHolder(itemView,delegate) {

    init {
        itemView.setOnClickListener {
            delegate.onCustomPost()
        }
    }
}