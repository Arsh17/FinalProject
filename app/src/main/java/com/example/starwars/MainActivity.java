package com.example.starwars;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.json.JSONException;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private Button people;
    private Button planets;
    private Button spaceships;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        people = findViewById(R.id.people);
        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpeople();
                Individual x = new Individual();
                x.setName();
                try {
                    JsonReader.getTest();
                } catch (IOException e) {
                    System.out.println(e);
                } catch (JSONException e) {
                    System.out.println(e);
                }
            }
        });
        spaceships = findViewById(R.id.spaceships);
        spaceships.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openspaceships();
            }
        });
        planets = findViewById(R.id.planets);
        planets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openplanets();
            }
        });
    }
    public void openpeople() {
        Intent intent = new Intent(this, people.class);
        startActivity(intent);
    }
    public void openspaceships() {
        Intent intent = new Intent(this, spaceships.class);
        startActivity(intent);
    }
    public void openplanets() {
        Intent intent = new Intent(this, spaceships.class);
        startActivity(intent);
    }

}
