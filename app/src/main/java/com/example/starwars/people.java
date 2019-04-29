package com.example.starwars;

import android.content.Intent;
import android.provider.Contacts;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.json.JSONException;
import org.w3c.dom.Text;

import java.io.IOException;

public class people extends AppCompatActivity {
    public static int playerscore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(this, people.class);
        final Intent gameover = new Intent(this, gameoverActivity.class);
        Button option1;
        Button option2;
        Button option3;
        Button option4;
        JsonReader Character = null;
        Random rand = new Random();
        String[] categories = new String[] {"gender?", "skin color?", "homeworld?"};
        int gamemode = rand.nextInt(3);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
        TextView scoreView = findViewById(R.id.score);
        scoreView.setText("Score: " + Integer.toString(playerscore));
        TextView test = (TextView) findViewById(R.id.test);
        try {
            JsonReader y = new JsonReader();
            test.setText("What is " + y.name + "'s " + categories[gamemode]);
            Character = y;
        } catch (IOException e) {
            System.out.println(e);
        } catch (JSONException e) {
            System.out.println(e);
        }
        if (gamemode == 0) {
            option1 = findViewById(R.id.option1);
            option2 = findViewById(R.id.option2);
            findViewById(R.id.option3).setVisibility(View.INVISIBLE);
            findViewById(R.id.option4).setVisibility(View.INVISIBLE);
            option1.setText("Male");
            option2.setText("Female");
            if (Character.gender.equals("male")) {
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "Correct", Toast.LENGTH_LONG).show();
                        playerscore++;
                        startActivity(intent);
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
            };
            if (Character.gender.equals("female")) {
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "Correct", Toast.LENGTH_LONG).show();
                        playerscore++;
                        startActivity(intent);
                    }
                });
            };
            if (Character.gender.equals("n/a")) {
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "Correct", Toast.LENGTH_LONG).show();
                        playerscore++;
                        startActivity(intent);
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "Correct", Toast.LENGTH_LONG).show();
                        playerscore++;
                        startActivity(intent);
                    }
                });
            };
            if (Character.gender.equals("none")) {
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "Correct", Toast.LENGTH_LONG).show();
                        playerscore++;
                        startActivity(intent);
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "Correct", Toast.LENGTH_LONG).show();
                        playerscore++;
                        startActivity(intent);
                    }
                });
            };
        }
        if (gamemode == 1) {
            ArrayList<String> possiblechoices = new ArrayList<String>(Arrays.asList("fair", "gold", "white, blue", "white", "light", "white, red", "unknown", "green", "green-tan, brown", "green", "pale", "metal", "dark", "brown mottle", "brown", "grey", "mottled green", "orange", "blue, grey", "grey, red", "red", "blue", "grey, blue", "grey, green, yellow", "yellow", "tan", "fair, green, yellow", "silver, red", "green, grey", "red, blue, white", "brown, white", "none"));
            Random randomchoice = new Random();
            option1 = findViewById(R.id.option1);
            option2 = findViewById(R.id.option2);
            option3 = findViewById(R.id.option3);
            option4 = findViewById(R.id.option4);
            int correctchoice = randomchoice.nextInt(4);
            if (correctchoice == 0) {
                option1.setText(Character.skincolor);
                possiblechoices.remove(Character.skincolor);
                int random = randomchoice.nextInt(31);
                option2.setText(possiblechoices.get(random));
                possiblechoices.remove(random);
                int random2 = randomchoice.nextInt(30);
                option3.setText(possiblechoices.get(random2));
                possiblechoices.remove(random2);
                option4.setText(possiblechoices.get(randomchoice.nextInt(29)));
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "Correct", Toast.LENGTH_LONG).show();
                        playerscore++;
                        startActivity(intent);
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });

            }
            if (correctchoice == 1) {
                option2.setText(Character.skincolor);
                possiblechoices.remove(Character.skincolor);
                int random = randomchoice.nextInt(31);
                option1.setText(possiblechoices.get(random));
                possiblechoices.remove(random);
                int random2 = randomchoice.nextInt(30);
                option3.setText(possiblechoices.get(random2));
                possiblechoices.remove(random2);
                option4.setText(possiblechoices.get(randomchoice.nextInt(29)));
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "Correct", Toast.LENGTH_LONG).show();
                        playerscore++;
                        startActivity(intent);
                    }
                });
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
            }
            if (correctchoice == 2) {
                option3.setText(Character.skincolor);
                possiblechoices.remove(Character.skincolor);
                int random = randomchoice.nextInt(31);
                option2.setText(possiblechoices.get(random));
                possiblechoices.remove(random);
                int random2 = randomchoice.nextInt(30);
                option1.setText(possiblechoices.get(random2));
                possiblechoices.remove(random2);
                option4.setText(possiblechoices.get(randomchoice.nextInt(29)));
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "Correct", Toast.LENGTH_LONG).show();
                        playerscore++;
                        startActivity(intent);
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
            }
            if (correctchoice == 3) {
                option4.setText(Character.skincolor);
                possiblechoices.remove(Character.skincolor);
                int random = randomchoice.nextInt(31);
                option2.setText(possiblechoices.get(random));
                possiblechoices.remove(random);
                int random2 = randomchoice.nextInt(30);
                option3.setText(possiblechoices.get(random2));
                possiblechoices.remove(random2);
                option1.setText(possiblechoices.get(randomchoice.nextInt(29)));
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "Correct", Toast.LENGTH_LONG).show();
                        playerscore++;
                        startActivity(intent);
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
            }
        }
        if (gamemode == 2) {
            ArrayList<String> possiblechoices = new ArrayList<String>(Arrays.asList("Tatooine", "Naboo", "Alderaan", "Stewjon", "Eriadu", "Kashyyyk", "Corellia", "Rodia", "Nal Hutta", "Bestine IV", "unknown", "Kamino", "Trandosha", "Socorro", "Bespin", "Mon Cala", "Chandrila", "Endor", "Sullust", "Cato Neimoidia", "Coruscant", "Toydaria", "Malastare", "Dathomir", "Ryloth", "Aleen Minor", "Vulpter", "Troiken", "Tund", "Haruun Kal", "Cerea", "Glee Anselm", "Iridonia", "Iktotch", "Quermia", "Dorin", "Champala", "Geonosis", "Mirial", "Serenno", "Concord Dawn", "Zolan", "Ojom", "Skako", "Muunilinst", "Shili", "Kalee", "Umbara", "Utapau"));
            Random randomchoice = new Random();
            option1 = findViewById(R.id.option1);
            option2 = findViewById(R.id.option2);
            option3 = findViewById(R.id.option3);
            option4 = findViewById(R.id.option4);
            int correctchoice = randomchoice.nextInt(4);
            if (correctchoice == 0) {
                option1.setText(Character.homeworld);
                possiblechoices.remove(Character.homeworld);
                option2.setText(possiblechoices.get(randomchoice.nextInt(48)));
                option3.setText(possiblechoices.get(randomchoice.nextInt(48)));
                option4.setText(possiblechoices.get(randomchoice.nextInt(48)));
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "Correct", Toast.LENGTH_LONG).show();
                        playerscore++;
                        startActivity(intent);
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });

            }
            if (correctchoice == 1) {
                option2.setText(Character.homeworld);
                possiblechoices.remove(Character.homeworld);
                option1.setText(possiblechoices.get(randomchoice.nextInt(48)));
                option3.setText(possiblechoices.get(randomchoice.nextInt(48)));
                option4.setText(possiblechoices.get(randomchoice.nextInt(48)));
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "Correct", Toast.LENGTH_LONG).show();
                        playerscore++;
                        startActivity(intent);
                    }
                });
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
            }
            if (correctchoice == 2) {
                option3.setText(Character.homeworld);
                possiblechoices.remove(Character.homeworld);
                option2.setText(possiblechoices.get(randomchoice.nextInt(48)));
                option1.setText(possiblechoices.get(randomchoice.nextInt(48)));
                option4.setText(possiblechoices.get(randomchoice.nextInt(48)));
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "Correct", Toast.LENGTH_LONG).show();
                        playerscore++;
                        startActivity(intent);
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
            }
            if (correctchoice == 3) {
                option4.setText(Character.homeworld);
                possiblechoices.remove(Character.homeworld);
                option2.setText(possiblechoices.get(randomchoice.nextInt(48)));
                option3.setText(possiblechoices.get(randomchoice.nextInt(48)));
                option1.setText(possiblechoices.get(randomchoice.nextInt(48)));
                option4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "Correct", Toast.LENGTH_LONG).show();
                        playerscore++;
                        startActivity(intent);
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
                option1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        startActivity(gameover);
                    }
                });
            }
        }
    }
}

