package com.example.starwars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import org.json.JSONException;
import org.w3c.dom.Text;

import java.io.IOException;

public class people extends AppCompatActivity {
    public static int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(this, people.class);
        final Intent gameover = new Intent(this, gameoverActivity.class);
        final TextView x = (TextView) findViewById(R.id.score);
        Button option1;
        Button option2;
        Button option3;
        Button option4;
        JsonReader Character = null;
        Random rand = new Random();
        String[] categories = new String[] {"gender?", "skin color?", "homeworld?"};
        int number = rand.nextInt(3);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
        TextView test = (TextView) findViewById(R.id.test);
        try {
            JsonReader y = new JsonReader();
            test.setText("What is " + y.name + "'s " + categories[number]);
            Character = y;
        } catch (IOException e) {
            System.out.println(e);
        } catch (JSONException e) {
            System.out.println(e);
        }
        if (number == 0) {
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
                        score++;
                        //x.setText(score);
                        startActivity(intent);
                    }
                });
                option2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(people.this, "INCORRECT", Toast.LENGTH_LONG).show();
                        //x.setText(score);
                        startActivity(gameover);
                    }
                });
            };
        }
    }
}

