package com.example.icpcsohagtraning.ui.ui

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.icpcsohagtraning.R
import com.example.icpcsohagtraning.databinding.FragmentHomeBinding
import com.example.icpcsohagtraning.ui.ui.Face.Companion.mainColor


class Home : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
//************************************************************************
        //for navigation and send data
        binding.icpc.setOnClickListener()
        {
            val bundle1 = bundleOf("key" to "icpc")
            navController.navigate(R.id.action_home2_to_answer,bundle1)
        }
        binding.howstart.setOnClickListener()
        {
            val bundle1 = bundleOf("key" to "howstart")
            navController.navigate(R.id.action_home2_to_answer,bundle1)
        }
        binding.achievements.setOnClickListener()
        {
            val bundle1 = bundleOf("key" to "achievements")
            navController.navigate(R.id.action_home2_to_answer,bundle1)
        }
        binding.contest.setOnClickListener()
        {
            val bundle1 = bundleOf("key" to "contest")
            navController.navigate(R.id.action_home2_to_answer,bundle1)
        }
        binding.content.setOnClickListener()
        {
            navController.navigate(R.id.action_home2_to_content2)
        }
        //**********************************************************************
        //set main color for this page
        when(mainColor)
        {
            "red"->{binding.toolbar.setBackgroundColor(Color.parseColor("#971414"))
             binding.icpc.setBackgroundResource(R.drawable.text_red)
             binding.howstart.setBackgroundResource(R.drawable.text_red)
             binding.contest.setBackgroundResource(R.drawable.text_red)
             binding.content.setBackgroundResource(R.drawable.text_red)
             binding.achievements.setBackgroundResource(R.drawable.text_red)
            }
            "yellow"->{binding.toolbar.setBackgroundColor(Color.parseColor("#FFC107"))
                binding.icpc.setBackgroundResource(R.drawable.text_yellow)
                binding.howstart.setBackgroundResource(R.drawable.text_yellow)
                binding.contest.setBackgroundResource(R.drawable.text_yellow)
                binding.content.setBackgroundResource(R.drawable.text_yellow)
                binding.achievements.setBackgroundResource(R.drawable.text_yellow)
            }
            "blue"->{binding.toolbar.setBackgroundColor(Color.parseColor("#2196F3"))
                binding.icpc.setBackgroundResource(R.drawable.text_blue)
                binding.howstart.setBackgroundResource(R.drawable.text_blue)
                binding.contest.setBackgroundResource(R.drawable.text_blue)
                binding.content.setBackgroundResource(R.drawable.text_blue)
                binding.achievements.setBackgroundResource(R.drawable.text_blue)
            }
        }
    }

}