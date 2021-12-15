package com.example.rtoexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val vid_id="yXCt2MpB-rQ"
    val api_key="AIzaSyAJwIdKZBNI2rNODhsNLBcoTiewpr_56qY"

    private lateinit var youtubePlayer: YouTubePlayerView
    private lateinit var btnPlay: Button

    lateinit var youTubePlayerInit: YouTubePlayer.OnInitializedListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        button.setOnClickListener {
            if(input.text.toString().isEmpty())
            {
                Toast.makeText(this,"Enter Your Name", Toast.LENGTH_SHORT).show()
            }
            else{
                var intent = Intent(this,QuestionActivity::class.java)
                intent.putExtra("${setData.name}",input.text.toString())
                startActivity(intent)
                finish()
            }
        }

        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener{
            startActivity(Intent(this,VideoActivity::class.java))
            finish()
        }

    }
}