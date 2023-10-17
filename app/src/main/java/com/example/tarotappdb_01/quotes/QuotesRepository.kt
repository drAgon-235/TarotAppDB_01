package com.example.tarotappdb_01.quotes

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.tarotappdb_01.quotes.api.QuotesApi
import com.example.tarotappdb_01.quotes.dataModel.Quote


const val TAG = "RepositoryTAG"

class QuotesRepository(val apiService: QuotesApi) {

    private val _quoteList: MutableLiveData<Quote> = MutableLiveData<Quote>()
    val quoteList: LiveData<Quote>
        get() = _quoteList


    suspend fun loadQuoteListFromApiToRepo(){
        Log.d(TAG, "load QuoteList from API to Repository : Start")
        val loadedQuoteList = QuotesApi.apiRetrofitService.getRandomQuoteFromAPI()
        val workingQuote = loadedQuoteList[0]  // Diese Zeile war Gehirnschmalz pur, hat nämlich zu tun mit der ganze Daten-Struktur !!!
        _quoteList.postValue(workingQuote)
        Log.d(TAG, "load QuoteList from API to Repository : Successful")
    }




}