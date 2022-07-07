package com.example.spinner_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);

        String[] planets = getResources().getStringArray(R.array.planets_array);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, R.layout.item, planets);

        spinner.setAdapter(adapter);


    }
}