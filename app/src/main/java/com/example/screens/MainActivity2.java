package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String Namn;

    int Nummer;

    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Namn = extras.getString("name");
            Nummer = extras.getInt("number");
            textview =findViewById(R.id.textView2);
            textview.setText(Namn+Nummer);

            // Do something with the name and number
        }
    }
}