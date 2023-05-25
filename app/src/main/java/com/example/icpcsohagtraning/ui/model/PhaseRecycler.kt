package com.example.icpcsohagtraning.ui.model

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.icpcsohagtraning.databinding.PhaseModelBinding

class PhaseRecycler(private val list1: ArrayList<PhaseModel>,val context: Context) :
    RecyclerView.Adapter<PhaseRecycler.ViewHolder>() {
    inner class ViewHolder(val binding: PhaseModelBinding) : RecyclerView.ViewHolder(binding.root) {
        var text = binding.text
        var recycler=binding.recycler2

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            PhaseModelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list1[position]
        holder.text.text =  item.text
        val adapter = WeekRecycler(item.arr)
        holder.recycler.layoutManager = LinearLayoutManager(context)
        holder.recycler.adapter = adapter
    }

    override fun getItemCount(): Int {
        return list1.size
    }

}