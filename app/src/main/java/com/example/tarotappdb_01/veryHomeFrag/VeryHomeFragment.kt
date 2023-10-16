package com.example.tarotappdb_01.veryHomeFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.tarotappdb_01.R
import com.example.tarotappdb_01.cards.cardsDB.Repository
import com.example.tarotappdb_01.cards.cardsUI.CardsViewModel
import com.example.tarotappdb_01.databinding.FragmentOneCardBinding
import com.example.tarotappdb_01.databinding.FragmentVeryHomeBinding
import kotlin.random.Random


class VeryHomeFragment : Fragment() {

    private lateinit var binding: FragmentVeryHomeBinding
    val viewmodel: CardsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentVeryHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // Random Card of the Day:
        binding.dayCardBTN.setOnClickListener {
            // Generates a random card-ID, which is trasmitted by argument in the nav_graph to the OneCardFragment:
            val randomCardID = (0 until 79).random()
            findNavController().navigate(VeryHomeFragmentDirections.actionVeryHomeFragmentToOneCardFragment(randomCardID))
        }


        // Brings you to diverse Card Reading Options:
        binding.cardReadingBTN.setOnClickListener {
            findNavController().navigate(VeryHomeFragmentDirections.actionVeryHomeFragmentToReadingsHomeFragment())
        }


        // Overview of all Tarot Cards sorted by Arcanas:
        binding.allCardsListBTN.setOnClickListener {
            findNavController().navigate(VeryHomeFragmentDirections.actionVeryHomeFragmentToAllCardsRVFragment())
        }


        // API - Call: Quote of the Day:
        binding.quoteBTN.setOnClickListener {
            findNavController().navigate(VeryHomeFragmentDirections.actionVeryHomeFragmentToQuoteFragment())
        }




    }
}