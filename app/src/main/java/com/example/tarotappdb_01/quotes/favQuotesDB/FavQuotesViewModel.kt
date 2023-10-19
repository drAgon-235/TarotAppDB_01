package com.example.tarotappdb_01.quotes.favQuotesDB

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.tarotappdb_01.quotes.favQuotesDB.FavQuoteDatabase.Companion.getDatabase
import com.example.tarotappdb_01.quotes.uiModel.favQuoteFrag.FavoriteQuote

class FavQuotesViewModel(application: Application) : AndroidViewModel(application) {

    private val database = getDatabase(application)

    private var repository = FavQuoteRepository(database)

    var favQuotesList: LiveData<List<FavoriteQuote>> = repository.favQuotesList



    init {
        repository.dummyData()
    }

    fun loadQuotesVM(){
        favQuotesList = repository.loadFavQuotes()
    }
}