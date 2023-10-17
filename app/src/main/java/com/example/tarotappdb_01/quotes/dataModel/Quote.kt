package com.example.tarotappdb_01.quotes.dataModel

data class Quote (
    val q: String,
    val a: String,
    var isLiked: Boolean = false
)