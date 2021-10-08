package com.example.agenda.ui.activity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.agenda.R
import com.example.agenda.model.Student
import com.example.agenda.dao.StudentDAO

class FormStudentActivity : AppCompatActivity() {

    private lateinit var nameField: EditText;
    private lateinit var phoneField: EditText;
    private lateinit var emailField: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "New Student"
        setContentView(R.layout.activity_form_student)
        initFields()
        settingFABListener()
    }

    private fun settingFABListener() {
        val studentDao = StudentDAO()
        val button: Button = findViewById(R.id.activity_form_student_save_button)

        button.setOnClickListener {
            studentDao.store(this.studentGenerator())
            finish()
        }
    }

    private fun studentGenerator(): Student {
        return Student(nameField.text, phoneField.text, emailField.text)
    }

    private fun initFields() {
        nameField = findViewById(R.id.activity_form_student_name)
        phoneField = findViewById(R.id.activity_form_student_phone)
        emailField = findViewById(R.id.activity_form_student_email)
    }

}