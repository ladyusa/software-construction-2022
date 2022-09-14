package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectExample {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Bellini's", "Cafe", "KU", 4.1);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("rest.obj");
            ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);

            os.writeObject(restaurant);

            os.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
