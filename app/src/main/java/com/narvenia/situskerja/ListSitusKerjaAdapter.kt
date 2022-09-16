package com.narvenia.situskerja

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ListSitusKerjaAdapter(private val listSitusKerja: ArrayList<SitusKerja>) : RecyclerView.Adapter<ListSitusKerjaAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback : OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_situs, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val situs = listSitusKerja[position]
        Glide.with(holder.itemView.context)
            .load(situs.photoSitus)
            .apply(RequestOptions().override(55, 55))
            .into(holder.tvSitusPhoto)
        holder.tvNameSitus.text = situs.nameSitus
        holder.tvNameDomain.text = situs.domainSitus
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(
                listSitusKerja[holder.position]
            )
        }
    }

    override fun getItemCount() = listSitusKerja.size

    interface OnItemClickCallback {
        fun onItemClicked(data: SitusKerja)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNameSitus : TextView = itemView.findViewById(R.id.tv_situsName)
        var tvNameDomain : TextView = itemView.findViewById(R.id.tv_domainName)
        var tvSitusPhoto : ImageView = itemView.findViewById(R.id.tv_situsPhoto)
    }
}