package com.example.weekend1hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculatorMain extends AppCompatActivity implements View.OnClickListener {

    Button btnCalculatorBack; //initialized back button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main);

       btnCalculatorBack =  findViewById(R.id.btnCalculatorBack); // Links UI back button to button

        btnCalculatorBack.setOnClickListener(this); //creates a listener for calculator back button

    }

    public void goBackHome(){ // methods call the home activity
       finish();
    }


    @Override
    public void onClick(View v) {   // on Click method for Calculator main

        switch (v.getId()){
            case R.id.btnCalculatorBack: //if calulator back is called do this
                goBackHome();
               // break;

        }

    }
}
