package com.example.contactsrecyclerviews.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.contactsrecyclerviews.ContactViewModel
import com.example.contactsrecyclerviews.R
import com.example.contactsrecyclerviews.databinding.ActivityAddContactBinding

class AddContactActivity : AppCompatActivity() {
    val ContactViewModel:ContactViewModel by viewModels()
    lateinit var  binding: ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnSave.setOnClickListener {
            validateContact()
        }
    }
    fun validateContact(){
        val name= binding.etName.text.toString()
        val email=binding.etEmail.text.toString()
        val address=binding.etAdress.text.toString()
        val phoneNumber=binding.etPhoneNumber.text.toString()

        //validation
        val contacts=   Contacts(0,name,phoneNumber,email,address," ")
        ContactViewModel.saveContacts(contacts)
        finish()

    }
}