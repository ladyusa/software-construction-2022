package io;

import java.io.*;

public class Example {

    public static void main(String[] args) {

        String filename = "number.txt";

        try {
            FileReader inReader = new FileReader(filename);
            BufferedReader buffer = new BufferedReader(inReader);

            String line = null;
            int total = 0;

            while ( (line = buffer.readLine()) != null) {
                System.out.println("----> " + line);
                int num = Integer.parseInt(line);
                total += num;
            }
            System.out.println("Total = " + total);
        }
        catch (FileNotFoundException e) {
            System.err.println("Cannot open file " + filename);
        }
        catch (IOException e) {
            System.err.println("Error reading from user");
        }
    }
}
