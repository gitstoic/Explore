package com.stoicdev.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stoicdev.myapplication.databinding.FragmentVotingBinding


class VotingFragment : Fragment() {

    private lateinit var _binding: FragmentVotingBinding
    private val binding get() = _binding

    private lateinit var recyclerView: RecyclerView


    lateinit var layoutManager: RecyclerView.LayoutManager

    private lateinit var adapter: RecyclerView.Adapter<VotingRecyclerViewAdapter.ViewHolder>

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentVotingBinding.inflate(inflater, container, false)
   return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        recyclerView = binding.votingRecyclerView

        layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager

        adapter = VotingRecyclerViewAdapter()
        recyclerView.adapter = VotingRecyclerViewAdapter()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding
    }

}