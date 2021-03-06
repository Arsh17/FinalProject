package com.example.starwars;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    public static int highscorepeople = 0;
    public static int highscoreplanets = 0;
    public static int highscorespaceships = 0;
    public static int rankScore = highscorepeople + highscoreplanets + highscorespaceships;
    private Button people;
    private Button planets;
    private Button spaceships;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final MediaPlayer rTwodTwo = MediaPlayer.create(this, R.raw.rtwodtwo);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView highscore = findViewById(R.id.highscore);
        highscore.setText("High Scores:" + "\n" + "People: " + Integer.toString(highscorepeople) + "\n" + "Spaceships: " + Integer.toString(highscorespaceships) + "\n" + "Planets: " + Integer.toString(highscoreplanets));
        TextView rank = findViewById(R.id.rank);
        if (rankScore <= 5) {
            rank.setText("Jedi Rank: Youngling");
        } else if (rankScore > 5 && rankScore <= 10) {
            rank.setText("Jedi Rank: Padawan");
        } else if (rankScore > 10 && rankScore <= 15) {
            rank.setText("Jedi Rank: Knight");
        } else if (rankScore > 15 && rankScore <= 20) {
            rank.setText("Jedi Rank: Master");
        } else {
            rank.setText("Jedi Rank: Grand Master");
        }
        people = findViewById(R.id.people);
        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rTwodTwo.start();
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
                rTwodTwo.start();
                openspaceships();
            }
        });
        planets = findViewById(R.id.planets);
        planets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rTwodTwo.start();
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
        Intent intent = new Intent(this, planets.class);
        startActivity(intent);
    }

}
