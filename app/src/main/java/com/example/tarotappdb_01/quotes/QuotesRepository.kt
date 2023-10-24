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
        try {
            Log.d(TAG, "load QuoteList from API to Repository : Start")
            //Downloading a list with DEFINITELY just ONE Quote (API Random Method):
            val loadedQuoteList = QuotesApi.apiRetrofitService.getRandomQuoteFromAPI()
            // Saving this ONE (first[0]) Quote into our LiveData<Quote> with the Quote of the Day to be displplayed:
            val workingQuote = loadedQuoteList[0]
            _quoteList.postValue(workingQuote)
            Log.d(TAG, "load QuoteList from API to Repository : Successful")
        }catch (e: Exception){
            Log.e(TAG, "ERROR loading QuoteList from API to Repository !!!")
        }
    }




}