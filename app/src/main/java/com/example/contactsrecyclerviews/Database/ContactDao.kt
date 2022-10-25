package com.example.contactsrecyclerviews.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.contactsrecyclerviews.Ui.Contacts

@Dao
interface ContactDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContact(contacts: Contacts)

    @Query("SELECT * FROM contacts")
    fun getAllContacts():LiveData<List<Contacts>>

    @Query("SELECT * from Contacts WHERE contactId =:contactId")
    fun getContactById(contactId:Int): LiveData<Contacts>

}
