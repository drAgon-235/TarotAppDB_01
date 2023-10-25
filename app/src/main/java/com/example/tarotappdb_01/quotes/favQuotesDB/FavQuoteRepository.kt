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
            Log.d(TAG, "START: Inserting FavoriteQuote into DB")
            database.favQuoteDao.insertFavDao(newFavQuote)
            Log.d(TAG, "SUCCESS: Inserting FavoriteQuote into DB finished!")
        }catch (e: Exception){
            Log.e(TAG, "Error while inserting FAVQuote to Database: $e!!")
        }

    }

    fun loadFavQuotes(): LiveData<List<FavoriteQuote>>{
        return database.favQuoteDao.getAll()

    }

    fun dummyData() {
        database.favQuoteDao.insertFavDao(DummyQuotes.quote1)
        database.favQuoteDao.insertFavDao(DummyQuotes.quote2)
    }

    fun getCount(): Int {
        return database.favQuoteDao.count()
    }

    fun deleteFavQuoteByID(idText: String){
        try {
            Log.d(TAG, "START Deleting FAVQuote from Database...")
            database.favQuoteDao.delete(idText)
            Log.d(TAG, "...Deleting FAVQuote from Database: SUCCESSFUL!!")
        }catch (e: Exception){
            Log.e(TAG, "Error while deleting FAVQuote from Database: $e!!")
        }


    }



}