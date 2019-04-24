package com.example.starwars;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Random;

public class JsonReader {
    String name;
    String gender;
    String skincolor;
    String homeworld;
    Random rand = new Random();;
    int x = rand.nextInt(88) + 1;
    String y = Integer.toString(x);

    public JsonReader() throws IOException, JSONException{
        setNameGenderHomeworldSkincolor();
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
    public static String getTest() throws IOException, JSONException{
        Random rand = new Random();;
        int x = rand.nextInt(88) + 1;
        String y = Integer.toString(x);
        JSONObject json = readJsonFromUrl("https://swapi.co/api/people/" + y + "/");
        System.out.println(json.toString());
        System.out.println(json.get("name"));
        json.get("name").toString();
        return json.get("name").toString();
    }
    public void setNameGenderHomeworldSkincolor() throws IOException, JSONException{
        JSONObject json = readJsonFromUrl("https://swapi.co/api/people/" + y + "/");
        name = json.get("name").toString();
        gender = json.get("gender").toString();
        String homeworldurl = json.get("homeworld").toString();
        skincolor = json.get("skin_color").toString();
        JSONObject home = readJsonFromUrl(homeworldurl);
        homeworld = home.get("name").toString();
    }
    public String getGender() {
        return gender;
    }
}
