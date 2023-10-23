package com.example.tarotappdb_01.quotes.uiModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tarotappdb_01.quotes.QuotesRepository
import com.example.tarotappdb_01.quotes.api.QuotesApi
import com.example.tarotappdb_01.quotes.favQuotesDB.FavQuoteDatabase.Companion.getDatabase
import com.example.tarotappdb_01.quotes.favQuotesDB.FavQuoteRepository
import com.example.tarotappdb_01.quotes.uiModel.favQuoteFrag.FavoriteQuote
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class QuotesViewModel(application: Application) : AndroidViewModel(application){

    // Just the Quote from the API:
    private val repository = QuotesRepository(QuotesApi)

    val dayQuote= repository.quoteList

    /*
    Bullshit - it's all in the FavQuoteVW
    // The favQuote Database:  (be careful: we have a fun getDatabse() for the CardsDB too, choose the right one)
    private val database = getDatabase(application)
    private var repositoryFavQuotes = FavQuoteRepository(database)
    var favQuotesListLD: LiveData<List<FavoriteQuote>> = repositoryFavQuotes.favQuotesList


     */

    init {
        loadQuoteFromRepoToVM()
    }

    // Just the Quote from the API:
    fun loadQuoteFromRepoToVM(){
        viewModelScope.launch(Dispatchers.IO){
            Log.d("ViewModel_TAG", "LOAD Quote FROM Repo TO ViewModel")
            repository.loadQuoteListFromApiToRepo()
        }
    }


}