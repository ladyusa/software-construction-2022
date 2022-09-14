package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectExample {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("rest.obj");
            ObjectInputStream os = new ObjectInputStream(fileInputStream);

            Restaurant restaurant = (Restaurant) os.readObject();

            System.out.println("Name = " + restaurant.getName());
            System.out.println("Address = " + restaurant.getAddress());

            System.out.println("num seats = " + restaurant.getNumSeats());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
