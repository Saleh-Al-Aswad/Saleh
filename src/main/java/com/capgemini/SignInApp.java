package com.capgemini;

import java.util.Scanner;

public class SignInApp {
    // Global variable (0 = not signed in, 1 = signed in)
    public static int isLoggedIn = 0;

    // Method for handling sign-in process
    public static void signIn() {
        String correctUsername = "admin";
        String correctPassword = "1234";
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int maxAttempts = 3;

        // Step 1: Ask for username
        while (attempts < maxAttempts && isLoggedIn == 0) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            if (!username.equals(correctUsername)) {
                attempts++;
                if (attempts < maxAttempts) {
                    System.out.println("Invalid username. Attempts left: " + (maxAttempts - attempts));
                }
            } else {
                // Step 2: Username correct → ask for password
                int passAttempts = 0;
                while (passAttempts < maxAttempts && isLoggedIn == 0) {
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    if (password.equals(correctPassword)) {
                        System.out.println("Welcome!");
                        isLoggedIn = 1;
                    } else {
                        passAttempts++;
                        if (passAttempts < maxAttempts) {
                            System.out.println("Invalid password. Attempts left: " + (maxAttempts - passAttempts));
                        }
                    }
                }
                break; // Exit username loop if we already tried password
            }
        }
        if (isLoggedIn == 0) {
            // System.out.println("Too many attempts. Exiting.");
        } else {
            // System.out.println("isLoggedIn variable: " + isLoggedIn);
        }
    }
}
