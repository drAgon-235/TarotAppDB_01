package com.example.tarotappdb_01.veryHomeFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tarotappdb_01.R
import com.example.tarotappdb_01.databinding.FragmentOneCardBinding
import com.example.tarotappdb_01.databinding.FragmentVeryHomeBinding


class VeryHomeFragment : Fragment() {

    private lateinit var binding: FragmentVeryHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentVeryHomeBinding.inflate(inflater, container, false)
        return binding.root      }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dayCardBTN = binding.dayCardBTN
        val cardsReading = binding.cardReadingBTN
        val allCardsBTN = binding.allCardsListBTN
        val quoteBTN = binding.quoteBTN

        allCardsBTN.setOnClickListener {
            findNavController().navigate(VeryHomeFragmentDirections.actionVeryHomeFragmentToAllCardsRVFragment())
        }

        dayCardBTN.setOnClickListener {
            findNavController().navigate(VeryHomeFragmentDirections.actionVeryHomeFragmentToOneCardFragment(21))
        }
    }
}