// Simple weather forecast
// By: MrMidnight

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {

        while(true){
            String apikey = "31b6af9366f447f4adc130337232309";


            String city = JOptionPane.showInputDialog(null, "Enter your location:", "Smart weather forecast", JOptionPane.INFORMATION_MESSAGE);
            if (city == null){
                System.exit(0);
            }
            String apiurl = "https://api.weatherapi.com/v1/current.json?key=" + apikey + "&q=" + city;

            try {
                URL url = new URL(apiurl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                int responseCode = connection.getResponseCode();
                if (responseCode == 200) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    StringBuilder response = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }

                    reader.close();

                    // Parse the JSON response
                    JsonObject jsonResponse = JsonParser.parseString(response.toString()).getAsJsonObject();

                    // Create a Gson object with pretty printing enabled
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();

                    // Convert the parsed JSON back to a formatted string
                    String formattedJson = gson.toJson(jsonResponse);

                    // Display the formatted JSON

                    System.out.println(formattedJson);
                    JOptionPane.showMessageDialog(null, formattedJson, "Showing weather data for " + city, JOptionPane.INFORMATION_MESSAGE);

                } else {
                    System.err.println("HTTP error code: " + responseCode);
                    JOptionPane.showMessageDialog(null, "City not found! Check your spelling", "Smart weather forecast", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
            } catch (IOException | JsonSyntaxException e) {
                e.printStackTrace();
            }
        }
    }
}
