package com.juanse.coderswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.juanse.coderswag.Adapters.ProductsAdapter
import com.juanse.coderswag.R
import com.juanse.coderswag.Services.DataService
import com.juanse.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    private lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

        // Setting more columns for landscape orientation
        var spanCount = 2
        val orientation = resources.configuration.orientation

        // Check orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        // Check screen size
        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) { // Greater than 720dp is Extra Large
            spanCount = 3
        }

        // Layout
        val layoutManager = GridLayoutManager(this, spanCount) // spanCount -> Number of columns
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter // Set the adapter for RecycleListView
    }
}
