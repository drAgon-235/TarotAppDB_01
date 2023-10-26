package com.example.tarotappdb_01.quotes.uiModel.favQuoteFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.tarotappdb_01.databinding.FragmentFavoriteQrvBinding
import com.example.tarotappdb_01.quotes.uiModel.FavQuotesViewModel


class FavoriteQrvFragment : Fragment() {

    private lateinit var binding: FragmentFavoriteQrvBinding
    private val viewModel: FavQuotesViewModel by activityViewModels()

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

        binding.quoteRV.hasFixedSize()

        viewModel.loadQuotesVM()

        viewModel.favQuotesListLD.observe(viewLifecycleOwner){
            binding.quoteRV.adapter = FavoriteQrvAdapter(it)
            //binding.quoteRV.setOnDragListener(viewModel.deleteFavQuoteVM(it.value.toString()))

        }





    }


}