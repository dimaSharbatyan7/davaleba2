package com.example.davaleba_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.davaleba_2.adapters.ViewPagerAdapter
import com.example.davaleba_2.adapters.RecyclerViewAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val viewPagerItems = listOf("Scroll >> ", "<< Scroll >>", "<< Scroll")
        val viewPagerAdapter = ViewPagerAdapter(viewPagerItems)
        viewPager.adapter = viewPagerAdapter

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val recyclerViewItems = listOf<String>("Calculus", "Python", "Android Development", "Management", "Cisco Networking", "JavaScript", "Java",
            "Calculus", "Python", "Android Development", "Management", "Cisco Networking", "JavaScript", "Java",
            "Calculus", "Python", "Android Development", "Management", "Cisco Networking", "JavaScript", "Java")
        val recyclerViewAdapter = RecyclerViewAdapter(recyclerViewItems)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = recyclerViewAdapter
    }
}