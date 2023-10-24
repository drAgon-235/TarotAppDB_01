package com.example.tarotappdb_01.quotes.uiModel.favQuoteFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.tarotappdb_01.R
import com.example.tarotappdb_01.databinding.FragmentFavQuoteOptionsBinding
import com.example.tarotappdb_01.databinding.FragmentFavoriteQrvBinding
import com.example.tarotappdb_01.quotes.favQuotesDB.FavQuotesViewModel


class FavQuoteOptionsFragment : Fragment() {

    private lateinit var binding: FragmentFavQuoteOptionsBinding
    private val viewModel: FavQuotesViewModel by activityViewModels()
    private var favQuoteID: String = ""


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
        binding = FragmentFavQuoteOptionsBinding.inflate(inflater, container, false)
        return binding.root       }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Gettiing the Argument-ID:
        favQuoteID = requireArguments().getString("favQuoteIDText")!!

        //Finding the Quote using the Key (from the argument in the nav_graph):
        val favQuote = viewModel.favQuotesListLD.value?.find { it.q == favQuoteID } ?: return

        // Now set the Data into fields again:
        binding.quoteOfTheDayTV.setText(favQuote.q)
        binding.sourceTV.setText(favQuote.a)



    }

}