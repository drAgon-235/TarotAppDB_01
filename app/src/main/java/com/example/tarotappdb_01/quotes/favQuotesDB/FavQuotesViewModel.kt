package com.example.tarotappdb_01.quotes.favQuotesDB

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.tarotappdb_01.quotes.favQuotesDB.FavQuoteDatabase.Companion.getDatabase
import com.example.tarotappdb_01.quotes.uiModel.favQuoteFrag.FavoriteQuote
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class FavQuotesViewModel(application: Application) : AndroidViewModel(application) {

    private val database = getDatabase(application)

    private var repository = FavQuoteRepository(database)

    var favQuotesList: LiveData<List<FavoriteQuote>> = repository.favQuotesList


    init {
        repository.dummyData()
    }

    fun loadQuotesVM(){
        //Loading all Data from DB into the variable
        favQuotesList = repository.loadFavQuotes()
    }

    fun getCountFavsTable(): Int{
        return repository.getCount()
    }

    fun insertFavQuoteVM(favQuote: FavoriteQuote) : Job {
        return viewModelScope.launch {
            repository.insertFavQuote(favQuote)
        }
    }
}