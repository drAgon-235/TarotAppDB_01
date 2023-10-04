package com.example.tarotappdb_01.cards.cardsUI.cardReadings.simplePathFrag

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import androidx.core.view.ViewCompat.animate
import androidx.fragment.app.activityViewModels
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.example.tarotappdb_01.R
import com.example.tarotappdb_01.cards.cardsUI.CardsViewModel
import com.example.tarotappdb_01.cards.model.Card
import com.example.tarotappdb_01.databinding.FragmentReadingsHomeBinding
import com.example.tarotappdb_01.databinding.FragmentSimplPathBinding
import okhttp3.internal.SuppressSignatureCheck
import okhttp3.internal.wait


class simplPathFragment : Fragment() {

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
        val backCard = binding.backCardIV

        // Loading the simple, UNSHUFFLED List<Cards> into viewmodel's 'cardListSimple' (NO LiveData):
        viewmodel.loadCardListFromDBinViewModel()

        var shuffledCardList: List<Card> = viewmodel.cardListSimple


        binding.shuffleCross.setOnClickListener {
            YoYo.with(Techniques.Shake).playOn(rotatingCard)
            shuffledCardList = shuffledCardList.shuffled()
        }



        binding.layCrossBTN.setOnClickListener {

            //YoYo.with(Techniques.BounceInDown).playOn(backCard)


            var pic1 = shuffledCardList[0].picture
            binding.card1IV.setImageResource(pic1)


            var pic2 = shuffledCardList[1].picture
            binding.card2IV.setImageResource(pic2)
            var pic3 = shuffledCardList[2].picture
            binding.cardIV.setImageResource(pic3)



            //binding.card1IV.visibility = View.VISIBLE
            //binding.back01IV.visibility = View.VISIBLE
            //YoYo.with(Techniques.FadeInDown).playOn(binding.back01IV)
            binding.card1IV.visibility = View.VISIBLE

            YoYo.with(Techniques.StandUp).playOn(binding.card1IV)



            binding.card2IV.visibility = View.VISIBLE
            YoYo.with(Techniques.FadeInDown).playOn(binding.card2IV)
            binding.cardIV.visibility = View.VISIBLE
            YoYo.with(Techniques.FadeInDown).playOn(binding.cardIV)



        }



    }


}