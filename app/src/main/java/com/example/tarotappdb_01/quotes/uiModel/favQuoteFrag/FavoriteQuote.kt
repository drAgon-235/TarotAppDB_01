package com.example.tarotappdb_01.quotes.uiModel.favQuoteFrag

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorites_table")
data class FavoriteQuote (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val q: String,
    val a: String,
    var isLiked: Boolean = false
)