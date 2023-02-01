package com.example.dz7_month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toast.*
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.dz7_month3.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    companion object{
        const val KEY_FOR_USERNAME = "User"
        const val KEY_FOR_PASSWORD = "password"
    }

    private lateinit var binding: FragmentSecondBinding
    private val rickAndMortyList = ArrayList<RickAndMorty>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = RickAndMortyAdapter(rickAndMortyList,this::onClick)
        binding.recyclerView.adapter = adapter

    }

    private fun loadData() {
        rickAndMortyList.apply {
            add(RickAndMorty("Alive","Rick Sanchez"))
            add(RickAndMorty("Alive","Morty Smith"))
            add(RickAndMorty("Dead","Albert Einstein"))
            add(RickAndMorty("Alive","Jerry Smith"))
        }
    }
    private fun onClick(position: Int){

        }

}