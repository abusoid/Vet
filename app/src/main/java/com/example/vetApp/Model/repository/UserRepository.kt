package com.example.vetApp.Model.repository

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.vetApp.Model.dataClasses.User
import com.example.vetApp.Model.room.DataBase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class UserRepository {
    companion object {
        var dataBase: DataBase? = null
        var user: User? = null
        var userModel: LiveData<User>? = MutableLiveData<User>()

        fun initializeDB(context: Context) {
            dataBase = DataBase.getDataBase(context)
        }

        fun getUser(id: Long): User {
            return dataBase!!.getDaoUser().getUserById(id)
        }
        fun getActiveUser():User{
            return user!!
        }
        fun setActiveUser(id: Long){
            user = dataBase!!.getDaoUser().getUserById(id)
        }

        fun getUserByPhone(phone: String): LiveData<User> {
            userModel = dataBase!!.getDaoUser().getUserByPhone(phone)
            return userModel as LiveData<User>
        }

        fun createUser(user: User) {
            CoroutineScope(Dispatchers.IO).launch {
                dataBase!!.getDaoUser().insertUser(user)
            }
        }
        fun getAllUsers(): Flow<List<User>> {
            return dataBase!!.getDaoUser().getAllUsers()
        }
    }
}