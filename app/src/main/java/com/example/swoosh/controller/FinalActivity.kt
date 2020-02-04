package com.example.swoosh.controller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import com.example.swoosh.model.Player
import com.example.swoosh.utillties.EXTRA_PLAYER

import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)


        searchleaguetext.text = "Looking for the ${player.league} ${player.skill} league near you..."
    }
}
