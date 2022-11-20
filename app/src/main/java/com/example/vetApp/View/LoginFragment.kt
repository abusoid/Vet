package com.example.vetApp.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.example.vetApp.R
import com.example.vetApp.ViewModel.DataModel
import com.example.vetApp.databinding.FragmentLoginBinding
import com.google.android.material.button.MaterialButton

class LoginFragment : Fragment() {

    private lateinit var binding : FragmentLoginBinding
    private val userViewModel by activityViewModels<DataModel>()

    private lateinit var buttonLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //buttonLogin = binding.loginButton
        binding.loginButton.setOnClickListener{
            val toast = Toast.makeText(it.context, "Пока ничего не готово", Toast.LENGTH_LONG)
            toast.show()
        }

    }
    companion object {
        @JvmStatic
        fun newInstance() =
            LoginFragment().apply {}
    }
}