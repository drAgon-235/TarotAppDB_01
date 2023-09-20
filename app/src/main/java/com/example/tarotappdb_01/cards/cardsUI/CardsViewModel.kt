package com.example.tarotappdb_01.cards.cardsUI

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.tarotappdb_01.cards.cardsDB.CardsDatabase.Companion.getDatabase
import com.example.tarotappdb_01.cards.cardsDB.Repository
import com.example.tarotappdb_01.cards.model.Card

private val TAG = "CardsViewModel_TAG"

class CardsViewModel(application: Application) : AndroidViewModel(application) {

    //Creating instance of the DB:
    private val database = getDatabase(application)

    //Creating a Repository (as an object) and giving it the (empty) DB:
    private var repository = Repository(database)


    // Creating a LD where the abstract LDList of the Repository ist saved
    var cardsListLD: LiveData<List<Card>> = repository.cardsLiveList

    init{
        // Filling Cards to Room-DB in App is run for the first time (in Main)
        Log.d(TAG, "PrepopulateDB while crating VM")
        repository.populateDB()
    }


    // Finally loading the DB to the LD-Variable:
    fun loadCardsFromDBinVM(){
        cardsListLD = repository.getAllCardsRepoAsLD()
    }



}