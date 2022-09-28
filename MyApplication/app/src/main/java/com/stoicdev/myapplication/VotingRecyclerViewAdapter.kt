package com.stoicdev.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VotingRecyclerViewAdapter :RecyclerView.Adapter<VotingRecyclerViewAdapter.ViewHolder>() {
    private val itemTitles= arrayOf("Aminat", "Ebuka", "Emmanuel")

    private val itemSumms= arrayOf("I’ll skyrocket the economy of the nation and also make sure every Nigerian child is educated.",
    "I’m a candidate focused on creating jobs and providing uninterrupted power supply.",
    "I’m a diverse candidate who is concerned in bringing change just like our current president.")

    private val itemPfp = intArrayOf(R.drawable.aminat_danjuma, R.drawable.ebuka, R.drawable.david)

    private val itemPartyLogo = intArrayOf(R.drawable.lp_logo, R.drawable.pdplogo, R.drawable.apclogo)

    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        var votingPfp : ImageView = itemView.findViewById(R.id.candidate_pfp)
        var partyLogo: ImageView = itemView.findViewById(R.id.voting_party_icon)
        var candidateName: TextView = itemView.findViewById(R.id.candidate_name)
        var manifestoSumm: TextView = itemView.findViewById(R.id.manifesto_summary)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.voting_list_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.candidateName.text= itemTitles[position]
        holder.manifestoSumm.text=itemSumms[position]
        holder.votingPfp.setImageResource(itemPfp[position])
        holder.partyLogo.setImageResource(itemPartyLogo[position])
    }

    override fun getItemCount(): Int {
return itemTitles.size   }
}