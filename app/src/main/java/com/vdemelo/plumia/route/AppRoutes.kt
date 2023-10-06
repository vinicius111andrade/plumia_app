package com.vdemelo.plumia.route

import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.vdemelo.plumia.ui.game.playing.GamePlayingActivity

fun AppCompatActivity.navigateToGameStart() {
    //TODO
}

fun AppCompatActivity.navigateToGamePlaying() {
    startActivity(
        Intent(this, GamePlayingActivity::class.java)
    )
}

fun AppCompatActivity.navigateToHome() {
    //TODO
}

fun AppCompatActivity.navigateToContacts() {
    //TODO
    Toast(this).apply { setText("Navigate to psi contacts") }.show()
}


fun AppCompatActivity.navigateToIndications() {
    //TODO
}
