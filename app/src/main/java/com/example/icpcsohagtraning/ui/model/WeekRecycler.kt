package com.example.icpcsohagtraning.ui.model

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.icpcsohagtraning.databinding.WeekModelBinding

class WeekRecycler(private val list1: ArrayList<WeekModel>) :
RecyclerView.Adapter<WeekRecycler.ViewHolder>() {
    inner class ViewHolder(val binding: WeekModelBinding) : RecyclerView.ViewHolder(binding.root) {
        var text = binding.text
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            WeekModelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list1[position]
        holder.text.text = "${position + 1}-" + item.text
    }

    override fun getItemCount(): Int {
        return list1.size
    }

}