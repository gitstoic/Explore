package com.gitstoic.mayowasresume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val education_page = findViewById<TextView>(R.id.education)
        val tools_page = findViewById<TextView>(R.id.tools)
        val contact_btn = findViewById<Button>(R.id.contact_button)

        education_page.setOnClickListener{
            val intent = Intent(this, EducationPage::class.java)
            startActivity(intent)
        }

        tools_page.setOnClickListener{
            val intent = Intent(this, ToolsPage::class.java)
            startActivity(intent)
        }

        contact_btn.setOnClickListener{
            val intent = Intent(this, ContactPage::class.java)
            startActivity(intent)
        }

    }
}