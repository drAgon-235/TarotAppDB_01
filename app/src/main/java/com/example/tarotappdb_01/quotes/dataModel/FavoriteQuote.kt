package com.example.tarotappdb_01.quotes.dataModel

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorites_table")
data class FavoriteQuote (
    //val id: Int,
    @PrimaryKey
    val q: String,
    val a: String,
    var isLiked: Boolean = false
)