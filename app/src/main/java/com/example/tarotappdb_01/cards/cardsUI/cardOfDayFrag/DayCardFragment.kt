package com.example.tarotappdb_01.cards.cardsUI.cardOfDayFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.tarotappdb_01.R
import com.example.tarotappdb_01.cards.cardsUI.CardsViewModel
import com.example.tarotappdb_01.databinding.FragmentAllCardsRvBinding
import com.example.tarotappdb_01.databinding.FragmentDayCardBinding
import com.example.tarotappdb_01.databinding.FragmentOneCardBinding


class DayCardFragment : Fragment() {

    //private lateinit var binding: FragmentDayCardBinding
    private lateinit var binding2: FragmentOneCardBinding
    private val viewmodel: CardsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding2 = FragmentOneCardBinding.inflate(inflater, container, false)
        return binding2.root     }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding2.title2TV.setText("YOUR Card of the day")

        viewmodel.loadCardsFromDBinVM()

        // How to get one distinct Card from the viewmodel.LiveData:
        val listLD = viewmodel.cardsListLD

        val list = listLD.value

        val oneCard = list!![1]

        binding2.descriptionTV.text = oneCard.description

    }

}