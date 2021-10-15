package com.learning.navigationsample.ui.users

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.learning.navigationsample.databinding.ItemLayoutBinding
import com.learning.navigationsample.model.response.UserObjectResponse


class UserAdapter(
    private var users: ArrayList<UserObjectResponse>
) : RecyclerView.Adapter<UserAdapter.DataViewHolder>() {

    inner class DataViewHolder(val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val binding = ItemLayoutBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(binding)
    }

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        with(holder) {
            with(users?.get(position)) {
                binding.textViewUserName.text = this?.username
                binding.textViewUserEmail.text = this?.email
            }
        }
    }

    fun addData(list: ArrayList<UserObjectResponse>) {
        users.addAll(list)
    }
}