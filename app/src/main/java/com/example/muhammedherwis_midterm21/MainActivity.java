package com.example.muhammedherwis_midterm21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int playing = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bttn1=(Button)findViewById(R.id.bttn1);
        Button bttn2=(Button)findViewById(R.id.bttn2);
        ImageView cat = (ImageView) findViewById(R.id.cat);
        MediaPlayer catsound = MediaPlayer.create(this, R.raw.catsounds);

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(playing){
                    case 0:
                        catsound.start();
                        playing = 1;
                        break;
                    case 1:
                        catsound.pause();
                        playing = 0;
                        break;
                }
            }
        });
        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,activity_2.class));
            }
        });

        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,activity_3.class));
            }
        });
    }
}