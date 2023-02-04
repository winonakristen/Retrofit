package com.winona.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val list:ArrayList<DataModelItem>, val context:Context):
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        val userIdText:TextView = itemView.findViewById(R.id.user_id_txt)
//        val idText:TextView = itemView.findViewById(R.id.id_txt)
        val titleText:TextView = itemView.findViewById(R.id.title_txt)
//        val bodyText:TextView = itemView.findViewById(R.id.body_txt)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.design_layout, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = list[position]

        holder.apply {

            userIdText.text = currentItem.userId.toString()

//            idText.text = currentItem.id.toString()

            titleText.text = currentItem.title

//            bodyText.text = currentItem.body
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}