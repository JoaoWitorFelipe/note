package com.example.agenda

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val students: List<String> = listOf("jao", "witor", "felipe");
        val studentsListView: ListView = findViewById(R.id.activity_main_students_list)
        studentsListView.adapter = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, students);

    }

}