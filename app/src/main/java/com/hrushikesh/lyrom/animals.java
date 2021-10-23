package com.hrushikesh.lyrom;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class animals extends AppCompatActivity {

    MediaPlayer lion, tiger, deer, cat, cow, dog, elephant, horse, monkey;
    ImageView li, ti, de, ca, co, el, ho, mo, pause, dog_image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        lion = MediaPlayer.create(this, R.raw.lion);
        tiger = MediaPlayer.create(this, R.raw.tiger);
        deer = MediaPlayer.create(this, R.raw.deer);
        cat = MediaPlayer.create(this, R.raw.cat);
        cow = MediaPlayer.create(this, R.raw.cow);
        dog = MediaPlayer.create(this, R.raw.dog);
        elephant = MediaPlayer.create(this, R.raw.elephant);
        horse = MediaPlayer.create(this, R.raw.horse);
        monkey = MediaPlayer.create(this, R.raw.monkey);


        li = findViewById(R.id.img1);
        ti = findViewById(R.id.img2);
        de = findViewById(R.id.img4);
        ca = findViewById(R.id.img3);
        co = findViewById(R.id.img8);
        dog_image = findViewById(R.id.img5);
        el = findViewById(R.id.img9);
        ho = findViewById(R.id.img7);
        mo = findViewById(R.id.img6);
        pause = findViewById(R.id.imageView8);


        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                lion.pause();
                tiger.pause();
                deer.pause();
                cat.pause();
                cow.pause();
                dog.pause();
                elephant.pause();
                horse.pause();
                monkey.pause();
            }
        });
    }


    public void LION(View view) {
        if (lion.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar1);
            progressBar.setVisibility(View.INVISIBLE);
            lion.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar1);
            progressBar.setVisibility(View.VISIBLE);
            lion.start();
        }
    }

    public void Tiger(View view) {
        if (tiger.isPlaying()) {

            tiger.pause();
            final ProgressBar progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
            progressBar2.setVisibility(View.INVISIBLE);
        } else {
            tiger.start();
            final ProgressBar progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
            progressBar2.setVisibility(View.VISIBLE);
        }
    }

    public void Deer(View view) {
        if (deer.isPlaying()) {
            deer.pause();
            final ProgressBar progressBar3 = (ProgressBar) findViewById(R.id.progressBar4);
            progressBar3.setVisibility(View.INVISIBLE);
        } else {
            deer.start();
            final ProgressBar progressBar3 = (ProgressBar) findViewById(R.id.progressBar4);
            progressBar3.setVisibility(View.VISIBLE);
        }
    }

    public void Cat(View view) {
        if (cat.isPlaying()) {
            cat.pause();
            final ProgressBar progressBar5 = (ProgressBar) findViewById(R.id.progressBar3);
            progressBar5.setVisibility(View.INVISIBLE);
        } else {
            cat.start();
            final ProgressBar progressBar5 = (ProgressBar) findViewById(R.id.progressBar3);
            progressBar5.setVisibility(View.VISIBLE);
        }

    }

    public void Dog(View view) {
        if (dog.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar5);
            progressBar.setVisibility(View.INVISIBLE);
            dog.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar5);
            progressBar.setVisibility(View.VISIBLE);
            dog.start();
        }
    }

    public void Elephant(View view) {
        if (elephant.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar9);
            progressBar.setVisibility(View.INVISIBLE);
            elephant.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar9);
            progressBar.setVisibility(View.VISIBLE);
            elephant.start();
        }
    }

    public void Cow(View view) {
        if (cow.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar8);
            progressBar.setVisibility(View.INVISIBLE);
            cow.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar8);
            progressBar.setVisibility(View.VISIBLE);
            cow.start();
        }
    }

    public void Horse(View view) {
        if (horse.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar7);
            progressBar.setVisibility(View.INVISIBLE);
            horse.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar7);
            progressBar.setVisibility(View.VISIBLE);
            horse.start();
        }
    }

    public void Monkey(View view) {
        if (monkey.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar6);
            progressBar.setVisibility(View.INVISIBLE);
            monkey.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar6);
            progressBar.setVisibility(View.VISIBLE);
            monkey.start();
        }
    }
}
