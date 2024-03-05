package com.example.wishlist_app


/**
 * Purpose of this file:
 ** Every Recycler view is backed by source for a data.
 *
 * In this case, we will define a class named WishlistModel class which represents the data model being displayed by the recycler view
 * */
class WishlistModel {
    companion object  {
        private var lastInputId = 0
        fun createWishlist(numWishList: Int) : ArrayList<WishlistModel> {  //this will output an array consisting of the list of WishListModel
            val MutableWishList = ArrayList<WishlistModel>()
            //define logic for how to go on updating the wishlist, we will need a method of retrieving and dynamically updating the wishlist
        }
    }
}