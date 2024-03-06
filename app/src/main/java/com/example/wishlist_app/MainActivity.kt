package com.example.wishlist_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //define a dummy dataset (modify as needed, dummy dataset will need to be replaced by the content within the data model)

        /**
         * Difference between arrayOf and arrayListOf in Kotlin:
         *
         * Arrays are fixed-size collections of elements, while ArrayLists are dynamic and resizable collection of elements. Arrays can only contain elements of a specific data type, while arrayLists can hold elements of any datatype.
         * */
        val displayTitle = arrayOf("Lifting Gloves", "Liquid Chalk", "Lifting Straps")
        //instantiate the adapter
        val wishList_adapter = Wishlist_Adapter(displayTitle)  //pass in the string based dataset that it will accept

        //reference the recycler view within the activity_main.xml file
        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = wishList_adapter  //specify the target adapter
    }
}