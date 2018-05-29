package com.juanse.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.juanse.coderswag.Model.Product
import com.juanse.coderswag.R
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductsAdapter(val context: Context, val products: List<Product>, val itemClick: (Product) -> Unit): RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        // Inflate view for the very first time
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)

        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(products[position], context)
    }

    inner class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        // References to views
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Product, context: Context) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)

            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            productPrice?.text = "$${product.price}"

            // Set onClickListener with Lambda
            itemView.setOnClickListener { itemClick(product) }
        }
    }
}