package com.example.dz7_month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

    private fun getArgumen() {
        arguments?.apply {
            val username =getString(KEY_FOR_USERNAME)
            val passwor = getString(KEY_FOR_PASSWORD)
            binding.apply {
                nameSend.text = username
                rangSend.text = passwor
            }
        }


    }
}