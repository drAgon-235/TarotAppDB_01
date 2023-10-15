package com.example.tarotappdb_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.tarotappdb_01.cards.cardsUI.CardsViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewmodel: CardsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Test 01

        //viewmodel = ViewModelProvider(this)[CardsViewModel::class.java]
    }
}