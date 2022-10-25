package com.example.contactsrecyclerviews

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contactsrecyclerviews.Repository.ContactsRepository
import com.example.contactsrecyclerviews.Ui.Contacts
import kotlinx.coroutines.launch

class ContactViewModel:ViewModel() {
    val contactsRepository=ContactsRepository()
    lateinit var  contactLivedata:LiveData<Contacts>

    fun saveContacts(contacts: Contacts){
        viewModelScope.launch {
            contactsRepository.saveContact(contacts)
        }
    }
    fun fetchContactId(contactId:Int){
        contactLivedata=contactsRepository.getContactById(contactId)
    }
}