package com.example.agenda.model

import android.text.Editable

data class Student(val name: Editable, val phone: Editable, val email: Editable) {
    override fun toString(): String {
        return "$name - $phone - $email"
    }
}
