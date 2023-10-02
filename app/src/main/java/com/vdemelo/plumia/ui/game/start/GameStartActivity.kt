package com.vdemelo.plumia.ui.game.start

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.vdemelo.plumia.databinding.ActivityGameStartBinding
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
        binding.startGameButton.setOnClickListener { view ->
            Snackbar.make(view, "Navigate to game", Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show()
        }

        binding.contactButton.setOnClickListener { view ->
            Snackbar.make(view, "Navigate to psi contacts", Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show()
        }
    }


}
