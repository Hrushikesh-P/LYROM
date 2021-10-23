package com.hrushikesh.lyrom;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Nature_sounds extends AppCompatActivity {


    MediaPlayer rain,thunder,flames,storm,wind,waves,rocks,leaves,rooftop_rain;
    ImageView ra,th,fl,st,wi,wa,ro,le,roof,pause;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature_sounds);
        rain = MediaPlayer.create(this, R.raw.rain);
        thunder = MediaPlayer.create(this, R.raw.thunder);
        flames = MediaPlayer.create(this, R.raw.flames);
        storm = MediaPlayer.create(this, R.raw.storm);
        wind = MediaPlayer.create(this, R.raw.wind);
        waves = MediaPlayer.create(this, R.raw.waves);
        rocks = MediaPlayer.create(this, R.raw.rocks);
        leaves = MediaPlayer.create(this, R.raw.leaves);
        rooftop_rain = MediaPlayer.create(this, R.raw.thunder);


        ra = findViewById(R.id.img2);
        th = findViewById(R.id.img7);
        fl = findViewById(R.id.img1);
        st = findViewById(R.id.img5);
        wi = findViewById(R.id.img8);
        wa = findViewById(R.id.img9);
        ro = findViewById(R.id.img6);
        le = findViewById(R.id.img3);
        roof = findViewById(R.id.img4);
        pause = findViewById(R.id.imageView8);


        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                rain.pause();
                thunder.pause();
                flames.pause();
                storm.pause();
                wind.pause();
                waves.pause();
                rooftop_rain.pause();
                leaves.pause();
                rocks.pause();
            }
        });
    }


    public void Rain(View view) {
        if (rain.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar2);
            progressBar.setVisibility(View.INVISIBLE);
            rain.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar2);
            progressBar.setVisibility(View.VISIBLE);
            rain.start();
        }
    }

    public void Thunder(View view) {
        if (thunder.isPlaying()) {

            thunder.pause();
            final ProgressBar progressBar2 = (ProgressBar) findViewById(R.id.progressBar7);
            progressBar2.setVisibility(View.INVISIBLE);
        } else {
            thunder.start();
            final ProgressBar progressBar2 = (ProgressBar) findViewById(R.id.progressBar7);
            progressBar2.setVisibility(View.VISIBLE);
        }
    }

    public void Rocks(View view) {
        if (rocks.isPlaying()) {
            rocks.pause();
            final ProgressBar progressBar3 = (ProgressBar) findViewById(R.id.progressBar6);
            progressBar3.setVisibility(View.INVISIBLE);
        } else {
            rocks.start();
            final ProgressBar progressBar3 = (ProgressBar) findViewById(R.id.progressBar6);
            progressBar3.setVisibility(View.VISIBLE);
        }
    }

    public void Leaves(View view) {
        if (leaves.isPlaying()) {
            leaves.pause();
            final ProgressBar progressBar5 = (ProgressBar) findViewById(R.id.progressBar3);
            progressBar5.setVisibility(View.INVISIBLE);
        } else {
            leaves.start();
            final ProgressBar progressBar5 = (ProgressBar) findViewById(R.id.progressBar3);
            progressBar5.setVisibility(View.VISIBLE);
        }

    }

    public void Storm(View view) {
        if (storm.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar5);
            progressBar.setVisibility(View.INVISIBLE);
            storm.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar5);
            progressBar.setVisibility(View.VISIBLE);
            storm.start();
        }
    }

    public void WIND(View view) {
        if (wind.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar8);
            progressBar.setVisibility(View.INVISIBLE);
            wind.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar8);
            progressBar.setVisibility(View.VISIBLE);
            wind.start();
        }
    }

    public void FLAMES(View view) {
        if (flames.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar1);
            progressBar.setVisibility(View.INVISIBLE);
            flames.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar1);
            progressBar.setVisibility(View.VISIBLE);
            flames.start();
        }
    }

    public void Roof(View view) {
        if (rooftop_rain.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar4);
            progressBar.setVisibility(View.INVISIBLE);
            rooftop_rain.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar4);
            progressBar.setVisibility(View.VISIBLE);
            rooftop_rain.start();
        }
    }

    public void Waves(View view) {
        if (waves.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar9);
            progressBar.setVisibility(View.INVISIBLE);
            waves.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar9);
            progressBar.setVisibility(View.VISIBLE);
            waves.start();
        }
    }
}