package com.example.vetApp.Model

import android.service.autofill.UserData
import com.example.vetApp.Model.dataClasses.Pet
import com.example.vetApp.Model.repository.LoginRepository

class LoginModel(loginRepository: LoginRepository) {
     fun saveUser(email: String, password: String, phone: String, firstName:String, lastName:String, sex:String, petList:List<Pet>) {
        //saveUser(
            com.example.vetApp.Model.dataClasses.User(
                email,
                password,
                phone,
                firstName,
                lastName,
                sex/*,
                //petList*/
            )
       // )
    }
}