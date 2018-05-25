package com.juanse.coderswag.Services

import com.juanse.coderswag.Model.Category
import com.juanse.coderswag.Model.Product


// *** Create Singletons by just using "object" then name
object DataService {

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
            Product("Devslopes Graphic Beanie", "18", "hat1"),
            Product("Devslopes Hat Balck", "20", "hat2"),
            Product("Devslopes Hat White", "18", "hat3"),
            Product("Devslopes Hat Snapback", "22", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoddie Gray", "28", "hoodie1"),
            Product("Devslopes Hoddie Red", "32", "hoodie2"),
            Product("Devslopes Gray Hoodie", "28", "hoodie3"),
            Product("Devslopes Black Hoodie", "32", "hoodie4")
    )

    val shirsts = listOf(
            Product("Devslopes Shirt Black", "18", "shirt1"),
            Product("Devslopes Badge Light Gray", "20", "shirt2"),
            Product("Devslopes Logo Shirt Red", "22", "shirt3"),
            Product("Devslopes Hustle", "22", "shirt4"),
            Product("Kickflip Studios", "18", "shirt5")
    )

}