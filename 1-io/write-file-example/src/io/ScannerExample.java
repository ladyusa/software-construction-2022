package io;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data1 = scanner.next();
        int data2 = scanner.nextInt();
        double data3 = scanner.nextDouble();
        String data4 = scanner.nextLine();

        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
        System.out.println("data3 = " + data3);
        System.out.println("data4 = " + data4);
    }
}
