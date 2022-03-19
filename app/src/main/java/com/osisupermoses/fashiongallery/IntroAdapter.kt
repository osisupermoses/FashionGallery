package com.osisupermoses.fashiongallery

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osisupermoses.fashiongallery.databinding.IntroItemsBinding

class IntroAdapter(private val introList: List<Intro>)
    :RecyclerView.Adapter<IntroAdapter.IntroViewHolder>() {

    inner class IntroViewHolder(private val binding: IntroItemsBinding)
        :RecyclerView.ViewHolder(binding.root) {
            fun bindItem(intro: Intro) {
                binding.descTv.text = intro.desc
                binding.titleTv.text = intro.title
                binding.iconIv.setImageResource(intro.photo)
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroViewHolder {
        return IntroViewHolder(
            IntroItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: IntroViewHolder, position: Int) {
        holder.bindItem(introList[position])
    }

    override fun getItemCount(): Int {
        return introList.size
    }


}