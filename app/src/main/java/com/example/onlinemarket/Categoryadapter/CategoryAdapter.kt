package com.example.onlinemarket.Categoryadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.onlinemarket.R
import com.example.onlinemarket.model.category

class CategoryAdapter(context:Context,categories:List<category>):BaseAdapter()     {
    val context=context
    val categories=categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView:View
        //LaoutInflater is an object taking file from layout
        categoryView=LayoutInflater.from(context).inflate(R.layout.categoryitem,null)
        val categorimage:ImageView=categoryView.findViewById(R.id.categoryimage)
        val categoryName:TextView=categoryView.findViewById(R.id.categorytext)
        println("Heavy Computing")
        //positio of image..
        val category=categories[position]
        //convert resource name to image id
        val resourseId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
        //set the image...
        categorimage.setImageResource(resourseId)
        println(resourseId)
        categoryName.text=category.title

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
}