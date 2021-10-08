package com.example.agenda.dao

import com.example.agenda.model.Student

class StudentDAO {

    companion object {
        val studentList: MutableList<Student> = ArrayList()
    }

    fun store(student: Student) {
        studentList.add(student)
    }

    fun get(): ArrayList<Student> {
        return ArrayList(studentList)
    }
}
