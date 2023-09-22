package com.example.tarotappdb_01.cards.cardsUI.oneCardFrag

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
import com.example.tarotappdb_01.databinding.FragmentOneCardBinding
import java.lang.Exception


private val TAG = "OneCardFragment_TAG"

class OneCardFragment : Fragment() {

    private lateinit var binding: FragmentOneCardBinding
    private val viewmodel: CardsViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOneCardBinding.inflate(inflater, container, false)
        return binding.root      }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Neccessary pre-declarations & inits:
        // Loading the simple List<Cards> into viewmodel's 'cardListSimple' (NO LiveData), used later on:
        viewmodel.loadCardListFromDBinViewModel()
        // Create & initialize "holder" for one Card (DefaultData neccessery!)
        var oneCard: Card = RawCardData.card21Judgement
        // Create & initialize "holder" for picture Drawable (always by Int !!!) (DefaultData neccessery!)
        var pic: Int = 0


        // How to get one distinct Card from the viewmodel:

        // Get the ID from the argument in the nav_graph:
        val cardID = requireArguments().getInt("cardID")

        // **"A"** For the LiveData (for RecyclerView):
        val listLD = viewmodel.cardsListLD
            // Transform from LiveData to usual List:
        val list = listLD.value.orEmpty()


        // Habe ich mal gecatcht, weil es hier crasht, wenn Button 1 'Tageskarte' angeklickt wird?
        // Following Block is always executed, when Button 1 is clicked first.
        try {
            // Use the ID to get our wanted Card:
            oneCard = list[cardID - 1]
            // Doesn't work with Button 1 (from the beginning, if Button 3 is clicked fist, then Button 1 works properly ?!?!?!?!)
        }catch (e: Exception){
            Log.e(TAG, "ERROR_1 getting one Card from LiveData - continue to NOT LiveData List ;-D ???")
        }


        // And in Case Button 1 ('Card of the day') is clicked first!:
        // **"B"** for NO LiveData - just simple List, no Nullables !! (which made trouble here) :

        // Rescue: extra Function in Dao (without LiveData - just get simple List<Card>)
        // -> extra Variable in Repo, in VM & here in the Fragment, after catching the upper TC-Blocks,
        val listNoLD = viewmodel.cardListSimple

        // Try again, with simple List<Card> - NO LiveData !!:
        // Only the following helps working Button 1 work properly from the first click on:
        try {
            // Use the ID to get our wanted Card:
            oneCard = listNoLD[cardID - 1]
            Log.d(TAG, "SUCCESS: ONE Card loaded to OneCardFragment for 'Card of the day' Button")
        }catch (e: Exception){
            Log.e(TAG, "ERROR_2 getting one Card from VM - now you're really dumped")
        }
        // This double-treatment (LiveData / No LiveData) is neccessary, because I'm reusing this Fragment by different Buttons with different actions & purposes.

        // Isolating corresponding picture as "Drawable" (always by Int):
        pic = oneCard.picture

        // Binding picture and texts to (re-usable, scrollable & very flexible) OneCardFragment:
        binding.cardPictureIV.setImageResource(pic)
        binding.editNameTV.text = oneCard.name
        binding.editArcanaTV.text = oneCard.suit.toString()
        binding.editValueTV.text = oneCard.value
        binding.editKeywordsTV.text = oneCard.keywords
        binding.editMeaningtTV.text = oneCard.meaning_up
        binding.editFortuneTellTV.text = oneCard.fortuneTelling
        binding.editQtaTV.text = oneCard.qta
        binding.editDescriptionTV.text = oneCard.description

    }
}




/*

        binding2.title2TV.setText("YOUR Card of the day")

        viewmodel.loadCardsFromDBinVM()

        // How to get one distinct Card from the viewmodel.LiveData:
        val listLD = viewmodel.cardsListLD

        val list = listLD.value

        val oneCard = list!![1]

 */