package com.example.wishlist_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //create variables we will be using to reference the edittext and recycler view on the layout file
    private lateinit var itemNameEditText: EditText  //Edit Text view where the user can input the name of the item (aka the title)
    private lateinit var itemLinkEditText: EditText //Edit Text view where the user can input the Link where the item can be found
    private lateinit var itemPriceEditText: EditText  //Edit Text view where the user can input the price of the item
    private lateinit var submitButton: Button  //button view where the content will be displayed after all the information has been inputted
    private lateinit var wishListRecyclerView: RecyclerView  //Reference to the recycler view that is created within the activity_main.xml file

    private val wishList = ArrayList<WishlistItem>()
    private lateinit var adapter: WishlistAdapter  //instantiate the adapter variable referencing to the Wishlist_adapter which will connect and display the content within the recycler view

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //define a dummy dataset (modify as needed, dummy dataset will need to be replaced by the content within the data model)

        /**
         * Difference between arrayOf and arrayListOf in Kotlin:
         *
         * Arrays are fixed-size collections of elements, while ArrayLists are dynamic and resizable collection of elements. Arrays can only contain elements of a specific data type, while arrayLists can hold elements of any datatype.
         * */
        //val displayTitle = arrayOf("Lifting Gloves", "Liquid Chalk", "Lifting Straps")
        //instantiate the adapter

        //reference the views by their ids (note that if the resulting value is null, remove the private lateinit var and declare the variables here instead
        itemNameEditText = findViewById(R.id.title)
        itemLinkEditText = findViewById(R.id.link)
        itemPriceEditText = findViewById(R.id.price)
        submitButton = findViewById(R.id.submitButton)
        wishListRecyclerView = findViewById(R.id.recyclerView)

        //define the adapter
        adapter = WishlistAdapter(wishList)  //pass in the wishList item, which is of WishListItem datatype, as that is the data class we have instantiated, and now we have instantiated a object named adapter which is of WishListAdapter datatype

        wishListRecyclerView.adapter = adapter  //we also need to ensure that the adapter class recognizes the WishlistAdapter class (refer to the WishListAdapter class declation to see how the generic type was extended)

        wishListRecyclerView.layoutManager=LinearLayoutManager(this) //speciy the layout manager the RecyclerView should follow
//using GridLayoutManager helps create table based views, consisitng of rows and columns (for now I used LinearLayoutManager instead)
        /**
         * Additional information in regards to the wishListRecyclerview layout managers:
         *
         * LinearLayoutManager: Arranges the items in a one-dimensional list
         *
         * GridLayoutManager: arranges the items in a two-dimensional grid
         *
         * StaggeredGridLayoutManager: is similar to GridLayoutManager, but it does not require the items in a row have the same height (for vertical grids) or items in the same column have the same width (for horizontal grids). The result is that the items in a row or column can end up offsetting each other.
         *
         * Reference(s): [https://developer.android.com/develop/ui/views/layout/recyclerview, https://medium.com/1mgofficial/how-recyclerview-works-internally-71290de5d2c4]
         * */

        //val wishList_adapter = Wishlist_Adapter(displayTitle)  --> pass in the string based dataset that it will accept

        //reference the recycler view within the activity_main.xml file
        //val recyclerView : RecyclerView = findViewById(R.id.recyclerView)

        //define the logic for the texts that user inputs to be displayed upon clicking on the submit button
        submitButton.setOnClickListener{
            val name = itemNameEditText.text.toString()  //extract the text from the title placeholder editText view and convert it to a string
            val link = itemLinkEditText.text.toString()  //extract the text from the link placeholder editText view and convert it to a string
            val price = itemPriceEditText.text.toString()  //extract the text from the link placeholder editText view and convert it to a string

            wishList.add(WishlistItem(name, link, price))  //update the data class with the newly extracted information [add is similar to appending in a list]
            adapter.notifyItemInserted(wishList.size - 1)
        }

       // recyclerView.adapter = wishList_adapter  //specify the target adapter
    }
}