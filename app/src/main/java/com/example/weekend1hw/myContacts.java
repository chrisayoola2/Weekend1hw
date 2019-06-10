package com.example.weekend1hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class myContacts extends AppCompatActivity implements View.OnClickListener {
    Button btnContactsBack;
    ListView lvMyListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_contacts);

        btnContactsBack = findViewById(R.id.btnMyContactsBack); // links UI button
        lvMyListView = findViewById(R.id.lvMyListView);

        //gets arrayList from dd
        ArrayList<String> arrayList = new ArrayList<>();
        Intent i = getIntent();
        arrayList = i.getStringArrayListExtra("Information");
        ArrayAdapter Adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        lvMyListView.setAdapter(Adapter);

        // listens for clicks
        btnContactsBack.setOnClickListener(this);
    }


    public void goBackHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnMyContactsBack:
                goBackHome();
                break;
        }

    }
}
