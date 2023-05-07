package com.example.opscpart2prototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Get the achievements spinner from the xml.
        val achievementsSpinner = findViewById<Spinner>(R.id.achievements)

        // Create a list of items for the achievements spinner.
        val achievementsItems = arrayOf(
            "Achievement 1",
            "Achievement 2",
            "Achievement 3"
        )

        // Create an adapter for the achievements spinner.
        val achievementsAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            achievementsItems
        )

        // Set the achievements spinner's adapter.
        achievementsSpinner.adapter = achievementsAdapter

        // Get the preferences spinner from the xml.
        val preferencesSpinner = findViewById<Spinner>(R.id.preferences)

        // Create a list of items for the preferences spinner.
        val preferencesItems = arrayOf(
            "Preference 1",
            "Preference 2",
            "Preference 3"
        )

        // Create an adapter for the preferences spinner.
        val preferencesAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            preferencesItems
        )

        // Set the preferences spinner's adapter.
        preferencesSpinner.adapter = preferencesAdapter
    }
}
