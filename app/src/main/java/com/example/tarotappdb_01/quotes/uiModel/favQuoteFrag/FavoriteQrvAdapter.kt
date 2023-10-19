package com.example.tarotappdb_01.quotes.uiModel.favQuoteFrag

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tarotappdb_01.cards.cardsUI.allCardsRVFrag.AllCardsRVAdapter
import com.example.tarotappdb_01.databinding.FavoriteQuoteItemBinding

class FavoriteQrvAdapter(
    private val favoriteQList: List<FavoriteQuote>
) : RecyclerView.Adapter<FavoriteQrvAdapter.FavoriteQuoteViewHolder>() {

    inner class FavoriteQuoteViewHolder(val binding: FavoriteQuoteItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteQuoteViewHolder {
        val binding =
            FavoriteQuoteItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FavoriteQuoteViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return favoriteQList.size
    }

    override fun onBindViewHolder(holder: FavoriteQuoteViewHolder, position: Int) {
        val favoriteQuote = favoriteQList[position]


        holder.binding.quoteOfTheDayTV.text = favoriteQuote.q
        holder.binding.sourceTV.text = favoriteQuote.a



    }

}