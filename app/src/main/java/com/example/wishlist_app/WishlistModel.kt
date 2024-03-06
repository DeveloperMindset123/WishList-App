package com.example.wishlist_app


/**
 * Purpose of this file:
 ** Every Recycler view is backed by source for a data.
 *
 * In this case, we will define a class named WishlistModel class which represents the data model being displayed by the recycler view
 * */

//define a data class that holds the information for each item in the wishlist
//upon doing so, create an array list to store instances of the data class
//define a RecyclerView.Adapter and ViewHolder to display the data
//Set up event listeners on the button to update the array list and notify the adapter


/**
 * Understanding the purpose of data class in Kotlin:
 *
 * The main purpose of the data class (and it being different from normal instantiation of class) is that it's main purpose is to simply hold data without the boilerplate code needed, as is the case here where we are mainly concerned about declaration of the type of data we are working with.
 *
 * Think of it as an empty box where we will be placing items
 *
 * */
data class WishlistItem(
    val itemName: String,
    val itemLink: String,
    val itemPrice: String
)


