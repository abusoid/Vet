package com.example.vetApp.ViewModel

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.vetApp.Model.dataClasses.User
import com.example.vetApp.Model.repository.UserRepository
import com.example.vetApp.R
import kotlinx.coroutines.flow.Flow

class DataModel : ViewModel() {
    val userData: MutableLiveData<User> by lazy {
        MutableLiveData<User>()
    }
    var listUsers: Flow<List<User>>? = null

    fun initializeDB(context: Context){
        UserRepository.initializeDB(context)
    }

    fun createUser(user:User) {
        UserRepository.createUser(user)
    }
    fun getUserById(id:Long):User{
        return UserRepository.getUser(id)
    }
    fun getUserByPhone(phone:String): LiveData<User> {
        return UserRepository.getUserByPhone(phone)
    }
    fun setActiveUser(user:User){
        userData.value=user

    }
    fun getActiveUser(): User {
        println(userData.value)
        return userData.value!!
    }
    fun getAllUsers(): Flow<List<User>> {
        listUsers = UserRepository.getAllUsers()
        return listUsers as Flow<List<User>>
    }
    fun goToNextFragment(fragment: Fragment, nextFragment: Fragment) {
        fragment.parentFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.fragment_container_view,nextFragment)
            .commit()
    }
}