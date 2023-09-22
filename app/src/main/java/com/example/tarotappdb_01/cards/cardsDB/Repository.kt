package com.example.tarotappdb_01.cards.cardsDB

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.tarotappdb_01.cards.model.Card
import com.example.tarotappdb_01.cards.model.RawCardData
import java.lang.Exception

private val TAG = "Repository_TAG"

// Gets 'empty' database in the Constructor:
class Repository(private val databse: CardsDatabase) {

    // Saves the result of the   fun getAllCardsDao()   of the DAO as LiveData:
    val cardsLiveList: LiveData<List<Card>> = MutableLiveData()

    // Saves a NO Live Data List<Card>
    val cardsListNoLD: List<Card> = listOf()

    //  populate our DB in the ...
    fun populateDB(){
        try {
            Log.d(TAG, "TRY: populating the DB in Repository")
            // Put each card from the cardListRaw into DB:
            if (databse.cardsDao.countDAO() == 0){
                for (each in RawCardData.cardListRaw){
                    Log.d(TAG, "START: populating the DB in Repository")
                    databse.cardsDao.insertCardDao(each)
                    Log.d(TAG, "SUCCESS_1: populating the DB in Repository")
                }
            }
        }catch (e: Exception){
            Log.e(TAG, "ERROR: populating the DB - maybe DB is not empty")
        }
        Log.d(TAG, "SUCCESS_2: BD is fully loaded  in Repository")
    }



    // Fun to load all cards as LiveData (for a RecyclerView e.g.)
    fun getAllCardsRepoAsLD(): LiveData<List<Card>>{
        return databse.cardsDao.getAllCardsDao()
    }

    fun getCardsListRepo(): List<Card> {
        return databse.cardsDao.getCardsList()
    }

}













