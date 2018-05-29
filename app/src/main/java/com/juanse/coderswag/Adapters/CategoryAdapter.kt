package com.juanse.coderswag.Adapters

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.juanse.coderswag.Model.Category
import com.juanse.coderswag.R


// Extends BaseAdapter()
class CategoryAdapter(context: Context, categories: List<Category>): BaseAdapter() {

    val context = context
    val categories = categories

//     ***** Must have these four methods


    // iOS - cellForRow at IndexPath
    /*
        position -> IndexPath
        convertView -> Custom View that will be displayed
        parent ->
     */
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // create new view
        val categoryView: View

        val holder: ViewHolder

        if (convertView == null) { // If null then it will be the first time these views will be presented
            // LayoutInflater takes xml and converts to usable View to use in code
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null) //Inflate the view
            holder = ViewHolder()

            // Must access the views, store reference
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            println("I exist for the first time!")
            // ** Holder now has reference to the ID's

            categoryView.tag = holder   // Sets a unique value to the categoryView from the holder
        } else {
            // Recycle existing views
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            println("Go green recycle!")
        }

        val category = categories[position]

        // Access resources Identifier for the image
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

        holder.categoryImage?.setImageResource(resourceId) // Set the image from the resources
        holder.categoryName?.text = category.title

        return categoryView
    }

    // Gets item for a specific index (position)
    override fun getItem(position: Int): Any {
        return categories[position]
    }

    // Defines a unique ID for each row
    override fun getItemId(position: Int): Long {
        return 0
    }

    // Tells listView how many rows it will be displaying
    // iOS - numberOfRows in section func
    override fun getCount(): Int {
        return categories.count()
    }

    // Create a private class to hold a reference to the categoryImage and categoryName
    // this will be used to reuse views for the ListView
    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }

}