package com.example.rtoexam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class VideoActivity : YouTubeBaseActivity() {

    val vid_id="7EYLzGRX8r0"
    val api_key="AIzaSyDTQRRWNAuKZmnfzX5hWn--niGYU42xkwQ"

    private lateinit var youtubePlayer: YouTubePlayerView
    private lateinit var btnPlay: Button

    lateinit var youTubePlayerInit: YouTubePlayer.OnInitializedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        youtubePlayer = findViewById(R.id.ytplayer)
        btnPlay = findViewById(R.id.btnplay)

        youTubePlayerInit = object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {
                p1?.loadVideo(vid_id)
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(applicationContext, "failed", Toast.LENGTH_LONG).show()
            }

        }
        btnPlay.setOnClickListener(){
            youtubePlayer.initialize(api_key, youTubePlayerInit)
        }

        val button = findViewById<Button>(R.id.backbtn)
        button.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }

}