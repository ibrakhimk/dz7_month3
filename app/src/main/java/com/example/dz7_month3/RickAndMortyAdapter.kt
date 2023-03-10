package com.example.dz7_month3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.dz7_month3.databinding.ItemRickAndMortyBinding

class RickAndMortyAdapter(
    val rickAndMortyList: ArrayList<RickAndMorty>,
    val onClick: (position: Int) -> Unit
) : Adapter<RickAndMortyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemRickAndMortyBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = rickAndMortyList.size


    inner class ViewHolder(private val binding: ItemRickAndMortyBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {

            val item = rickAndMortyList[adapterPosition]
            itemView.setOnClickListener{
                onClick(adapterPosition)
            }
            binding.apply {
                tvName.text = item.name
                tvRang.text = item.rank
                Glide.with(imgView).load(item.img).into(imgView)
            }
        }
    }
}

