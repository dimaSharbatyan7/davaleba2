package com.example.davaleba_2.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.davaleba_2.R

class ViewPagerAdapter(private val items: List<String>) : RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position], position)
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.textView)

        fun bind(text: String, position: Int) {
            textView.text = text

            when (position) {
                0 -> itemView.setBackgroundColor(Color.rgb(134,181,252))
                1 -> itemView.setBackgroundColor(Color.rgb(252, 134, 170))
                2 -> itemView.setBackgroundColor(Color.rgb(134, 252, 181))
                else -> itemView.setBackgroundColor(Color.WHITE)
            }
        }
    }
}
