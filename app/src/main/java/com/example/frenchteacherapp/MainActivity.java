package com.example.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button blackBtn, yellowBtn, redBtn, purpleBtn, greenBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("For trying commit!");
        blackBtn = findViewById(R.id.blackButton);
        yellowBtn = findViewById(R.id.yellowButton);
        redBtn = findViewById(R.id.redButton);
        purpleBtn = findViewById(R.id.purpleButton);
        greenBtn = findViewById(R.id.greenButton);

        blackBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        redBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        int clickedBtnId = v.getId();

        if (clickedBtnId == R.id.blackButton){
            PlaySounds(R.raw.black);
        }else if (clickedBtnId == R.id.yellowButton) {
            PlaySounds(R.raw.yellow);
        }else if (clickedBtnId == R.id.redButton) {
            PlaySounds(R.raw.red);
        }else if (clickedBtnId == R.id.purpleButton) {
            PlaySounds(R.raw.purple);
        }else if (clickedBtnId == R.id.greenButton) {
            PlaySounds(R.raw.green);
        }

    }

    public void PlaySounds(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();
    }
}