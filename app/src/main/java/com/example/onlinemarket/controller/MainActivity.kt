package com.example.onlinemarket.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.onlinemarket.Categoryadapter.CategoryAdapter
import com.example.onlinemarket.R
import com.example.onlinemarket.model.category
import com.example.onlinemarket.service.Dataservice
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.categoryitem.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter= CategoryAdapter(this,Dataservice.categories)

        listview.adapter=adapter
    }
}