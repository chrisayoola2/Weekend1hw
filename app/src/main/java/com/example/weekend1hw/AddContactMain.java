package com.example.weekend1hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class AddContactMain extends AppCompatActivity implements View.OnClickListener {

    Button btnAddContactBack;
    EditText etFirstName;
    EditText etLastName;
    EditText etAddress;
    EditText etCity;
    EditText etState;
    EditText etZip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        etAddress = findViewById(R.id.etAddress);
        etCity = findViewById(R.id.etCity);
        etState = findViewById(R.id.etState);
        etZip = findViewById(R.id.etZip);

        btnAddContactBack = findViewById(R.id.btnAddContactBack); //links UI contact back button


        btnAddContactBack.setOnClickListener(this); // listens for button to be clicked
    }

   public void goBackHome(){
        invalidateOptionsMenu();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.btnAddContactBack:
                goBackHome();

            case R.id.btnSubmit:

                ArrayList<String> info = new ArrayList<>();

                String first = etFirstName.getText().toString(); //gets string from the user and enters into the variables
                String last = etLastName.getText().toString();
                String address = etAddress.getText().toString();
                String city = etCity.getText().toString();
                String state = etState.getText().toString();
                String zip = etZip.getText().toString();

                new Person(first, last, address, city, state, zip);
                info.add(first);
                info.add(last);
                info.add(address);
                info.add(address);
                info.add(city);
                info.add(state);
                info.add(zip);
                Intent intent =  new Intent(getBaseContext(), myContacts.class);
                intent.putStringArrayListExtra("Information",info);
                startActivity(intent);
                break;
        }
    }
}
