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
        const val KEY_FOR_IMG = "Img"
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
            add(RickAndMorty("Alive","Rick ","https://i.pinimg.com/originals/0d/82/2c/0d822cc58bf00ddca38ea288b08a6bed.jpg"))
            add(RickAndMorty("Alive","Morty Smith","https://i.pinimg.com/736x/66/83/da/6683da6fc8f5321d2dcb6023e03df4fb.jpg"))
            add(RickAndMorty("Dead","Albert Einstein","https://i.pinimg.com/564x/e6/a4/c6/e6a4c69e6fa0adc901e6dc1228070a78.jpg"))
            add(RickAndMorty("Alive","Jerry Smith","https://comicvine.gamespot.com/a/uploads/original/6/66303/4472081-tumblr_n04lnrmooh1rfbbc6o1_1280.png"))
        }
    }
    private fun onClick(position: Int){
        val adapter = RickAndMortyAdapter(rickAndMortyList,this::onClick)
        binding.recyclerView.adapter = adapter
        rickAndMortyList.apply {
            findNavController().navigate(R.id.firstFragment, bundleOf(
                KEY_FOR_PASSWORD to rickAndMortyList[position].rank,KEY_FOR_USERNAME to rickAndMortyList[position].name,
                KEY_FOR_IMG to rickAndMortyList[position].img))
        }
        }

}