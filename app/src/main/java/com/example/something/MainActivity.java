package com.example.something;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button firstbutton;
    private Button secondbutton;
    private Button thirtbutton;
    private Button exitbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstbutton = findViewById(R.id.appCompatButton);
        secondbutton = findViewById(R.id.appCompatButton2);
        thirtbutton = findViewById(R.id.appCompatButton3);
        exitbutton = findViewById(R.id.button1);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.one);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.two);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.three);

        exitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        firstbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        secondbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
            }
        });
        thirtbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer3.start();
            }
        });
    }
}