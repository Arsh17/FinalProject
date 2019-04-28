package com.example.starwars;

import android.widget.Space;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Random;

public class Spaceship {
    String name;
    String Class;
    Random rand = new Random();
    int x = rand.nextInt(65) + 2;
    String y = Integer.toString(x);

    public Spaceship() throws IOException, JSONException {
        setClass();
    }
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    public void setClass() throws IOException, JSONException{
        if (x == 4 || x == 6 || x == 7 || x == 8 || x == 14 || x == 16 || x == 18 || x == 19 || x == 20 || x == 24 || x == 25 || x == 26 || x == 30 || x == 33 || x == 34 || x == 35 || x == 36 || x == 37 || x == 38 || x == 42 || x == 44 || x == 45 || x == 46 || x == 50 || x == 51 || x == 53 || x == 54 || x == 55 || x == 56 || x == 57 || x == 60 || x == 62) {
            x = 5;
            y = Integer.toString(x);
        }
        System.out.print("https://swapi.co/api/starships/" + y + "/");
        JSONObject json = readJsonFromUrl("https://swapi.co/api/starships/" + y + "/");
        if (json == null) {
            Spaceship x = new Spaceship();
            x.setClass();
        }
        name = json.get("name").toString();
        Class = json.get("starship_class").toString();
    }
    public String getclass() {
        if (Class == null) {
            Class = "THE API HAS FAILED US";
            name = "THE API HAS FAILED US";
        }
        return Class;
    }
}
