package com.example.tarotappdb_01.quotes.favQuotesDB

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.tarotappdb_01.quotes.uiModel.favQuoteFrag.FavoriteQuote
import java.lang.Exception


private val TAG = "RepositoryTAG"
class FavQuoteRepository(private val database: FavQuoteDatabase) {

    // Variable for saving the List (in the viewModel):
    val favQuotesList: LiveData<List<FavoriteQuote>> = MutableLiveData()


    fun insertFavQuote(newFavQuote: FavoriteQuote){
        try {
            database.favQuoteDao.insertFavDao(newFavQuote)
        }catch (e: Exception){
            Log.d(TAG, "Error while inserting FAVQuote to Database: $e")
        }

    }

    fun loadFavQuotes(): LiveData<List<FavoriteQuote>>{
        return database.favQuoteDao.getAll()

    }

    fun dummyData() {
        database.favQuoteDao.insertFavDao(DummyQuotes.quote1)
        database.favQuoteDao.insertFavDao(DummyQuotes.quote2)
        database.favQuoteDao.insertFavDao(DummyQuotes.quote3)
        database.favQuoteDao.insertFavDao(DummyQuotes.quote4)
        database.favQuoteDao.insertFavDao(DummyQuotes.quote5)
        database.favQuoteDao.insertFavDao(DummyQuotes.quote6)
        database.favQuoteDao.insertFavDao(DummyQuotes.quote7)
        database.favQuoteDao.insertFavDao(DummyQuotes.quote8)
    }

    fun getCount(): Int {
        return database.favQuoteDao.count()
    }



}