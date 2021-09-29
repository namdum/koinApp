package com.example.kionapp.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kionapp.databinding.ItemLayoutBinding
import com.example.kionapp.R
import com.example.kionapp.data.model.User
//import com.example.kionapp.databinding.ItemLayoutBinding

class MainAdapter(
    private val users: ArrayList<User>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : DataViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemLayoutBinding.inflate(
            inflater,
            parent, false
        )/**/

        return DataViewHolder(binding)
    }

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<User>) {
        users.addAll(list)
    }
    class DataViewHolder(var binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(user: User) {
            binding.textViewUserName.text = user.name
            binding.textViewUserEmail.text = user.email
            Glide.with(binding.root.context)
                .load(user.avatar)
                .placeholder(R.drawable.ic_launcher_background)
                .into(binding.imageViewAvatar)
        }
    }
}