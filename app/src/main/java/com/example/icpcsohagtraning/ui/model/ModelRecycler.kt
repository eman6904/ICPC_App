package com.example.icpcsohagtraning.ui.model

import android.content.Context
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.icpcsohagtraning.databinding.ModelBinding
import com.example.icpcsohagtraning.databinding.PhaseModelBinding
import com.example.icpcsohagtraning.ui.ui.Answer


class ModelRecycler(private val list1: ArrayList<Model>, val context: Context,var fontSize:Float) :
    RecyclerView.Adapter<ModelRecycler.ViewHolder>() {
    inner class ViewHolder(val binding: ModelBinding) : RecyclerView.ViewHolder(binding.root) {
        var title = binding.title
        var body = binding.body
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ModelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list1[position]
        holder.title.text = item.title
        holder.body.text = item.body
        //for zoom in/out
        holder.title.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)
        holder.body.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize-15f)
    }

    override fun getItemCount(): Int {
        return list1.size
    }

}