package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {



    var selectedleague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


    }

    fun onMensClicked (view: View) {
        womenleaguebtn.isChecked = false
        coedleaguebtn.isChecked = false

        selectedleague = "MENS"

    }

    fun onWomensClicked (view: View){
        menleaguebtn.isChecked = false
        coedleaguebtn.isChecked = false

        selectedleague = "WOMENS"

    }

    fun onCoedClicked (view: View){
        menleaguebtn.isChecked = false
        womenleaguebtn.isChecked = false

        selectedleague = "CO-ED"
    }


    fun leagueNextClicked (view: View) {
        if (selectedleague != "") {
            val SkillActivity = Intent (this, SkillActivity::class.java)
            SkillActivity.putExtra(EXTRA_LEAGUE, selectedleague)
            startActivity(SkillActivity)
        }

        else {
            Toast.makeText(this, "please select a league", Toast.LENGTH_SHORT).show()
        }

    }


}
