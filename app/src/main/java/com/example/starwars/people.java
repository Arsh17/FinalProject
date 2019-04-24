package com.example.starwars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import org.json.JSONException;
import org.w3c.dom.Text;

import java.io.IOException;

public class people extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button option1;
        Random rand = new Random();
        String[] categories = new String[] {"gender?", "skin color?", "homeworld?"};
        int number = rand.nextInt(3);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
        TextView test = (TextView) findViewById(R.id.test);
        try {
            JsonReader y = new JsonReader();
            test.setText("What is " + y.name + "'s " + categories[number]);
        } catch (IOException e) {
            System.out.println(e);
        } catch (JSONException e) {
            System.out.println(e);
        }
        if (number == 0) {
            option1;
        }
    }
}
