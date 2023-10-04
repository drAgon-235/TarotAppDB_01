package com.example.tarotappdb_01.cards.cardsUI.cardReadings.pathOfWisdomFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.tarotappdb_01.R
import com.example.tarotappdb_01.cards.cardsUI.CardsViewModel
import com.example.tarotappdb_01.databinding.FragmentPathOfWisdomBinding
import com.example.tarotappdb_01.databinding.FragmentSimplPathBinding


class PathOfWisdomFragment : Fragment() {

    private lateinit var binding: FragmentPathOfWisdomBinding
    private val viewmodel: CardsViewModel by activityViewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPathOfWisdomBinding.inflate(inflater, container, false)
        return binding.root      }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rotatingCard = binding.backCardIV
        binding.layCrossBTN.animate()

        // Loading the simple, UNSHUFFLED List<Cards> into viewmodel's 'cardListSimple' (NO LiveData):
        viewmodel.loadCardListFromDBinViewModel()




    }


}