package com.udacity.FirsrtProject.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udacity.FirsrtProject.R
import com.udacity.FirsrtProject.databinding.FragmentInstructionsBinding

class InstructionsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentInstructionsBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_instructions,
            container,
            false)

        binding.nextButton.setOnClickListener {
            findNavController().navigate(InstructionsFragmentDirections.actionInstructionsFragmentToShoeListFragment())
        }

        return binding.root
    }
}