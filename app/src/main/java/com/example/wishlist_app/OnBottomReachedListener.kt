package com.example.wishlist_app


/**

 * ensure tha tthe interace is set ot public, will be defined in a seperate file
 * Interaces in Kotlin:
 * * An interface is a way to provide description or contract for classes in object-oriented programming. This may contain properties and functions in abstract or concrete ways depending upon the programming language
 * */
public interface OnBottomReachedListener {

    //Below is the kotlin equivalent of the following java code: void onBottomReached(int Position);
    fun onBottomReached(position : Int)
}