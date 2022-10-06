package com.example.contactsrecyclerviews

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsrecyclerviews.Ui.Contacts
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
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(holder.binding.imgContact)
        val context=holder.itemView.context
        holder.binding.imgContact.setOnClickListener {
        Toast
            .makeText(context,"You have clicked the image",Toast.LENGTH_LONG)
            .show()
        }
        holder.binding.cvContacts.setOnClickListener {
            val intent=Intent(context,ViewContacts::class.java)
            intent.putExtra("NAME",currentContact.name)
            intent.putExtra("ADDRESS",currentContact.address)
            intent.putExtra("Email",currentContact.email)
            intent.putExtra("PhoneNumber",currentContact.phoneNumber)
            intent.putExtra("Image",currentContact.image)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
       return contactslist.size
    }

}
class  ContactViewHolder(val binding: ContactsListItemBinding): RecyclerView.ViewHolder(binding.root)