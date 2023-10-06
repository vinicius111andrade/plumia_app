package com.vdemelo.plumia.ui.game.start

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vdemelo.plumia.databinding.ActivityGameStartBinding
import com.vdemelo.plumia.route.navigateToContacts
import com.vdemelo.plumia.route.navigateToGamePlaying
import com.vdemelo.plumia.sdk.setupToolbar

class GameStartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGameStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupToolbar(title = "Começar!", toolbar = binding.toolbar)
        setButtonActions()
    }

    private fun setupBinding() {
        binding = ActivityGameStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setButtonActions() {
        binding.startGameButton.setOnClickListener { navigateToGamePlaying() }
        binding.contactButton.setOnClickListener { navigateToContacts() }
    }

}
