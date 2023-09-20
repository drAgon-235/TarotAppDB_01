package com.example.tarotappdb_01.cards.cardsDB

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tarotappdb_01.cards.model.Card

@Dao
interface CardsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCardDao(cards: Card)

    @Query("SELECT * FROM cards_table")
    fun getAllCardsDao(): LiveData<List<Card>>

    @Query("SELECT COUNT(*) FROM cards_table")
    fun countDAO(): Int


}