package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.model.Player
import com.example.swoosh.utillties.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
        println(player)
    }

    fun onbegginerClicked (view: View) {
        ballerskillbtn.isChecked = false

        player.skill = "beginner"
    }

    fun onballerClicked (view: View) {
        beginnerskillbtn.isChecked = false
        player.skill = "baller"
    }

    fun onNextskillClicked (view: View) {
        if (player.skill != "") {
            val finalActivity = Intent (this, FinalActivity::class.java)
            finalActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finalActivity)
        }

        else {
            Toast.makeText(this, "please select a skill", Toast.LENGTH_SHORT).show()
        }

    }

}
