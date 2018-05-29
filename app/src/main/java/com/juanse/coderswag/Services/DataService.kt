package com.juanse.coderswag.Services

import com.juanse.coderswag.Model.Category
import com.juanse.coderswag.Model.Product


// *** Create Singletons by just using "object" then name
object DataService {

    private val description = "This is made for the adventurer in you and is an all weather performance garment. The double needle stitching and the double lined hood ensure durability under extreme weather conditions. The dyed to match draw cord on the hood exemplifies your cool personality. The full sleeves flaunts a stylish rib knit cuff along with the spandex at the waistband gives the wearer the looks of a rock star. The front pouch pocket along with the stylish roll over hood adds to the great looks. In a nutshell, the Gildan Heavy blend Hooded Sweatshirt is a perfect fit for men who exhibit extravagance in both performance and style. Give a fillip to all your marketing efforts with your team logo screen printed on them."

    // List of immutable items
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HODDIE", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HODDIE", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HODDIE", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
            )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "18", "hat1", description),
            Product("Devslopes Hat Balck", "20", "hat2", description),
            Product("Devslopes Hat White", "18", "hat3", description),
            Product("Devslopes Hat Snapback", "22", "hat4", description),
            Product("Devslopes Graphic Beanie", "18", "hat1", description),
            Product("Devslopes Hat Balck", "20", "hat2", description),
            Product("Devslopes Hat White", "18", "hat3", description),
            Product("Devslopes Hat Snapback", "22", "hat4", description),
            Product("Devslopes Graphic Beanie", "18", "hat1", description),
            Product("Devslopes Hat Balck", "20", "hat2", description),
            Product("Devslopes Hat White", "18", "hat3", description),
            Product("Devslopes Hat Snapback", "22", "hat4", description)
    )

    val hoodies = listOf(
            Product("Devslopes Hoddie Gray", "28", "hoodie1", description),
            Product("Devslopes Hoddie Red", "32", "hoodie2", description),
            Product("Devslopes Gray Hoodie", "28", "hoodie3", description),
            Product("Devslopes Black Hoodie", "32", "hoodie4", description),
            Product("Devslopes Hoddie Gray", "28", "hoodie1", description),
            Product("Devslopes Hoddie Red", "32", "hoodie2", description),
            Product("Devslopes Gray Hoodie", "28", "hoodie3", description),
            Product("Devslopes Black Hoodie", "32", "hoodie4", description),
            Product("Devslopes Hoddie Gray", "28", "hoodie1", description),
            Product("Devslopes Hoddie Red", "32", "hoodie2", description),
            Product("Devslopes Gray Hoodie", "28", "hoodie3", description),
            Product("Devslopes Black Hoodie", "32", "hoodie4", description)
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "18", "shirt1", description),
            Product("Devslopes Badge Light Gray", "20", "shirt2", description),
            Product("Devslopes Logo Shirt Red", "22", "shirt3", description),
            Product("Devslopes Hustle", "22", "shirt4", description),
            Product("Kickflip Studios", "18", "shirt5", description),
            Product("Devslopes Shirt Black", "18", "shirt1", description),
            Product("Devslopes Badge Light Gray", "20", "shirt2", description),
            Product("Devslopes Logo Shirt Red", "22", "shirt3", description),
            Product("Devslopes Hustle", "22", "shirt4", description),
            Product("Kickflip Studios", "18", "shirt5", description),
            Product("Devslopes Shirt Black", "18", "shirt1", description),
            Product("Devslopes Badge Light Gray", "20", "shirt2", description),
            Product("Devslopes Logo Shirt Red", "22", "shirt3", description),
            Product("Devslopes Hustle", "22", "shirt4", description),
            Product("Kickflip Studios", "18", "shirt5", description)
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product> {
        return when (category.toUpperCase()) {  // Switch statement
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HODDIE" -> hoodies
            else -> digitalGoods
        }
    }

}