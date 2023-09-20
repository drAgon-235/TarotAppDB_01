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

    // Saves (persists) ONE 'Card' to CardsDB:
    fun insertCard(card: Card){
        try {
            Log.d(TAG, "TRY: loading card to DB with fun insertCard()")
            databse.cardsDao.insertCardDao(card)
        }catch (e: Exception){
            Log.e(TAG, "ERROR loading card to DB with fun insertCard()")
        }
        Log.d(TAG, "SUCCESS: loading card to DB with fun insertCard()")
    }

    //  populate our DB in the ...
    fun populateDB(){
        try{
            Log.d(TAG, "TRY: populating the DB")
            // Add RawCardsDatabase to DB
            if (databse.cardsDao.countDAO() == 0){
                Log.d(TAG, "START: populating the DB")
                databse.cardsDao.insertCardDao(RawCardData.card01TheFool)
                databse.cardsDao.insertCardDao(RawCardData.card02TheMagician)
                databse.cardsDao.insertCardDao(RawCardData.card03TheHighPriestess)
                databse.cardsDao.insertCardDao(RawCardData.card04TheEmpress)
                databse.cardsDao.insertCardDao(RawCardData.card05TheEmperor)
                databse.cardsDao.insertCardDao(RawCardData.card06TheHierophant)
                databse.cardsDao.insertCardDao(RawCardData.card07TheLovers)
                databse.cardsDao.insertCardDao(RawCardData.card08TheChariot)
                databse.cardsDao.insertCardDao(RawCardData.card09TheStrength)
                databse.cardsDao.insertCardDao(RawCardData.card10TheHermit)
                databse.cardsDao.insertCardDao(RawCardData.card11WheelOfFortune)
                databse.cardsDao.insertCardDao(RawCardData.card12Justice)
                databse.cardsDao.insertCardDao(RawCardData.card13TheHangedMan)
                databse.cardsDao.insertCardDao(RawCardData.card14Death)
                databse.cardsDao.insertCardDao(RawCardData.card15Temperance)
                databse.cardsDao.insertCardDao(RawCardData.card16TheDevil)
                databse.cardsDao.insertCardDao(RawCardData.card17TheTower)
                databse.cardsDao.insertCardDao(RawCardData.card18TheStar)
                databse.cardsDao.insertCardDao(RawCardData.card19TheMoon)
                databse.cardsDao.insertCardDao(RawCardData.card20TheSun)
                databse.cardsDao.insertCardDao(RawCardData.card21Judgement)
                databse.cardsDao.insertCardDao(RawCardData.card22TheWorld)
                Log.d(TAG, "SUCCESS_1: populating the DB")
            }
        }catch (e: Exception){
            Log.e(TAG, "ERROR: populating the DB - maybe DB is not empty")
        }
        Log.d(TAG, "SUCCESS_2: Nothing was loaded, because DB ist not empty")

    }

    // Fun to load all cards as LiveData (for a RecyclerView e.g.)
    fun getAllCardsRepoAsLD(): LiveData<List<Card>>{
        return databse.cardsDao.getAllCardsDao()
    }

}













