package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteRestaurantTextExample {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Bellini's", "Cafe", "KU", 4.1);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("from-user.txt");
            PrintWriter file = new PrintWriter(fileWriter);

            file.println(restaurant);

            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
