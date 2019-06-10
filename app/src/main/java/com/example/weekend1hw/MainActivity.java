package com.example.weekend1hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnCamera;
    private Button btnCalculator;
    private Button btnAddContact;
    private Button btnMyContacts;
    private Button btnMusic;
    private Button btnWeb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCamera = findViewById(R.id.btnCamera);
        btnCalculator = findViewById(R.id.btnCalculator);
        btnAddContact = findViewById(R.id.btnAddContact);
        btnMyContacts = findViewById(R.id.btnMyContacts);
        btnMusic = findViewById(R.id.btnMusic);
        btnWeb = findViewById(R.id.btnWeb);

        btnCamera.setOnClickListener(this);
        btnCalculator.setOnClickListener(this);
        btnAddContact.setOnClickListener(this);
        btnMyContacts.setOnClickListener(this);
        btnMusic.setOnClickListener(this);
        btnWeb.setOnClickListener(this);


    }

    public void openCamera() {
        Intent intent = new Intent(this, CameraMain.class);
        startActivity(intent);
    }
    public void openCalculator(){
        Intent intent = new Intent(this, CalculatorMain.class);
        startActivity(intent);
    }
    public void  openMyContacts(){
        Intent intent = new Intent(this, myContacts.class);
        startActivity(intent);
    }

    public void  openMusic(){
        Intent intent = new Intent(this, MusicMain.class);
        startActivity(intent);
    }

    public void  openWeb(){
        Intent intent = new Intent(this, WebMain.class);
        startActivity(intent);
    }

    public void  openAddContact(){
        Intent intent = new Intent(this, AddContactMain.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnCamera:
                openCamera();
                break;


            case R.id.btnCalculator:
                openCalculator();
                break;

            case R.id.btnAddContact:
                openAddContact();
               break;

            case R.id.btnMyContacts:
                openMyContacts();
                break;

            case R.id.btnMusic:
                openMusic();
                break;

            case R.id.btnWeb:
                openWeb();
                break;




        }

    }
}
