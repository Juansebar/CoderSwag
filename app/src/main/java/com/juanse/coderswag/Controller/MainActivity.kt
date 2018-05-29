package com.juanse.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.juanse.coderswag.Adapters.CategoryAdapter
import com.juanse.coderswag.Adapters.CategoryRecycleAdapter
import com.juanse.coderswag.Model.Category
import com.juanse.coderswag.R
import com.juanse.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Adapter is the one that manages data to present in ListView
    lateinit var adapter: CategoryRecycleAdapter
//    lateinit var adapter: CategoryAdapter
//    lateinit var adapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the Adapter providing (context, view type, data to present)
        adapter = CategoryRecycleAdapter(this, DataService.categories)
//        adapter = CategoryAdapter(this, DataService.categories)
//        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)

        // Tell ListView who it needs to listen to
        categoryListView.adapter = adapter

        // One more thing for a RecycleAdapter a LayoutManager - responsible of determining the type of RecyclerView we are using
        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true) // Set this if we know that cell sizes are the same (for optimization)
    }
}
