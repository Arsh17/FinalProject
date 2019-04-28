package com.example.starwars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class spaceships extends AppCompatActivity {
    public static int spaceshipsscore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(this, spaceships.class);
        final Intent gameover = new Intent(this, gameoverActivity.class);
        Button option1;
        Button option2;
        Button option3;
        Button option4;
        Spaceship Character = null;
        int gamemode = 1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spaceships);
        TextView scoreView = findViewById(R.id.score);
        scoreView.setText("Score: " + Integer.toString(spaceshipsscore));
        TextView test = (TextView) findViewById(R.id.test);
        try {
            Spaceship y = new Spaceship();
            test.setText("What is " + y.name + "'s class?");
            Character = y;
        } catch (IOException e) {
            System.out.println(e);
        } catch (JSONException e) {
            System.out.println(e);
        }
        if (gamemode == 1) {
            ArrayList<String> possiblechoices = new ArrayList<String>(Arrays.asList("corvette", "Star Destroyer", "landing craft", "Deep Space Mobile Battlestation", "Light freighter", "assault starfighter", "Starfighter", "Star dreadnought", "Medium transport", "Patrol craft", "Armed government transport", "Escort ship", "Star Cruiser", "Assault Starfighter", "Space cruiser", "Droid control ship", "yacht", "Space Transport", "Diplomatic barge", "freighter", "assault ship", "capital ship", "transport", "star destroyer", "starfighter"));
            Random randomchoice = new Random();
            option1 = findViewById(R.id.option1);
            option2 = findViewById(R.id.option2);
            option3 = findViewById(R.id.option3);
            option4 = findViewById(R.id.option4);
            int correctchoice = randomchoice.nextInt(4);
            if (correctchoice == 0) {
                option1.setText(Character.getclass());
                possiblechoices.remove(Character.getclass());
                option2.setText(possiblechoices.get(randomchoice.nextInt(24)));
                option3.setText(possiblechoices.get(randomchoice.nextInt(24)));
                option4.setText(possiblechoices.get(randomchoice.nextInt(24)));
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "Correct", Toast.LENGTH_LONG).show();
                        spaceshipsscore++;
                        startActivity(intent);
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });

            }
            if (correctchoice == 1) {
                option2.setText(Character.getclass());
                possiblechoices.remove(Character.getclass());
                option1.setText(possiblechoices.get(randomchoice.nextInt(24)));
                option3.setText(possiblechoices.get(randomchoice.nextInt(24)));
                option4.setText(possiblechoices.get(randomchoice.nextInt(24)));
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "Correct", Toast.LENGTH_LONG).show();
                        spaceshipsscore++;
                        startActivity(intent);
                    }
                });
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
            }
            if (correctchoice == 2) {
                option3.setText(Character.getclass());
                possiblechoices.remove(Character.getclass());
                option2.setText(possiblechoices.get(randomchoice.nextInt(24)));
                option1.setText(possiblechoices.get(randomchoice.nextInt(24)));
                option4.setText(possiblechoices.get(randomchoice.nextInt(24)));
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "Correct", Toast.LENGTH_LONG).show();
                        spaceshipsscore++;
                        startActivity(intent);
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
            }
            if (correctchoice == 3) {
                option4.setText(Character.getclass());
                possiblechoices.remove(Character.getclass());
                option2.setText(possiblechoices.get(randomchoice.nextInt(24)));
                option3.setText(possiblechoices.get(randomchoice.nextInt(24)));
                option1.setText(possiblechoices.get(randomchoice.nextInt(24)));
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "Correct", Toast.LENGTH_LONG).show();
                        spaceshipsscore++;
                        startActivity(intent);
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(spaceships.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
            }
        }
    }
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_spaceships);
}
