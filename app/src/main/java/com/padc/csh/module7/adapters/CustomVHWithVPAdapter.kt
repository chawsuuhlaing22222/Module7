package com.padc.csh.module7.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.csh.module7.R
import com.padc.csh.module7.viewholders.CustomViewWithVPViewHolder

 class CustomVHWithVPAdapter: RecyclerView.Adapter<CustomViewWithVPViewHolder>() {
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewWithVPViewHolder {

         val viewholder:View=LayoutInflater.from(parent.context).inflate(R.layout.vp_custom_view,parent,false)
        return CustomViewWithVPViewHolder((viewholder))
     }

     override fun onBindViewHolder(holder: CustomViewWithVPViewHolder, position: Int) {

     }

     override fun getItemCount(): Int {
        return 5
     }
 }