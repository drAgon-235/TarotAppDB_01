package com.example.tarotappdb_01.cards.cardsUI.cardReadings.simplePathFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.example.tarotappdb_01.cards.cardsUI.CardsViewModel
import com.example.tarotappdb_01.cards.model.Card
import com.example.tarotappdb_01.databinding.FragmentSimplPathBinding


class SimplPathFragment : Fragment() {

    private lateinit var binding: FragmentSimplPathBinding
    private val viewmodel: CardsViewModel by activityViewModels()

    //private var shuffledCardList: List<Card> = viewmodel.cardListSimple.shuffled()

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
        //shuffledCardList = viewmodel.cardListSimple.shuffled()
        binding = FragmentSimplPathBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rotatingCard = binding.rotatingCardIV

        // Loading the simple, UNSHUFFLED List<Cards> into viewmodel's 'cardListSimple' (NO LiveData):
        viewmodel.loadCardListFromDBinViewModel()
        var shuffledCardList: List<Card> =
            viewmodel.cardListSimple  // is not shuffled yet for educational purposes


        // Shuffeling Cards Button:
        binding.shuffleCross.setOnClickListener {
            // First Animation: Shaking
            YoYo.with(Techniques.Shake).playOn(rotatingCard)
            // Second Animation: Rotating up & down
            rotatingCard.animate().apply {
                duration = 400
                rotationYBy(360f)
            }.withEndAction {
                rotatingCard.animate().apply {
                    duration = 400
                    rotationXBy(360f)
                }
            }
            // NOW we are really shuffeling and using shuffled Card List:
            shuffledCardList = shuffledCardList.shuffled()
            // NOW we make "LAY"-Button visible:
            binding.layCrossBTN.visibility = View.VISIBLE
        }



        // Laying Cards Button:
        binding.layCrossBTN.setOnClickListener {

            //YoYo.with(Techniques.BounceInDown).playOn(backCard)

            // Connecting the pictures to the View (not visible yet), taking the shuffled cards from top (left) to bottom (right):
            var pic1 = shuffledCardList[0].picture
            val id1  = shuffledCardList[0].id
            binding.card1IV.setImageResource(pic1)
            var pic2 = shuffledCardList[1].picture
            val id2  = shuffledCardList[1].id
            binding.card2IV.setImageResource(pic2)
            var pic3 = shuffledCardList[2].picture
            val id3  = shuffledCardList[2].id
            binding.card03IV.setImageResource(pic3)


            // Appearing-Animation Card 01 - A:
            // CardBack comes faning in dowm...
            binding.back01IV.visibility = View.VISIBLE
            YoYo.with(Techniques.FadeInDown).playOn(binding.back01IV)

            // Appearing-Animation Card 01 - B:
            // CardBack turns by 90 degrees and later disappears...
            binding.back01IV.animate().apply {
                duration = 1500
                this.rotationYBy(90f)
                binding.card1IV.animate().rotationYBy(90f)
            }.withEndAction {
                // (CardBack disappears:)
                binding.back01IV.isVisible = false
                // ... now the 1st Card from deck appears visible and turns by 90 degrees
                binding.card1IV.isVisible = true
                binding.card1IV.animate().apply {
                    duration = 1000
                    this.rotationYBy(90f)
                }
            }

            // Appearing-Animation Card 02 - A:
            binding.back02IV.visibility = View.VISIBLE
            YoYo.with(Techniques.FadeInDown).playOn(binding.back02IV)

            // Appearing-Animation Card 02 - B:
            binding.back02IV.animate().apply {
                duration = 1500
                this.rotationYBy(90f)
                binding.card2IV.animate().rotationYBy(90f)
            }.withEndAction {
                binding.back02IV.isVisible = false
                binding.card2IV.isVisible = true
                binding.card2IV.animate().apply {
                    duration = 1000
                    this.rotationYBy(90f)
                }
            }


            // Appearing-Animation Card 03 - A:
            binding.back03IV.visibility = View.VISIBLE
            YoYo.with(Techniques.FadeInDown).playOn(binding.back03IV)

            // Appearing-Animation Card 03 - B:
            binding.back03IV.animate().apply {
                duration = 1500
                this.rotationYBy(90f)
                binding.card03IV.animate().rotationYBy(90f)
            }.withEndAction {
                binding.back03IV.isVisible = false
                binding.card03IV.isVisible = true
                binding.card03IV.animate().apply {
                    duration = 1000
                    this.rotationYBy(90f)
                }
            }
        }

        //val id1  = shuffledCardList[0].id

        // OnClickLiszener for each layed card:
        binding.card1IV.setOnClickListener {
            findNavController().navigate(SimplPathFragmentDirections.actionSimplPathFragmentToOneCardFragment(shuffledCardList[0].id))
        }


    }


}