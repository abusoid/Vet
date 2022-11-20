package com.example.vetApp.Model.repository

import com.example.vetApp.Model.dataClasses.User


interface LoginRepository {
    fun saveUser(user: User)
    fun showMessage()
}