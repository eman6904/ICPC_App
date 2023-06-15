package com.example.icpcsohagtraning.ui.ui

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Context.CLIPBOARD_SERVICE
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContentProviderCompat
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.icpcsohagtraning.R
import com.example.icpcsohagtraning.databinding.FragmentFaceBinding

class Face : Fragment(R.layout.fragment_face) {
    private lateinit var binding: FragmentFaceBinding
    private lateinit var navController: NavController

    companion object {
        var mainColor = ""
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFaceBinding.bind(view)
        navController = Navigation.findNavController(view)

        val activity = activity as MainActivity
        activity.supportActionBar?.show()
        activity.supportActionBar?.title = ""
        binding.intro.text = "Through this application, provided by ICPC Sohag Community." + "\n" +
                "you can enjoy learning the basics of programming and using it to solve problems. " + "\n" +
                "here you can find :" + "\n" +
                "1-Matrial of NewComers." + "\n" + "\n" +
                "2-Matrial of Phase1." + "\n" + "\n" +
                "3-Matrial of Phase2." + "\n" + "\n" +
                "And other things you will like." + "\n" + "\n" +
                "**We wish you good use**"
        binding.welcome.text = "Welcome Our Friend In Our Community 😊"

        binding.getstart.setOnClickListener()
        {
            navController.navigate(R.id.action_face_to_home2)
        }
        //*********************************************************************88
        //set main color for this page
//        val window = activity?.window
//        window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//        window?.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
//        window?.statusBarColor = requireContext().resources.getColor(R.color.red)

        when (mainColor) {
            "red" -> {
                val window = activity?.window
                window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                window?.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                window?.statusBarColor = requireContext().resources.getColor(R.color.red)


                activity.supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#971414")))
                binding.getstart.setBackgroundColor(Color.parseColor("#971414"))
            }
            "blue" -> {
                //to change color of action bar
                activity.supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#2196F3")))
                binding.getstart.setBackgroundColor(Color.parseColor("#2196F3"))
            }
            "yellow" -> {
                activity.supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FFC107")))
                binding.getstart.setBackgroundColor(Color.parseColor("#FFC107"))
            }
        }
    }

    //for menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.blue -> {
                mainColor = "blue"
                val activity = activity as MainActivity
                activity.supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#2196F3")))
                binding.getstart.setBackgroundColor(Color.parseColor("#2196F3"))
            }
            R.id.red -> {
                mainColor = "red"
                val activity = activity as MainActivity
                activity.supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#971414")))
                binding.getstart.setBackgroundColor(Color.parseColor("#971414"))
            }
            R.id.yellow -> {
                mainColor = "yellow"
                val activity = activity as MainActivity
                activity.supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FFC107")))
                binding.getstart.setBackgroundColor(Color.parseColor("#FFC107"))
            }
            R.id.d_mode -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            R.id.l_mode -> {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }

        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menuu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
    //*********************************************************
    //for copy text
    private fun copyTextToClipboard() {
        val activity = activity as MainActivity
        val textToCopy = binding.intro.text
        val clipboardManager = activity!!.applicationContext.getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
        val clipData = ClipData.newPlainText("text", textToCopy)
        clipboardManager.setPrimaryClip(clipData)
        Toast.makeText(requireContext(), "Text copied to clipboard", Toast.LENGTH_LONG).show()
    }
}