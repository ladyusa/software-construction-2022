package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RestaurantDataSource {

    private String filename;

    public RestaurantDataSource(String filename) {
        this.filename = filename;
    }

    public List<Restaurant> readData() {

        List<Restaurant> restaurants = new ArrayList<>();

        try {
            FileReader file = new FileReader(filename);
            BufferedReader buffer = new BufferedReader(file);

            String line = null;

            while ( (line = buffer.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0].trim();
                String type = data[1].trim();
                String address = data[2].trim();
                double rating = Double.parseDouble(data[3].trim());

                Restaurant restaurant = new Restaurant(name, type, address, rating);
                restaurants.add(restaurant);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Cannot read file " + filename);
        } catch (IOException e) {
            System.err.println("Error reading from file");
        }

        return restaurants;
    }
}
