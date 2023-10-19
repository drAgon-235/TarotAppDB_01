package com.example.tarotappdb_01.quotes.uiModel.favQuoteFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tarotappdb_01.R
import com.example.tarotappdb_01.databinding.FragmentFavoriteQrvBinding
import com.example.tarotappdb_01.databinding.FragmentQuoteBinding


class FavoriteQrvFragment : Fragment() {

    private lateinit var binding: FragmentFavoriteQrvBinding

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
        binding = FragmentFavoriteQrvBinding.inflate(inflater, container, false)
        return binding.root      }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }


}