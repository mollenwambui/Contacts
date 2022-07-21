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
        var contact1=Contacts("Mollen","mollenwambui@gmail.com","0714573892","616Korongo","https://media.istockphoto.com/photos/senior-couple-dancing-together-picture-id1344980722?b=1&k=20&m=1344980722&s=170667a&w=0&h=eKb7pCBrEoshsOJ4fiesi1ZrRHGKaIIUya0dRw6s54E=")
        var contact2=Contacts("Lucy","lucym@gmail.com","07199883892","616Korongo","https://media.istockphoto.com/photos/portrait-of-three-smiling-women-picture-id1338095424?b=1&k=20&m=1338095424&s=170667a&w=0&h=MKfd-E5Lk8CUggh75LGcaEyYQa7vytQxzcUv_dGIUWs=")
        var contact3=Contacts("Dennis","Dennnismaina@gmail.com","07190573892","616Korongo","https://media.istockphoto.com/photos/smiling-friends-at-the-picnic-picture-id1335419818?b=1&k=20&m=1335419818&s=170667a&w=0&h=iRy_HY4rVb2kuzveNe4p8PB0L5Csr8_Og9cdgyZm2CI=")
        var contact4=Contacts("Macharia","maachariaa@gmail.com","07933473892","616Korongo","https://media.istockphoto.com/photos/african-american-senior-man-at-home-portrait-picture-id1385099292?b=1&k=20&m=1385099292&s=170667a&w=0&h=jXxKH1RIsiOAPAJomJUFgpzAXTet8QURV-SA8JOCjq8=")
        var contact5=Contacts("Judy","judyk@gmail.com","0778883892","616Korongo","https://media.istockphoto.com/photos/fit-woman-standing-outdoors-after-a-late-afternoon-trail-run-picture-id1347431090?b=1&k=20&m=1347431090&s=170667a&w=0&h=9PyRbKzQaGD6jEoxfpNn7FcVz-JScKWi8IBusE2OlqU=")
        var contact6=Contacts("Sakina","sakinaissa@gmail.com","0714573892","616Korongo","https://media.istockphoto.com/photos/family-portrait-picture-id1344622271?b=1&k=20&m=1344622271&s=170667a&w=0&h=vekjYrJtwqKvyFA7VLWqm5BYillhNJiwwUfr6adHVfg=")
        var contact7=Contacts("Maureen","maureenk@gmail.com","07199883892","616Korongo","https://media.istockphoto.com/photos/senior-couple-dancing-together-picture-id1344980722?b=1&k=20&m=1344980722&s=170667a&w=0&h=eKb7pCBrEoshsOJ4fiesi1ZrRHGKaIIUya0dRw6s54E=")
        var contact8=Contacts("Mitchelle","mitchellehope@gmail.com","0714573892","616Korongo","https://media.istockphoto.com/photos/excited-woman-wearing-rainbow-cardigan-picture-id1327495437?b=1&k=20&m=1327495437&s=170667a&w=0&h=Vbl-XLyAnBoTkyGXXi-X1CFzuSHlNcn-dqB-sCosxFo=")
        var contact9=Contacts("Faith","faithmutua@gmail.com","07199883892","616Korongo","https://media.istockphoto.com/photos/portrait-of-mid-20s-africanamerican-man-outdoors-at-dusk-picture-id1365997131?b=1&k=20&m=1365997131&s=170667a&w=0&h=qderpq3fbFnunJqrropQ-m4dWzyLezjGmBaIVTVvrTo=")
        var contactlist= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9)

        var contactsAdapter=ContactsrvAdapter(contactlist)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdapter
    }
}