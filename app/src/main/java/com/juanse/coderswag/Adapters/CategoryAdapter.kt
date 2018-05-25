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

        // LayoutInflater takes xml and converts to usable View to use in code
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

        // Must access the views, store reference
        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName: TextView = categoryView.findViewById(R.id.categoryName)
        println("Heavy Computing - ") // B/c every time we are creating new items finding the view with ID's

        val category = categories[position]

        // Access resources Identifier for the image
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        // Set the image from the resources
        categoryImage.setImageResource(resourceId)
        print(resourceId)

        categoryName.text = category.title

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

}