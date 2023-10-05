package com.vdemelo.plumia.ui.game.playing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.vdemelo.plumia.databinding.ActivityGamePlayingBinding
import com.vdemelo.plumia.route.navigateToGamePlaying
import com.vdemelo.plumia.sdk.setupToolbar

class GamePlayingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGamePlayingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupToolbar(title = "Respire...", toolbar = binding.toolbar)
        setButtonActions()
    }

    private fun setupBinding() {
        binding = ActivityGamePlayingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setButtonActions() {
        binding.startGameButton.setOnClickListener { navigateToGamePlaying() }

        binding.contactButton.setOnClickListener { view ->
            Snackbar.make(view, "Navigate to psi contacts", Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show()
        }
    }

}
