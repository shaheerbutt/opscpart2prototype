package com.example.opscpart2prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Profile
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        // Get the spinner from the xml.
        val dropdown = findViewById<Spinner>(R.id.province)

        // Create a list of items for the spinner.
        val items = arrayOf(
            "Gauteng",
            "limpopo",
            "North west",
            "Mpumalanga",
            "Free state",
            "kwazulu natal",
            "Eastern cape",
            "Northern cape",
            "Western cape"
        )

        // Create an adapter to describe how the items are displayed.
// Adapters are used in several places in Android.
// There are multiple variations of this, but this is the basic variant.
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)

// Set the spinner's adapter to the previously created one.
        dropdown.adapter = adapter
    }

    fun profile(view: View) {
        val intent = Intent(this, profile::class.java)
        startActivity(intent)
    }
}