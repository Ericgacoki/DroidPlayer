package com.ericg.droidplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ericg.droidplayer.databinding.ActivityCurrentSongBinding

class CurrentSongActivity : AppCompatActivity() {
    var binding: ActivityCurrentSongBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCurrentSongBinding.inflate(layoutInflater)

        setContentView(binding!!.root)
    }
}