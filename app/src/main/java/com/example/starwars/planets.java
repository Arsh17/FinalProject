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

public class planets extends AppCompatActivity {
public static int planetscore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            final Intent intent = new Intent(this, spaceships.class);
            final Intent gameover = new Intent(this, gameoverActivity.class);
            Button option1;
            Button option2;
            Button option3;
            Button option4;
            Planet Character = null;
            int gamemode = 1;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_planets);
            TextView scoreView = findViewById(R.id.score);
            scoreView.setText("Score: " + Integer.toString(planetscore));
            TextView test = (TextView) findViewById(R.id.test);
            try {
                Planet y = new Planet();
                test.setText("What is " + y.name + "'s terrain?");
                Character = y;
            } catch (IOException e) {
                System.out.println(e);
            } catch (JSONException e) {
                System.out.println(e);
            }
            if (gamemode == 1) {
                ArrayList<String> possiblechoices = new ArrayList<String>(Arrays.asList("desert", "grasslands, mountains", "jungle, rainforests", "tundra, ice caves, mountain ranges", "swamp, jungles", "gas giant", "forests, mountains, lakes", "grassy hills, swamps, forests, mountains", "cityscape, mountains", "ocean", "rock, desert, mountain, barren", "scrublands, savanna, canyons, sinkholes", "volcanoes, lava rivers, mountains, caves", "jungle, forests, lakes, rivers", "airless asteroid", "glaciers, mountains, ice canyons", "fungus forests", "mountains, fields, forests, rock arches", "caves, desert, mountains, volcanoes", "grass", "cityscape", "plains, urban, hills, forests", "jungles, oceans, urban, swamps", "urban, oceans, swamps, bogs", "oceans, savannas, mountains, grasslands"));// ended at number 25
                Random randomchoice = new Random();
                option1 = findViewById(R.id.option1);
                option2 = findViewById(R.id.option2);
                option3 = findViewById(R.id.option3);
                option4 = findViewById(R.id.option4);
                int correctchoice = randomchoice.nextInt(4);
                if (correctchoice == 0) {
                    option1.setText(Character.terrain);
                    possiblechoices.remove(Character.terrain);
                    option2.setText(possiblechoices.get(randomchoice.nextInt(24)));
                    option3.setText(possiblechoices.get(randomchoice.nextInt(24)));
                    option4.setText(possiblechoices.get(randomchoice.nextInt(24)));
                    option1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "Correct", Toast.LENGTH_LONG).show();
                            planetscore++;
                            startActivity(intent);
                        }
                    });
                    option2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "INCORRECT", Toast.LENGTH_LONG).show();
                            startActivity(gameover);
                        }
                    });
                    option3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "INCORRECT", Toast.LENGTH_LONG).show();
                            startActivity(gameover);
                        }
                    });
                    option4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "INCORRECT", Toast.LENGTH_LONG).show();
                            startActivity(gameover);
                        }
                    });

                }
                if (correctchoice == 1) {
                    option2.setText(Character.terrain);
                    possiblechoices.remove(Character.terrain);
                    option1.setText(possiblechoices.get(randomchoice.nextInt(24)));
                    option3.setText(possiblechoices.get(randomchoice.nextInt(24)));
                    option4.setText(possiblechoices.get(randomchoice.nextInt(24)));
                    option2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "Correct", Toast.LENGTH_LONG).show();
                            planetscore++;
                            startActivity(intent);
                        }
                    });
                    option1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "INCORRECT", Toast.LENGTH_LONG).show();
                            startActivity(gameover);
                        }
                    });
                    option3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "INCORRECT", Toast.LENGTH_LONG).show();
                            startActivity(gameover);
                        }
                    });
                    option4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "INCORRECT", Toast.LENGTH_LONG).show();
                            startActivity(gameover);
                        }
                    });
                }
                if (correctchoice == 2) {
                    option3.setText(Character.terrain);
                    possiblechoices.remove(Character.terrain);
                    option2.setText(possiblechoices.get(randomchoice.nextInt(24)));
                    option1.setText(possiblechoices.get(randomchoice.nextInt(24)));
                    option4.setText(possiblechoices.get(randomchoice.nextInt(24)));
                    option3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "Correct", Toast.LENGTH_LONG).show();
                            planetscore++;
                            startActivity(intent);
                        }
                    });
                    option2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "INCORRECT", Toast.LENGTH_LONG).show();
                            startActivity(gameover);
                        }
                    });
                    option1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "INCORRECT", Toast.LENGTH_LONG).show();
                            startActivity(gameover);
                        }
                    });
                    option4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "INCORRECT", Toast.LENGTH_LONG).show();
                            startActivity(gameover);
                        }
                    });
                }
                if (correctchoice == 3) {
                    option4.setText(Character.terrain);
                    possiblechoices.remove(Character.terrain);
                    option2.setText(possiblechoices.get(randomchoice.nextInt(24)));
                    option3.setText(possiblechoices.get(randomchoice.nextInt(24)));
                    option1.setText(possiblechoices.get(randomchoice.nextInt(24)));
                    option4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "Correct", Toast.LENGTH_LONG).show();
                            planetscore++;
                            startActivity(intent);
                        }
                    });
                    option2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "INCORRECT", Toast.LENGTH_LONG).show();
                            startActivity(gameover);
                        }
                    });
                    option3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "INCORRECT", Toast.LENGTH_LONG).show();
                            startActivity(gameover);
                        }
                    });
                    option1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(planets.this, "INCORRECT", Toast.LENGTH_LONG).show();
                            startActivity(gameover);
                        }
                    });
                }
            }
        }
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_planets);
    }
