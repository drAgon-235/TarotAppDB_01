package com.example.tarotappdb_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.tarotappdb_01.cards.cardsUI.CardsViewModel
import com.example.tarotappdb_01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: CardsViewModel
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    // The Boiler-Plate for implementing the Material Toolbar
    //
        // Get the navHostFragment:
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        // Get the navController from the navHostFragment:
        navController = navHostFragment.navController

        // get the MainViewModel:
        viewModel = ViewModelProvider(this)[CardsViewModel::class.java]

        // setting up the ActionTOOLBar with the navController:
        setupActionBarWithNavController(navController)

    }


    // making the Back-Arrow work properly:
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }







}