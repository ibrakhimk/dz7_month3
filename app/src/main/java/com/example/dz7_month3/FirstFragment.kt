package com.example.dz7_month3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.dz7_month3.SecondFragment.Companion.KEY_FOR_IMG
import com.example.dz7_month3.SecondFragment.Companion.KEY_FOR_PASSWORD
import com.example.dz7_month3.SecondFragment.Companion.KEY_FOR_USERNAME
import com.example.dz7_month3.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getArgumen()
    }

    @SuppressLint("CheckResult")
    private fun getArgumen() {
        arguments?.apply {
            val username =getString(KEY_FOR_USERNAME)
            val password = getString(KEY_FOR_PASSWORD)
            val img = getString(KEY_FOR_IMG)
            binding.apply {
                nameSend.text = username
                rangSend.text = password
            }
        }


    }
}