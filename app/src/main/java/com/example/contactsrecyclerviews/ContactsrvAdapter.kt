package com.example.contactsrecyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsrecyclerviews.databinding.ContactsListItemBinding
import com.squareup.picasso.Picasso

class ContactsrvAdapter (var contactslist:List<Contacts>):
    RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactsListItemBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
         return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactslist.get(position)
        holder.binding.tvName.text=currentContact.name
        holder.binding.tvPhoneNumber.text=currentContact.phoneNumber
        holder.binding.tvEmail.text=currentContact.email
        holder.binding.tvAddress.text=currentContact.address
        Picasso.get()
            .load(currentContact.image)
            .resize(300,300)
            .centerCrop()
            .noFade()
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(holder.binding.imgContact)


    }

    override fun getItemCount(): Int {
       return contactslist.size
    }

}
class  ContactViewHolder(val binding: ContactsListItemBinding): RecyclerView.ViewHolder(binding.root)