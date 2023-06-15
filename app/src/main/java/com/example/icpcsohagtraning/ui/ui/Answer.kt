package com.example.icpcsohagtraning.ui.ui

import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.icpcsohagtraning.R
import com.example.icpcsohagtraning.databinding.FragmentAnswerBinding
import com.example.icpcsohagtraning.databinding.FragmentContentBinding
import com.example.icpcsohagtraning.databinding.ModelBinding
import com.example.icpcsohagtraning.ui.model.*
import com.example.icpcsohagtraning.ui.ui.Face.Companion.mainColor


class Answer : Fragment(R.layout.fragment_answer) {
    private lateinit var binding: FragmentAnswerBinding
    private lateinit var navController: NavController
    private var fontSize=30f
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAnswerBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
       //for example
        val arr=ArrayList<Model>()
        arr.add(Model("title","bodddddddddddddddy"))
        arr.add(Model("title","bodddddddddddddddy"))
        arr.add(Model("title","bodddddddddddddddy"))
        arr.add(Model("title","bodddddddddddddddy"))
        //to increase font size
        binding.zoomIn.setOnClickListener()
        {
            if(fontSize<40f)
            {
                fontSize+=2f
                val adapter = ModelRecycler(arr,requireContext(),fontSize)
                binding.recycler.layoutManager = LinearLayoutManager(requireContext())
                binding.recycler.adapter = adapter
            }

        }
        //to decrease font size
        binding.zoomOut.setOnClickListener()
        {
            if(fontSize>=27f)
            {
                fontSize-=2f
                val adapter = ModelRecycler(arr,requireContext(),fontSize)
                binding.recycler.layoutManager = LinearLayoutManager(requireContext())
                binding.recycler.adapter = adapter
            }
        }

        val adapter = ModelRecycler(arr,requireContext(),fontSize)
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = adapter
        //***********************************************************************
        var value=arguments?.getString("key")
        when(value)
        {
            "howstart"->{
                binding.image.setImageResource(R.drawable.howstart)
                binding.text.text="How to start"
            }
            "achievements"->{
                binding.image.setImageResource(R.drawable.achivements2)
                binding.text.text="Achievements"
            }
            "contest"->{
                binding.image.setImageResource(R.drawable.contest)
                binding.text.text="What is contest..?"
            }
            "icpc"->{
                binding.image.setImageResource(R.drawable.icpclogo2)
                binding.text.text="What is ICPC..?"
            }
        }
        //******************************************************************88
        //set main color of this page
        when(mainColor)
        {
            "red"->{binding.toolbar.setBackgroundResource(R.drawable.red_bar)}
            "yellow"->{binding.toolbar.setBackgroundResource(R.drawable.yellow_bar)}
            "blue"->{binding.toolbar.setBackgroundResource(R.drawable.blue_bar)}
        }
    }
}