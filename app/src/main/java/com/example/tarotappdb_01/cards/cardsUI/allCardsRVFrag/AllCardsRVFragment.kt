package com.example.tarotappdb_01.cards.cardsUI.allCardsRVFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tarotappdb_01.R
import com.example.tarotappdb_01.cards.cardsUI.CardsViewModel
import com.example.tarotappdb_01.databinding.FragmentAllCardsRvBinding
import kotlinx.coroutines.launch


class AllCardsRVFragment : Fragment() {

    private lateinit var binding: FragmentAllCardsRvBinding
    private val viewmodel: CardsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAllCardsRvBinding.inflate(inflater, container, false)
        return binding.root      }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Load Databaseto VM used here:
        viewmodel.loadCardsFromDBinVM()
        //bind recyclerview to this Fragment:
        val recyclerView = binding.cardsListRV
        //optimize occurence of RV:
        recyclerView.hasFixedSize()

        //Observing theVM's LD 'cardListLD' and attach to Adapter
        viewmodel.cardsListLD.observe(viewLifecycleOwner){
            recyclerView.adapter = AllCardsRVAdapter(it)
        }
    }




}