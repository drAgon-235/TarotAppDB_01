package com.example.tarotappdb_01.cards.cardsUI.cardReadings.readingsHomeFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tarotappdb_01.R
import com.example.tarotappdb_01.databinding.FragmentAllCardsRvBinding
import com.example.tarotappdb_01.databinding.FragmentReadingsHomeBinding


class ReadingsHomeFragment : Fragment() {

    private lateinit var binding: FragmentReadingsHomeBinding


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
        binding = FragmentReadingsHomeBinding.inflate(inflater, container, false)
        return binding.root       }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.simplePathIV.setOnClickListener {
            findNavController().navigate(ReadingsHomeFragmentDirections.actionReadingsHomeFragmentToSimplePathFragment())
        }

    }
}