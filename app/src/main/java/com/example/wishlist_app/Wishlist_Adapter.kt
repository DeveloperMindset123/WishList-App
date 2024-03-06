package com.example.wishlist_app

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.text.ParsePosition

//this is the adapter that we will use to connect the main activity file to the data model

//ref: https://medium.com/1mgofficial/how-recyclerview-works-internally-71290de5d2c4

/**
 * Some things to keep into consideration regarding the adapter class (based on the android studio documentation):
 *
 * onCreateViewHolder(): RecyclerView calls this method whenever it needs to create a new viewHolder. The method creates and initializes a viewHolder and its associated view, but it does not fill in the View's contents -- the viewHolder has not yet been bound to a specific data.
 *
 * onBindViewHolder(): RecyclerView calls this method to associate a viewHolder with data. The method fetches the appropriate data and uses the data to fill in the holder's layout. For example, if the RecyclerView displays a list of names, the method might find the appropriate name in the list and fill in the viewHolder's textView widget
 *
 * getItemCount(): RecyclerView calls this method to get the size of the dataset. For example, in an address book app, this might be the total number of addresses. Recycler view uses this item to determine if there are no more items that can be displayed.
 * */

//in the documentation, the parameter was originally named dataSet, for the context of this logic, I renamed it to WishList_items instead, and changed datatype from Array<String> --> Array<WishListItem> as that is the datamodel we have defined.
class Wishlist_Adapter(private val WishList_items: Array<String>) {  //note that in the context of this project, the parameter the Wishlist_Adapter accepts may differ, modify as needed

    /**
     * Provide a reference to the type of views that is being used
     * (custom viewholder)
     *
     * */

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view)  //we are passing in the view within the ViewHolder, which as stated earlier, acts as a wrapper
    {
        //we will need three textViews to be displayed per row of recycler view, for simplicity, keep the name of the values the same as the tagname if possible within the layout file (wishlist_recycler_view_layout.xml)

        //instantiate the textView variables and their datatypes
        val DisplayTitle : TextView
        val DisplayLink : TextView
        val DisplayPrice : TextView

        //declare the initial values within the init function
        init {
            //define the clickListener for the viewHolder's view
            DisplayTitle = view.findViewById(R.id.DisplayTitle)
            DisplayLink = view.findViewById(R.id.DisplayLink)
            DisplayPrice = view.findViewById(R.id.DisplayPrice)
        }
    }

    //create new views, (invoked by the layout manager)

    //note that this is one of the three methods needed as part of the adapter class --> in simple terms, this method will be called by the Recyclerview to pull the contents needed to fill the view defined within the viewHolder class.
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType : Int) : ViewHolder {
        //create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.wishlist_recycler_view_layout, viewGroup, false)  //we can specify the layout file we are referencing within the inflate function using the method R.layout.name_of_layout_file within the layout directory
        return ViewHolder(view)  //by the time this function gets executed, we will have the ViewHolder contain the newly updated view UI to be displayed within the RecyclerView
    }

    //replace the contents of a view (invoked by the layout manager)
    //note that this is the second of the three methods related to RecyclerView, the parameter values it accepts are the same as onCreateViewHolder
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        //get element from the dataset at this position and replace the contents of the view of an element (we can specify the text we want to display)
        viewHolder.DisplayTitle.text=titleList[position]  //note that dataSet1 hasn't been defined yet, I will add some dummy data for now, but the end goal is to have real time updates based on user input
        viewHolder.DisplayLink.text=linkList[position]
        viewHolder.DisplayPrice.text=priceList[position]

        //one method is to save the user input onto three individual arrays of strings, or simply pass in the dataModel and the corresponding position, because we would have to save the data in one place (thus the uses of data model since existing datatypes may not be suitable for the logic related to the program)

        //This function doesn't return anything, consider this a void function, if the function did indeed return something, we would have had to specify prior to the {}, right after the parameter, using :
    }

//define the last of the three methods

    override fun getTitleCount() = titleList.size
    override fun getLinkCount() = linkList.size
    override fun getPriceCount() = priceList.size
}
