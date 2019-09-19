package com.example.sample_simple_list_item_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languages_list = findViewById<ListView>(R.id.language_list)

        var languages = mutableListOf("Java","Kotlin","C#","HTML","CSS","JavaScript","PHP","Unity","Swift","Python","Ruby")

        val adapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1,languages)

        languages_list.adapter = adapter

    }
}
