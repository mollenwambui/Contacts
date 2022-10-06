package com.example.contactsrecyclerviews.Ui

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts")
data class Contacts(
   @PrimaryKey(autoGenerate = true) var contactId:Int,
    var name:String,
    var email:String,
    var phoneNumber:String,
    var address:String,
    var image:String
)
