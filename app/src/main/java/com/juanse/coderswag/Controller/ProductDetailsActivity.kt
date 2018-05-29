package com.juanse.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.juanse.coderswag.Model.Product
import com.juanse.coderswag.R
import com.juanse.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_details.*

class ProductDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        // Get the resourceID for the proudctImage
        val resourceId = resources.getIdentifier(product.image, "drawable", packageName)

        productImage.setImageResource(resourceId)
        productName.text = product.title
        productPrice.text = "$${product.price}"
        productDescription.text = product.description
    }
}
