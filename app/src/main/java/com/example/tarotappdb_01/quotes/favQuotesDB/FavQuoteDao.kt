package com.example.tarotappdb_01.quotes.favQuotesDB

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tarotappdb_01.quotes.uiModel.favQuoteFrag.FavoriteQuote

@Dao
interface FavQuoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFavDao(itemData: FavoriteQuote)

    @Query("SELECT * FROM favorites_table")
    fun getAll(): LiveData<List<FavoriteQuote>>

    @Query("DELETE FROM favorites_table WHERE q = :text")
    fun delete(text: String)

    @Query("SELECT COUNT(*) FROM favorites_table")
    fun count(): Int
}