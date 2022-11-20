package com.example.vetApp.View

import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.vetApp.ViewModel.DataModel
import com.example.vetApp.R

class MainActivity : AppCompatActivity() {
    private lateinit var transaction: FragmentTransaction
    private val userViewModel by viewModels<DataModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //actionBar?.hide()
        if(savedInstanceState == null){
            //userViewModel.initializeDB(applicationContext)
            getSupportActionBar()?.hide()
            transaction = supportFragmentManager.beginTransaction()
            transaction.add(R.id.fragment_container_view, LoginFragment.newInstance(),"loginFragment").commit()
        }
    }
}