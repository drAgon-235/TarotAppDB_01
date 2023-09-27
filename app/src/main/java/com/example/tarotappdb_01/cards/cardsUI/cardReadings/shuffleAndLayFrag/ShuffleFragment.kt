package com.example.tarotappdb_01.cards.cardsUI.cardReadings.shuffleAndLayFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tarotappdb_01.R
import com.example.tarotappdb_01.databinding.FragmentReadingsHomeBinding
import com.example.tarotappdb_01.databinding.FragmentShuffleBinding


class ShuffleFragment : Fragment() {

    private lateinit var binding: FragmentShuffleBinding

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
        binding = FragmentShuffleBinding.inflate(inflater, container, false)
        return binding.root      }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val shuffleBTN = binding.shuffleBTN
        val layBTN = binding.layBTN

        val mixCard1 = binding.cardMixIV1

        shuffleBTN.setOnClickListener {
            mixCard1.animate().rotation(360f)
            // BUG : Der Button reagiert nur beim ersten Click !!!
            // Er soll aber unbegrenzt oft shuffeln können:
        }

    }





}