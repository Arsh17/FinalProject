package com.example.starwars;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;

import java.io.IOException;

public class gameoverActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final MediaPlayer rTwodTwo = MediaPlayer.create(this, R.raw.chewbaccaroar);
        Button ok;
        final Intent intent = new Intent(this, MainActivity.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover);
        rTwodTwo.start();
        ok = findViewById(R.id.okbutton);
        TextView finalscore = findViewById(R.id.finalscore);
        finalscore.setText("Your final score is: " + people.playerscore);
        if (people.playerscore > MainActivity.highscorepeople) {
            MainActivity.highscorepeople = people.playerscore;
        }
        if (spaceships.spaceshipsscore > people.playerscore) {
            finalscore.setText("Your final score is: " + spaceships.spaceshipsscore);
            if (spaceships.spaceshipsscore > MainActivity.highscorespaceships) {
                MainActivity.highscorespaceships = spaceships.spaceshipsscore;
            }
            spaceships.spaceshipsscore = 0;
        }
        if (planets.planetscore > people.playerscore) {
            finalscore.setText("Your final score is: " + planets.planetscore);
            if (planets.planetscore > MainActivity.highscoreplanets) {
                MainActivity.highscoreplanets = planets.planetscore;
            }
            planets.planetscore = 0;
        }
        people.playerscore = 0;
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}
