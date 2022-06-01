package com.example.myfirstretro

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(private val bookList: List<Books>): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflate
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.book_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // add element to view holder
        val itemVM = bookList[position]
        holder.title.text = itemVM.title
        holder.description.text = itemVM.description
    }

    override fun getItemCount(): Int {
        // size of the list/datasource
        return bookList.size
    }
}

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val title : TextView = view.findViewById(R.id.titleText)
    val description : TextView = view.findViewById(R.id.descText)
}