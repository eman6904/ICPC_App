package com.example.icpcsohagtraning.ui.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.icpcsohagtraning.R
import com.example.icpcsohagtraning.databinding.FragmentFaceBinding

class Face : Fragment(R.layout.fragment_face) {
    private lateinit var binding:FragmentFaceBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFaceBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        binding.intro.text="Through this application, provided by ICPC Sohag Community." +"\n"+
                "you can enjoy learning the basics of programming and using it to solve problems. " +"\n"+
                "here you can find :" +"\n"+
                "1-Matrial of NewComers." +"\n"+"\n"+
                "2-Matrial of Phase1." +"\n"+"\n"+
                "3-Matrial of Phase2." +"\n"+"\n"+
                "And other things you will like." +"\n"+"\n"+
                "**We wish you good use**"
        binding.welcome.text="Welcome My Friend In Our Community 😊"
    }
}