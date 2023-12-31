package com.vdemelo.plumia.ui.game.playing

import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import com.vdemelo.plumia.databinding.ActivityGamePlayingBinding
import com.vdemelo.plumia.route.navigateToIndications
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
        binding.endGameButton.setOnClickListener { navigateToIndications() }
    }

    private fun AppCompatTextView.setCounterStyle() {
        this.setTypeface(null, Typeface.NORMAL)
        //TODO set size
        setUnHighlighted()
    }

    private fun AppCompatTextView.setUnHighlighted() {
        this.setTypeface(null, Typeface.NORMAL)
        //TODO set color
    }

    private fun AppCompatTextView.setHighlighted() {
        this.setTypeface(null, Typeface.BOLD)
        //TODO set color
    }

}
