package com.example.tarotappdb_01.cards.cardsUI.oneCardFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.tarotappdb_01.cards.cardsUI.CardsViewModel
import com.example.tarotappdb_01.databinding.FragmentOneCardBinding


class OneCardFragment : Fragment() {

    private lateinit var binding: FragmentOneCardBinding
    private val viewmodel: CardsViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOneCardBinding.inflate(inflater, container, false)
        return binding.root      }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewmodel.loadCardsFromDBinVM()   // Bullshit ;D

        // How to get one distinct Card from the viewmodel.LiveData:
        val listLD = viewmodel.cardsListLD
            // Transform from LiveData to usual List:
        val list = listLD.value
            // Get the ID from the argument in the nav_graph:
        val cardID = requireArguments().getInt("cardID")
            // Use the ID to get our wanted Card:
        val oneCard = list!![cardID - 1]
            // Corresponding picture:
        val pic = oneCard.picture

        // Binding texts and picture to OneCardFragment:
        binding.cardPictureIV.setImageResource(pic)
        binding.editNameTV.text = oneCard.name
        binding.editValueTV.text = oneCard.value
        binding.editMeaningtTV.text = oneCard.meaning_up
        binding.editDescriptionTV.text = oneCard.description



    }

}

/*

        binding2.title2TV.setText("YOUR Card of the day")

        viewmodel.loadCardsFromDBinVM()

        // How to get one distinct Card from the viewmodel.LiveData:
        val listLD = viewmodel.cardsListLD

        val list = listLD.value

        val oneCard = list!![1]

 */