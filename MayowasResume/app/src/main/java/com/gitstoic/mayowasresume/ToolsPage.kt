package com.gitstoic.mayowasresume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.cardview.widget.CardView

class ToolsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tools_page)

        val education_page = findViewById<TextView>(R.id.education)
        val home_btn = findViewById<CardView>(R.id.home_btn)

        education_page.setOnClickListener{
            val intent = Intent(this, EducationPage::class.java)
            startActivity(intent)
        }

        home_btn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
}