package com.example.icpcsohagtraning.ui.ui

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.icpcsohagtraning.R
import com.example.icpcsohagtraning.databinding.FragmentContentBinding
import com.example.icpcsohagtraning.ui.ui.Face.Companion.mainColor


class Content : Fragment(R.layout.fragment_content) {
    private lateinit var binding: FragmentContentBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentContentBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        //for navigation
        binding.newcomersText.setOnClickListener()
        {
            val bundle1 = bundleOf("key_key" to "newcomers")
            navController.navigate(R.id.action_content2_to_phase,bundle1)
        }
        binding.phase1Text.setOnClickListener()
        {
            val bundle1 = bundleOf("key_key" to "phase1")
            navController.navigate(R.id.action_content2_to_phase,bundle1)
        }
        binding.phase2Text.setOnClickListener()
        {
            val bundle1 = bundleOf("key_key" to "phase2")
            navController.navigate(R.id.action_content2_to_phase,bundle1)
        }
        //*****************************************************************88
        //set main color of this page
        when(mainColor)
        {
            "red"->{binding.toolbar.setBackgroundResource(R.drawable.red_bar)
             binding.NewComer.setBackgroundColor(Color.parseColor("#971414"))
             binding.Phase1.setBackgroundColor(Color.parseColor("#971414"))
             binding.Phase2.setBackgroundColor(Color.parseColor("#971414"))
            }
            "yellow"->{binding.toolbar.setBackgroundResource(R.drawable.yellow_bar)
                binding.NewComer.setBackgroundColor(Color.parseColor("#FFC107"))
                binding.Phase1.setBackgroundColor(Color.parseColor("#FFC107"))
                binding.Phase2.setBackgroundColor(Color.parseColor("#FFC107"))
            }
            "blue"->{binding.toolbar.setBackgroundResource(R.drawable.blue_bar)
                binding.NewComer.setBackgroundColor(Color.parseColor("#2196F3"))
                binding.Phase1.setBackgroundColor(Color.parseColor("#2196F3"))
                binding.Phase2.setBackgroundColor(Color.parseColor("#2196F3"))
            }
        }
    }
}