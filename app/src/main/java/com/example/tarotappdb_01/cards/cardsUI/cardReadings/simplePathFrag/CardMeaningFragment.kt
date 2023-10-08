package com.example.tarotappdb_01.cards.cardsUI.cardReadings.simplePathFrag

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.tarotappdb_01.cards.cardsUI.CardsViewModel
import com.example.tarotappdb_01.cards.model.Card
import com.example.tarotappdb_01.cards.model.RawCardData
import com.example.tarotappdb_01.databinding.FragmentCardMeaningBinding
import java.lang.Exception

private  val TAG = "CardMeaningFragment"
class CardMeaningFragment : Fragment() {


    private lateinit var binding: FragmentCardMeaningBinding
    private val viewmodel: CardsViewModel by activityViewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
           // param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCardMeaningBinding.inflate(inflater, container, false)
        return binding.root      }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // --- Card Nr. 01 ---
        // Create & initialize "holder" for Card 01 (DefaultData neccessery!)
        var cardNr01: Card = RawCardData.card21Judgement
        // Create & initialize "holder" for picture Drawable (always by Int !!!) (DefaultData neccessery!)
        var picNr01: Int = 0
        // Getting Card Nr. 01 from the viewmodel:
        // Get the ID from the argument in the nav_graph:
        val card01ID = requireArguments().getInt("card01ID")
        // Loading the simple List<Cards> into viewmodel's 'cardListSimple' (NO LiveData):
        viewmodel.loadCardListFromDBinViewModel()
        val listNoLD = viewmodel.cardListSimple

        try {
            // Use the ID to get our wanted Card:
            cardNr01 = listNoLD[card01ID - 1]
            Log.d(TAG, "SUCCESS_2.1: ONE Card loaded to OneCardFragment for 'Card of the day' Button")
        }catch (e: Exception){
            Log.e(TAG, "ERROR_2.1 getting one Card from VM - now you're really dumped")
        }

        // Isolating Card's corresponding picture as "Drawable" (always by Int):
        picNr01 = cardNr01.picture
        // Binding picture and texts to (re-usable, scrollable & very flexible) Fragment:
        binding.cardPictureIV.setImageResource(picNr01)
        binding.editNameTV.text = cardNr01.name



        // --- Card Nr. 02 ---
        // Create & initialize "holder" for Card 02 (DefaultData neccessery!)
        var cardNr02: Card = RawCardData.card21Judgement
        // Create & initialize "holder" for picture Drawable (always by Int !!!) (DefaultData neccessery!)
        var picNr02: Int = 0
        // Getting Card Nr. 01 from the viewmodel:
        // Get the ID from the argument in the nav_graph:
        val card02ID = requireArguments().getInt("card02ID")
        // Loading the simple List<Cards> into viewmodel's 'cardListSimple' (NO LiveData):
        //viewmodel.loadCardListFromDBinViewModel()
       // val listNoLD = viewmodel.cardListSimple

        try {
            // Use the ID to get our wanted Card:
            cardNr02 = listNoLD[card02ID - 1]
            Log.d(TAG, "SUCCESS_2.2: ONE Card loaded to OneCardFragment for 'Card of the day' Button")
        }catch (e: Exception){
            Log.e(TAG, "ERROR_2.2 getting one Card from VM - now you're really dumped")
        }

        // Isolating Card's corresponding picture as "Drawable" (always by Int):
        picNr02 = cardNr02.picture
        // Binding picture and texts to (re-usable, scrollable & very flexible) Fragment:
        binding.card02PictureIV.setImageResource(picNr02)
        binding.edit2NameTV.text = cardNr02.name



        // --- Card Nr. 03 ---
        // Create & initialize "holder" for Card 03 (DefaultData neccessery!)
        var cardNr03: Card = RawCardData.card21Judgement
        // Create & initialize "holder" for picture Drawable (always by Int !!!) (DefaultData neccessery!)
        var picNr03: Int = 0
        // Getting Card Nr. 01 from the viewmodel:
        // Get the ID from the argument in the nav_graph:
        val card03ID = requireArguments().getInt("card03ID")
        // Loading the simple List<Cards> into viewmodel's 'cardListSimple' (NO LiveData):
        //viewmodel.loadCardListFromDBinViewModel()
        // val listNoLD = viewmodel.cardListSimple

        try {
            // Use the ID to get our wanted Card:
            cardNr03 = listNoLD[card03ID - 1]
            Log.d(TAG, "SUCCESS_2.3: ONE Card loaded to OneCardFragment for 'Card of the day' Button")
        }catch (e: Exception){
            Log.e(TAG, "ERROR_2.3 getting one Card from VM - now you're really dumped")
        }

        // Isolating Card's corresponding picture as "Drawable" (always by Int):
        picNr03 = cardNr03.picture
        // Binding picture and texts to (re-usable, scrollable & very flexible) Fragment:
        binding.card03PictureIV.setImageResource(picNr03)
        binding.edit3NameTV.text = cardNr03.name

    }
}