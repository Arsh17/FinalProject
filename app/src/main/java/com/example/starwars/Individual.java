package com.example.starwars;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.Certificate;
import java.io.*;
import java.math.*;
import java.util.Random;

public class Individual {
    String name;
    String gender;
    String skincolor;
    String homeworld;
    Random rand = new Random();
    int test = rand.nextInt(88) + 1;
    String tester = Integer.toString(test);

    public void setName() {
        try {
            URL url = new URL("https://swapi.co/api/people/1/");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            System.out.println(con);
            System.out.println("This is content" + con.getContent());
            int status = con.getResponseCode();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            name = inputLine;
        } catch  (MalformedURLException e)  {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(name);
    }
    public String getName() {
        return name;
    }
}
