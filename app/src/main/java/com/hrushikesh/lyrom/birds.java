package com.hrushikesh.lyrom;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class birds extends AppCompatActivity {

    MediaPlayer crow,cuckoo,hen,insect,owl,parrot,peacock,duck,sparrow;
    ImageView cr,cu,he,in,ow,pa,pe,du,sp,pause;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds);
        crow = MediaPlayer.create(this, R.raw.crow);
        cuckoo = MediaPlayer.create(this, R.raw.cuckoo);
        hen = MediaPlayer.create(this, R.raw.hen);
        insect = MediaPlayer.create(this, R.raw.insect);
        owl = MediaPlayer.create(this, R.raw.owl);
        parrot = MediaPlayer.create(this, R.raw.parrot);
        peacock = MediaPlayer.create(this, R.raw.peacock);
        duck = MediaPlayer.create(this, R.raw.duck);
        sparrow = MediaPlayer.create(this, R.raw.sparrow);


        cr = findViewById(R.id.img1);
        cu = findViewById(R.id.img4);
        he = findViewById(R.id.img5);
        in = findViewById(R.id.img2);
        ow = findViewById(R.id.img3);
        pa = findViewById(R.id.img8);
        pe = findViewById(R.id.img9);
        du = findViewById(R.id.img7);
        sp = findViewById(R.id.img6);
        pause = findViewById(R.id.imageView8);


        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                crow.pause();
                cuckoo.pause();
                hen.pause();
                insect.pause();
                owl.pause();
                parrot.pause();
                peacock.pause();
                duck.pause();
                sparrow.pause();
            }
        });
    }


    public void Crow(View view) {
        if (crow.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar1);
            progressBar.setVisibility(View.INVISIBLE);
            crow.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar1);
            progressBar.setVisibility(View.VISIBLE);
            crow.start();
        }
    }

    public void Cuckoo(View view) {
        if (cuckoo.isPlaying()) {

            cuckoo.pause();
            final ProgressBar progressBar2 = (ProgressBar) findViewById(R.id.progressBar4);
            progressBar2.setVisibility(View.INVISIBLE);
        } else {
            cuckoo.start();
            final ProgressBar progressBar2 = (ProgressBar) findViewById(R.id.progressBar4);
            progressBar2.setVisibility(View.VISIBLE);
        }
    }

    public void Hen(View view) {
        if (hen.isPlaying()) {
            hen.pause();
            final ProgressBar progressBar3 = (ProgressBar) findViewById(R.id.progressBar5);
            progressBar3.setVisibility(View.INVISIBLE);
        } else {
            hen.start();
            final ProgressBar progressBar3 = (ProgressBar) findViewById(R.id.progressBar5);
            progressBar3.setVisibility(View.VISIBLE);
        }
    }

    public void Insect(View view) {
        if (insect.isPlaying()) {
            insect.pause();
            final ProgressBar progressBar5 = (ProgressBar) findViewById(R.id.progressBar2);
            progressBar5.setVisibility(View.INVISIBLE);
        } else {
            insect.start();
            final ProgressBar progressBar5 = (ProgressBar) findViewById(R.id.progressBar2);
            progressBar5.setVisibility(View.VISIBLE);
        }

    }

    public void Owl(View view) {
        if (owl.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar3);
            progressBar.setVisibility(View.INVISIBLE);
            owl.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar3);
            progressBar.setVisibility(View.VISIBLE);
            owl.start();
        }
    }

    public void Parrot(View view) {
        if (parrot.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar8);
            progressBar.setVisibility(View.INVISIBLE);
            parrot.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar8);
            progressBar.setVisibility(View.VISIBLE);
            parrot.start();
        }
    }

    public void PEACOCK(View view) {
        if (peacock.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar9);
            progressBar.setVisibility(View.INVISIBLE);
            peacock.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar9);
            progressBar.setVisibility(View.VISIBLE);
            peacock.start();
        }
    }

    public void DUCK(View view) {
        if (duck.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar7);
            progressBar.setVisibility(View.INVISIBLE);
            duck.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar7);
            progressBar.setVisibility(View.VISIBLE);
            duck.start();
        }
    }

    public void Sparrow(View view) {
        if (sparrow.isPlaying()) {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar6);
            progressBar.setVisibility(View.INVISIBLE);
            sparrow.pause();

        } else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar6);
            progressBar.setVisibility(View.VISIBLE);
            sparrow.start();
        }
    }
}