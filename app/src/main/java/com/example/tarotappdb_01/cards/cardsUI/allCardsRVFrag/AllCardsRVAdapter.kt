package com.example.tarotappdb_01.cards.cardsUI.allCardsRVFrag

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.tarotappdb_01.cards.model.Card
import com.example.tarotappdb_01.databinding.CardItemInRvBinding

class AllCardsRVAdapter(
    private val tarotDeckList: List<Card>
) : RecyclerView.Adapter<AllCardsRVAdapter.CardItemViewHolder>() {

    inner class CardItemViewHolder(val binding: CardItemInRvBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardItemViewHolder {
        val binding = CardItemInRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardItemViewHolder(binding)    }

    override fun getItemCount(): Int {
        return tarotDeckList.size
    }

    override fun onBindViewHolder(holder: CardItemViewHolder, position: Int) {
        val card = tarotDeckList[position]


        holder.binding.nameTV.text = card.name


        holder.binding.itemCardView.setOnClickListener {
            holder.itemView.findNavController()
                .navigate(
                    AllCardsRVFragmentDirections.actionAllCardsRVFragmentToOneCardFragment(cardID = card.id)
                )
        }




    }
}