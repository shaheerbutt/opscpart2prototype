package com.example.opscpart2prototype

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class newtask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newtask)

        val imageView: ImageView = findViewById(R.id.profilep)

        imageView.setOnClickListener {
            val intent = Intent(this , profile::class.java)
            startActivity(intent)
        }

        val button: Button = findViewById(R.id.start_date)
        val button2: Button = findViewById(R.id.end_date)


        button.setOnClickListener {
            // Get current date
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            // Create a date picker dialog and set the current date as default
            val datePickerDialog = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    // Update the text of the button with the selected date
                    button.text = "$dayOfMonth/${monthOfYear + 1}/$year"
                }, year, month, day)

            // Show the date picker dialog
            datePickerDialog.show()
        }

        button2.setOnClickListener {
            // Get current date
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            // Create a date picker dialog and set the current date as default
            val datePickerDialog = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    // Update the text of the button with the selected date
                    button.text = "$dayOfMonth/${monthOfYear + 1}/$year"
                }, year, month, day)

            // Show the date picker dialog
            datePickerDialog.show()
        }

    }



}