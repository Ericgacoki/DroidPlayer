package com.ericg.droidplayer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ericg.droidplayer.databinding.SongItemBinding

class SongsRecyclerViewAdapter(val songs: ArrayList<Song>) :
    RecyclerView.Adapter<SongsRecyclerViewAdapter.SongsViewHolder>() {

    inner class SongsViewHolder(private val songItem: SongItemBinding) :
        RecyclerView.ViewHolder(songItem.root) {
        fun bind(song: Song) {
            songItem.songImage.setImageResource(song.image)
            songItem.songTitle.text = song.title
            songItem.songArtist.text = song.artist
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongsViewHolder {
        val view = SongItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SongsViewHolder(view)
    }

    override fun onBindViewHolder(holder: SongsViewHolder, position: Int) {
        holder.bind(songs[position])
    }

    override fun getItemCount(): Int = songs.size
}