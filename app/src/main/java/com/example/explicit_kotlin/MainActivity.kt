package com.example.explicit_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button : Button = findViewById(R.id.btn)

        button.setOnClickListener(){
            // Explicit Intents
            var i = Intent(this, Activity2::class.java)
            // Passing data between activities
            i.putExtra("age", 30)
            startActivity(i)
        }
    }
}