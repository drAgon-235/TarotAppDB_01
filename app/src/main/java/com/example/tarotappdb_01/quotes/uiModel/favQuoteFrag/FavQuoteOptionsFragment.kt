package com.example.tarotappdb_01.quotes.uiModel.favQuoteFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
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

        val shareLogo = binding.shareIV.setImageResource(R.drawable.baseline_share_24)
        val deleteLogo = binding.deleteIV.setImageResource(R.drawable.baseline_delete_forever_24)

        // Gettiing the Argument-ID:
        favQuoteID = requireArguments().getString("favQuoteIDText")!!

        //Finding the Quote using the Key (from the argument in the nav_graph):
        val favQuote = viewModel.favQuotesListLD.value?.find { it.q == favQuoteID } ?: return

        // Now set the Data into fields again:
        binding.quoteOfTheDayTV.setText(favQuote.q)
        binding.sourceTV.setText(favQuote.a)

        // Delete Button:
        binding.dislikingCV.setOnClickListener {
            viewModel.deleteFavQuoteVM(favQuote.q)
            //findNavController().navigate(FavQuoteOptionsFragmentDirections.actionFavQuoteOptionsFragmentToFavoriteQrvFragment())
            binding.quoteOfTheDayTV.setText("deleted from\nFavorite Quotes List")
            binding.sourceTV.setText(" ")
            binding.quoteOfTheDayTV.setTextColor(0xFFE30000.toInt())
        }

        // Share Button:
        // TODO :

    }

}