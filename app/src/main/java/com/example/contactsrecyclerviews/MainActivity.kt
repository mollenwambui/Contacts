package com.example.contactsrecyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactsrecyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact1=Contacts("Mollen","mollenwambui@gmail.com","0714573892","616Korongo","")
        var contact2=Contacts("Lucy","lucym@gmail.com","07199883892","616Korongo","")
        var contact3=Contacts("Dennis","Dennnismaina@gmail.com","07190573892","616Korongo","")
        var contact4=Contacts("Macharia","maachariaa@gmail.com","07933473892","616Korongo","")
        var contact5=Contacts("Judy","judyk@gmail.com","0778883892","616Korongo","")
        var contact6=Contacts("Sakina","sakinaissa@gmail.com","0714573892","616Korongo","")
        var contact7=Contacts("Maureen","maureenk@gmail.com","07199883892","616Korongo","")
        var contact8=Contacts("Mitchelle","mitchellehope@gmail.com","0714573892","616Korongo","")
        var contact9=Contacts("Faith","faithmutua@gmail.com","07199883892","616Korongo","")
        var contactlist= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9)

        var contactsAdapter=ContactsrvAdapter(contactlist)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdapter
    }
}