package com.example.wellness_assistance;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class sholder extends AppCompatActivity {

    VideoView videoView1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholder);


        videoView1=findViewById(R.id.videoview1);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sholder);
        videoView1.setVideoURI(videoUri);
        videoView1.start();

        videoView1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
    }

    @Override
    protected void onResume() {
        videoView1.resume();
        super.onResume();
    }

    @Override
    protected void onRestart() {
        videoView1.start();
        super.onRestart();
    }

    @Override
    protected void onPause() {
        videoView1.suspend();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        videoView1.stopPlayback();
        super.onDestroy();

    }
}