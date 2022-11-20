package com.example.vetApp.Model.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.vetApp.Model.dataClasses.User

@Database(entities = [User::class], version = 1)
abstract class DataBase : RoomDatabase() {
    abstract fun getDaoUser(): DaoUser

    companion object{
        fun getDataBase(context: Context):DataBase{
            return Room.databaseBuilder(context.applicationContext,DataBase::class.java,"vet.db").build()
        }
    }
}