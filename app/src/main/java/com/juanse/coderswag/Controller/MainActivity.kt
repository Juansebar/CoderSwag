package com.juanse.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.juanse.coderswag.Model.Category
import com.juanse.coderswag.R
import com.juanse.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Adapter is the one that manages data to present in ListView
    lateinit var adapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the Adapter providing (context, view type, data to present)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)

        // Tell ListView who it needs to listen to
        categoryListView.adapter = adapter
    }
}
