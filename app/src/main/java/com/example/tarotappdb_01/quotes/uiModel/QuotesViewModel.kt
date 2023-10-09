package com.example.tarotappdb_01.quotes.uiModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tarotappdb_01.quotes.QuotesRepository
import com.example.tarotappdb_01.quotes.api.QuotesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuotesViewModel : ViewModel() {

    private val repository = QuotesRepository(QuotesApi)

    val dayQuote= repository.quoteList

    init {
        loadQuoteFromRepoToVM()
    }

    fun loadQuoteFromRepoToVM(){
        viewModelScope.launch(Dispatchers.IO){
            Log.d("ViewModel_TAG", "LOAD Quote FROM Repo TO ViewModel")
            repository.loadQuoteListFromApiToRepo()
        }
    }

}