package com.example.tarotappdb_01.quotes.uiModel.quoteOfDayFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.tarotappdb_01.R
import com.example.tarotappdb_01.databinding.FragmentQuoteBinding
import com.example.tarotappdb_01.quotes.uiModel.QuotesViewModel


class QuoteFragment : Fragment() {

    private lateinit var binding: FragmentQuoteBinding
    private val viewmodel: QuotesViewModel by viewModels()


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
        binding = FragmentQuoteBinding.inflate(inflater, container, false)
        return binding.root      }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val finalDayQuote = viewmodel.dayQuote

        viewmodel.dayQuote.observe(viewLifecycleOwner){
            binding.quoteOfTheDayTV.setText(finalDayQuote.value!!.q)
            binding.sourceTV.setText(finalDayQuote.value!!.a)
        }

    }
}