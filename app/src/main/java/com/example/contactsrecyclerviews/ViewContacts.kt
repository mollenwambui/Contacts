package com.example.contactsrecyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.contactsrecyclerviews.databinding.ActivityViewContactsBinding
import com.example.contactsrecyclerviews.databinding.ContactsListItemBinding
import com.squareup.picasso.Picasso

class                                                                                                                       ViewContacts : AppCompatActivity() {
    lateinit var binding: ActivityViewContactsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityViewContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        var name=intent.extras?.getString("NAME"," ")
        var address=intent.extras?.getString("ADDRESS"," ")
        var email=intent.extras?.getString("Email", "")
        var image=intent.extras?.getString("Image"," ")
        var phoneNumber=intent.extras?.getString("PhoneNumber"," ")
        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        Toast.makeText(this,address,Toast.LENGTH_LONG).show()
        Toast.makeText(this,email,Toast.LENGTH_LONG).show()
//        Toast.makeText(this,image,Toast.LENGTH_LONG).show()
        Toast.makeText(this,phoneNumber,Toast.LENGTH_LONG).show()

        binding.tvname.text=name
        binding.tvPhone.text=phoneNumber
        binding.tvMail.text=email
        binding.tvLocation.text=address
//        Picasso.get().load(intent.getStringExtra("Image")).into(image)
        Picasso.get().load(intent.getStringExtra("Image")).into(binding.imgPerson)

    }
}
