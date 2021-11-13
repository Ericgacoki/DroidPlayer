package com.ericg.droidplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.ericg.droidplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    lateinit var songsAdapter: SongsRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        songsAdapter = SongsRecyclerViewAdapter(getSongs())
        binding!!.profileImage.setImageResource(R.drawable.lil_peep_image)
        binding!!.songsRecyclerView.apply {
            adapter = songsAdapter
        }
    }

    private fun getSongs(): ArrayList<Song>{
        return arrayListOf(
            /*Song(R.drawable.juice_wrld_image, "Not Enough", "Juice WRLD"),
            Song(R.drawable.juice_wrld_image, "Not Enough", "Juice WRLD"),*/
            Song(R.drawable.juice_wrld_image, "Help Me", "Juice WRLD"),
            Song(R.drawable.lil_peep_image, "Beamer Boy", "Lil Peep"),
            Song(R.drawable.kamaru_image, "No kugeria", "Kamaru"),
            Song(R.drawable.lil_peep_image, "Save That Shit", "Lil Pep"),
            Song(R.drawable.x_image, "Hope", "XXXTentacion"),
        )
    }
}