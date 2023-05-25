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
        binding.intro.text="Through This Application, Provided By ICPC Sohag Community." +"\n"+
                "You Can Enjoy Learning The Basics Of Programming And Using It To Solve Problems. " +"\n"+
                "Here You Can Find :" +"\n"+
                "1-Matrial Of NewComers." +"\n"+"\n"+
                "2-Matrial Of Phase1." +"\n"+"\n"+
                "3-Matrial Of Phase2." +"\n"+"\n"+
                "And Other Things You Will Like." +"\n"+"\n"+
                "**We Wish You Good Use**"
        binding.welcome.text="Welcome My Friend In Our Community 😊"
    }
}