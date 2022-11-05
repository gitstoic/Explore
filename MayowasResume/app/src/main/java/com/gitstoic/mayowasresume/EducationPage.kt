package com.gitstoic.mayowasresume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.cardview.widget.CardView

class EducationPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education_page)

        val tools_page = findViewById<TextView>(R.id.tools)
        val home_btn = findViewById<CardView>(R.id.home_btn)

        tools_page.setOnClickListener{
            val intent = Intent(this, ToolsPage::class.java)
            startActivity(intent)
        }

        home_btn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}