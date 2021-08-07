package com.aliarslan.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView citiesList;
    private Spinner studentSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        citiesList = findViewById(R.id.listItem);
        studentSpinner = findViewById(R.id.studentSpinner);

        final ArrayList<String> studentArrayList = new ArrayList<>();
        studentArrayList.add("Ali");
        studentArrayList.add("Durgesh");
        studentArrayList.add("Shlok");
        studentArrayList.add("Tilesh");
        studentArrayList.add("Harsh");

        ArrayAdapter<String> studentArrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_dropdown_item,studentArrayList
        );

        studentSpinner.setAdapter(studentArrayAdapter);


        studentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, studentArrayList.get(position) + " Selected", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "Nothing Selected", Toast.LENGTH_SHORT).show();

            }
        });

        final ArrayList<String> cities = new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Dhule");
        cities.add("Malegaon");
        cities.add("Nashik");
        cities.add("Aurangabad");
        cities.add("Aurangabad");

        ArrayAdapter<String> citiesArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cities);

        citiesList.setAdapter(citiesArrayAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, cities.get(position) + " Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }


}