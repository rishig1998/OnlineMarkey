package com.example.onlinemarket.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.onlinemarket.R
import com.example.onlinemarket.model.category
import com.example.onlinemarket.service.Dataservice
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: ArrayAdapter<category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter= ArrayAdapter(this,
        android.R.layout.simple_list_item_1,Dataservice.categories)
        listview.adapter=adapter

    }
}