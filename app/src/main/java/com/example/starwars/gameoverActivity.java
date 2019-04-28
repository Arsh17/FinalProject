package com.example.starwars;

import android.content.Intent;
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
        Button ok;
        final Intent intent = new Intent(this, MainActivity.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover);
        ok = findViewById(R.id.okbutton);
        TextView finalscore = findViewById(R.id.finalscore);
        finalscore.setText("Your final score is: " + people.playerscore);
        if (people.playerscore > MainActivity.highscorepeople) {
            MainActivity.highscorepeople = people.playerscore;
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
