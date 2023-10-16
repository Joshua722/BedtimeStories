package com.pluralsight;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class BedtimeStories {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/goldilocks.txt");
            FileInputStream fis2 = new FileInputStream("src/main/resources/hansel_and_gretel.txt");
            FileInputStream fis3 = new FileInputStream("src/main/resources/mary_had_a_little_lamb.txt");
            Scanner myScanner = new Scanner(fis);
            Scanner myScanner2 = new Scanner(fis2);
            Scanner myScanner3 = new Scanner(fis3);
            Scanner input = new Scanner(System.in);

            System.out.println("Hello there! Which story would you like to read?\n" +
                    " 1) Goldilocks and the Three Bears\n" +
                    " 2) Hansel and Gretel \n" +
                    " 3) Mary had a little lamb");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    while (myScanner.hasNextLine()) {
                        System.out.println(myScanner.nextLine());
                    } myScanner.close();
                    break;
                case 2:
                    while (myScanner2.hasNextLine()) {
                        System.out.println(myScanner2.nextLine());
                    } myScanner2.close();
                    break;
                case 3:
                    while (myScanner3.hasNextLine()) {
                        System.out.println(myScanner3.nextLine());
                    } myScanner3.close();
                    break;
                default:
                    System.out.println("WRONG! PLEASE CHOOSE ONE OF THE CORRECT OPTIONS!");
            }
        } catch (FileNotFoundException e) {
            System.out.println(" One or more files are not found");

        }
    }
}
