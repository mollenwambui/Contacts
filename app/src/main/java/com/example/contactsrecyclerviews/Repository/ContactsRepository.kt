package com.example.contactsrecyclerviews.Repository

import androidx.lifecycle.LiveData
import com.example.contactsrecyclerviews.Contactsrecyclerviews
import com.example.contactsrecyclerviews.Database.ContactsDb
import com.example.contactsrecyclerviews.Ui.Contacts
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database=ContactsDb.getDatabase(Contactsrecyclerviews.appContext)

    suspend fun  saveContact(contact:Contacts){
        withContext(Dispatchers.IO){
            database.contactDao().insertContact(contact)
        }
    }
    fun getContactById(contact:Int):LiveData<Contacts>{
        return  database.contactDao().getContactById(contactId = 0)
    }
}