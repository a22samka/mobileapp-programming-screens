package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Knapp;

    private Intent Bengt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Knapp = findViewById(R.id.button1);



        Knapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
                Bengt = new Intent(MainActivity.this, MainActivity2.class);
                Bengt.putExtra("name", "Arne"); // Optional
                Bengt.putExtra("number", 55); // Optional
                startActivity(Bengt);

            }
        });
        }
    }
