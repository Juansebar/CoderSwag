package com.juanse.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.juanse.coderswag.Model.Category
import com.juanse.coderswag.R

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>): RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    // Called when new ViewHolders are needed
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        // Inflate the view for the very first time if there isn't already a recyclerView available to re-use
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)

        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }


    // Display Data at a specific location
    // "Binding" is preparing a child view to display data according to a position in the adapter
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position], context)
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        // Get reference to views
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        // Bind data to child view
        fun bindCategory(category: Category, context: Context) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }
    }

}