package com.example.contactsrecyclerviews.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.contactsrecyclerviews.Ui.Contacts

@Database(entities = arrayOf(Contacts::class), version = 1)
 abstract class ContactsDb:RoomDatabase() {
     abstract  fun contactDao():ContactDao

     companion object {
         private var database: ContactsDb? = null

         fun getDatabase(context: Context): ContactsDb {
             if (database == null) {
                 database = Room.databaseBuilder(context, ContactsDb::class.java, "ContactsDb")
                     .fallbackToDestructiveMigration()
                     .build()
             }
             return  database as ContactsDb
         }

     }

}