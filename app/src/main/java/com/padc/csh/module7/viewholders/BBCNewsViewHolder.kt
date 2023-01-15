package com.padc.csh.module7.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.padc.csh.module7.delegate.NewsItemDelegate

class BBCNewsViewHolder(itemView: View,delegate: NewsItemDelegate): BaseViewHolder(itemView,delegate) {

    init {
        itemView.setOnClickListener {
            delegate.onTapNews()
        }
    }
}