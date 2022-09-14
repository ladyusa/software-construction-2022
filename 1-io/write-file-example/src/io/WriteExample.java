package io;

import java.io.*;

public class WriteExample {

    public static void main(String[] args) {
        FileWriter fileWriter = null;

        try {
            FileReader inReader = new FileReader("restaurant.txt");
            BufferedReader buffer = new BufferedReader(inReader);

            fileWriter = new FileWriter("from-user.txt", true);
            PrintWriter file = new PrintWriter(new BufferedWriter(fileWriter));

            String line = buffer.readLine();

            while (line != null) {
                String[] data = line.split(",");
                String name = data[0].trim();

                line = buffer.readLine();
            }
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
