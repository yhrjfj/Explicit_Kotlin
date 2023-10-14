package com.example.explicit_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        // Receiving data from the first activity
        var bundle: Bundle? = intent.extras
        val age = bundle?.get("age")

        Toast.makeText(this, "Age: "+age, Toast.LENGTH_LONG).show()
    }
}