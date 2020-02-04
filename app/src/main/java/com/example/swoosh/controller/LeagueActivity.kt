package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.model.Player
import com.example.swoosh.utillties.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {



    var player = Player ("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


    }

    fun onMensClicked (view: View) {
        womenleaguebtn.isChecked = false
        coedleaguebtn.isChecked = false

        player.league = "MENS"

    }

    fun onWomensClicked (view: View){
        menleaguebtn.isChecked = false
        coedleaguebtn.isChecked = false

        player.league = "WOMENS"

    }

    fun onCoedClicked (view: View){
        menleaguebtn.isChecked = false
        womenleaguebtn.isChecked = false

        player.league = "CO-ED"
    }


    fun leagueNextClicked (view: View) {
        if (player.league != "") {
            val SkillActivity = Intent (this, SkillActivity::class.java)
            SkillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(SkillActivity)
        }

        else {
            Toast.makeText(this, "please select a league", Toast.LENGTH_SHORT).show()
        }

    }


}
