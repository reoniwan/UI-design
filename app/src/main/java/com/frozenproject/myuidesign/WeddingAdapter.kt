package com.frozenproject.myuidesign

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_container_event.view.*

class WeddingAdapter(private val list: List<WeddingModel>): RecyclerView.Adapter<WeddingAdapter.WeddingViewModel>() {

    inner class WeddingViewModel(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(data: WeddingModel){
            Glide.with(itemView.context)
                .load(data.img)
                .into(itemView.img_best_event)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeddingViewModel {
        return WeddingViewModel(LayoutInflater.from(parent.context).inflate(
            R.layout.item_container_event,
            parent,
            false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: WeddingViewModel, position: Int) {
        holder.bind(list[position])
    }
}