package com.example.vetApp.Model.dataClasses

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
@Entity(tableName = "user")
data class User(@ColumnInfo(name = "email") var email: String = "",
                @ColumnInfo(name = "password") var password: String = "",
                @ColumnInfo(name = "phone") var phone: String = "",
                @ColumnInfo(name = "first_name") var firstName: String? = "",
                @ColumnInfo(name = "last_name") var lastName: String = "",
                @ColumnInfo(name = "sex")  var sex: String = ""/*,
                @ColumnInfo(name = "first_name")  var petList: List<Pet>? = null*/):
    Serializable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id:Long? = null
    /*
    init {
        println("Start UserData")
        this.email = email
        println("email: $email")
        this.password = password
        println("password: $password")
        this.phone = phone
        println("phone: $phone")
        this.firstName = firstName
        println("firstName: $firstName")
        this.lastName = lastName
        println("lastName: $lastName")
        this.sex = sex
        println("sex: $sex")
        this.petList = petList
        println("petList: $petList")
    }*/

}