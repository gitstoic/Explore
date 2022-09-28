package com.stoicdev.myapplication

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stoicdev.myapplication.R.layout.*
import com.stoicdev.myapplication.databinding.ActivityVotingBinding

class VotingActivity : AppCompatActivity() {

    lateinit var layoutManager: RecyclerView.LayoutManager
//    lateinit var binding : ActivityVotingBinding
    lateinit var adapter: RecyclerView.Adapter<VotingRecyclerViewAdapter.ViewHolder>
    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(successful_verification)

//        recyclerView = findViewById(R.id.voting_recycler_view)
//       layoutManager = LinearLayoutManager(this)
//        recyclerView.layoutManager = layoutManager
//
//        adapter = VotingRecyclerViewAdapter()
//        recyclerView.adapter = adapter

}
}