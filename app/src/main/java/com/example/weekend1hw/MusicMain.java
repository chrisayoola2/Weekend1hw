package com.example.weekend1hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicMain extends AppCompatActivity implements View.OnClickListener {

    Button btnMusicBack; // initializes button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_main);

       btnMusicBack = findViewById(R.id.btnMusicBack); // links music button on the ui

        btnMusicBack.setOnClickListener(this); //listens for this click
    }


    public void goBackHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnMusicBack:
                goBackHome();
                break;
        }
    }
}
