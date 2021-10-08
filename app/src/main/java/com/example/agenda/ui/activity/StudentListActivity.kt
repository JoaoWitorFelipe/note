package com.example.agenda.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.agenda.R
import com.example.agenda.dao.StudentDAO
import com.google.android.material.floatingactionbutton.FloatingActionButton

class StudentListActivity : AppCompatActivity() {

    private val studentDAO = StudentDAO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)
        title = "Student List"

        settingFABListener()
    }

    override fun onResume() {
        super.onResume()
        settingStudentList()
    }

    private fun settingFABListener() {
        val newStudentButton: FloatingActionButton = findViewById(R.id.activity_students_list_fab_new_students)

        newStudentButton.setOnClickListener {
            startActivity(Intent(this, FormStudentActivity::class.java))
        }
    }

    private fun settingStudentList() {
        val studentsListView: ListView = findViewById(R.id.activity_main_students_list)
        studentsListView.adapter = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, studentDAO.get());
    }


}