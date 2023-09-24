package com.example.tarotappdb_01.cards.cardsUI.allCardsRVFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.tarotappdb_01.cards.cardsUI.CardsViewModel
import com.example.tarotappdb_01.databinding.FragmentAllCardsRvBinding


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

        // !! All Recyclerviews are using the same Adapter simultanously !!

        //Major Arcana Recyclerview:
        // Load Databaseto VM used here:
        viewmodel.loadCardsFromDBinVMasLD()
        //bind recyclerview to this Fragment:
        val recyclerView = binding.cardsListRV
        //optimize occurence of RV:
        recyclerView.hasFixedSize()

        //Observing theVM's LD 'cardListLD' and attach to Adapter
        viewmodel.cardsListLD.observe(viewLifecycleOwner){
            recyclerView.adapter = AllCardsRVAdapter(it)
        }

        //CUPS Recyclerview:
        // Load CUPS Databaseto VM used here:
        viewmodel.loadCUPSFromDBinVWasLD()
        //bind recyclerview to this Fragment:
        val recyclerViewCups = binding.cupsListRV
        //optimize occurence of RV:
        recyclerViewCups.hasFixedSize()

        //Observing theVM's LD 'cardListLD' and attach to Adapter
        viewmodel.cardsListLD.observe(viewLifecycleOwner) {
            recyclerViewCups.adapter = AllCardsRVAdapter(it)
        }

        //SWORDS Recyclerview:
        // Load SWORDS Databaseto VM used here:
        viewmodel.loadSWORDSFromDBinVMasLD()
        //bind recyclerview to this Fragment:
        val recyclerViewSWORDS = binding.swordsListRV
        //optimize occurence of RV:
        recyclerViewSWORDS.hasFixedSize()

        //Observing theVM's LD 'cardListLD' and attach to Adapter
        viewmodel.cardsListLD.observe(viewLifecycleOwner) {
            recyclerViewSWORDS.adapter = AllCardsRVAdapter(it)
        }




    }




}