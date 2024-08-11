package controllers;

import java.util.Scanner;

public class OptionMain {
    static Scanner scanner = new Scanner(System.in);

    public static void showMainMenu() {
        System.out.println("\nOptions : ");
        System.out.println("1. Admins");
        System.out.println("2. Users");
        System.out.println("3. Exit");
        System.out.print("Who are you logging in as? ");
    }

    public static int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextInt();
    }
}
