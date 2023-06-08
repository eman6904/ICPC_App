package com.example.icpcsohagtraning.ui.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.icpcsohagtraning.R
import com.example.icpcsohagtraning.databinding.FragmentAnswerBinding
import com.example.icpcsohagtraning.databinding.FragmentContentBinding


class Answer : Fragment(R.layout.fragment_answer) {
    private lateinit var binding: FragmentAnswerBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAnswerBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.hide()

    }
}