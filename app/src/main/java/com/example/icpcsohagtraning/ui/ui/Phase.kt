package com.example.icpcsohagtraning.ui.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.icpcsohagtraning.R
import com.example.icpcsohagtraning.databinding.FragmentPhaseBinding
import com.example.icpcsohagtraning.ui.model.PhaseModel
import com.example.icpcsohagtraning.ui.model.PhaseRecycler
import com.example.icpcsohagtraning.ui.model.WeekModel
import com.example.icpcsohagtraning.ui.ui.Face.Companion.mainColor


class Phase : Fragment(R.layout.fragment_phase) {
    private lateinit var binding: FragmentPhaseBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPhaseBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
    //for example
        val arr=ArrayList<WeekModel>()
        arr.add(WeekModel("first lesson"))
        arr.add(WeekModel("second lesson"))
        arr.add(WeekModel("third lesson"))
        arr.add(WeekModel("forth lesson"))

        val arr2=ArrayList<PhaseModel>()
        arr2.add(PhaseModel("week1",arr))
        arr2.add(PhaseModel("week2",arr))
        arr2.add(PhaseModel("week3",arr))
        arr2.add(PhaseModel("week4",arr))

        val adapter = PhaseRecycler(arr2,requireContext())
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = adapter
    //*********************************************************************************88
        //Receive data
        val data=arguments?.getString("key_key")
        when(data)
        {
            "newcomers"->{
                binding.image.setImageResource(R.drawable.ne)
                binding.text.text="Welcome in NewComers"
            }
            "phase1"->{
                binding.image.setImageResource(R.drawable.ph1)
                binding.text.text="Welcome in Phase1"
            }
            "phase2"->{
                binding.image.setImageResource(R.drawable.ph2)
                binding.text.text="Welcome in Phase2"
            }
        }
     //************************************************************************************88
     //set main color of this page
     when(mainColor)
     {
         "red"->{binding.toolbar.setBackgroundResource(R.drawable.red_bar)}
         "yellow"->{binding.toolbar.setBackgroundResource(R.drawable.yellow_bar)}
         "blue"->{binding.toolbar.setBackgroundResource(R.drawable.blue_bar)}
     }

    }
}