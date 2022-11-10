package com.gitstoic.explore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val btn: ImageButton = findViewById(R.id.day_night_mode)
//        AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
//        btn.setOnClickListener {
//            if (onContextItemSelected)
//            btn.setImageResource(R.drawable.ic_night_mode)
//            AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_YES)
//        }

//        private fun setIcon(imageButton: ImageButton?) {
//            if (imageButton == null) return
//            imageButton.btn =
//                if (isGridLayoutManager)
//                    ContextCompat.getDrawable(this.requireContext(), R.drawable.ic_light_mode)
//                else
//                    ContextCompat.getDrawable(this.requireContext(), R.drawable.ic_night_mode)
//
//    }
    }
}