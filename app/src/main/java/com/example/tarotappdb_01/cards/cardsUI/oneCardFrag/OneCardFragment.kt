package com.example.tarotappdb_01.cards.cardsUI.oneCardFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import com.example.tarotappdb_01.R
import com.example.tarotappdb_01.databinding.FragmentOneCardBinding


class OneCardFragment : Fragment() {

    private lateinit var binding: FragmentOneCardBinding
    private val viewmodel: ViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOneCardBinding.inflate(inflater, container, false)
        return binding.root      }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cardID = requireArguments().getInt("cardID").toString()

        binding.editValueTV.text = cardID.toString()
    }

}