package com.capgemini;
import com.capgemini.show_reservations;

import java.util.Scanner;

import com.capgemini.SignInApp;
import com.capgemini.StartDemo;
public class Demo{
    public static void main(String[] args) {
        try {
            StartDemo startd = new StartDemo();
            show_reservations shr = new show_reservations("data/Reservations.csv");
            //shr.Read();
            startd.StD();
            SignInApp.signIn();
            String options = """
                    ===Admin Menu===
                    1. List Reservations
                    2. Add Boat
                    3. Edit pricing
                    4. Manage Categories
                    5. Maintenance
                    6. Toggle Boat Actice/Inactive
                    7. Sign out
                    Select an option,: [Example input : 1] :
                    """;
            // This feature added to allow multiple operations until sign out or list reservations is selected
            boolean continueLoop = true;
            while(continueLoop){
                System.err.println(8);
                System.out.println(options);
                Scanner scanner = new Scanner(System.in);
                String option = scanner.nextLine();
                switch (option) {
                    case "1":
                        for (var reservation : shr.Read()) {
                            System.out.println(reservation.toString());
                        }
                        continueLoop = false;
                        break;

                    case "7":
                        SignInApp.isLoggedIn = 0;
                        System.out.println("Signed out successfully.");
                        continueLoop = false;
                        break;

                    case "2","3","4","5","6":
                        System.out.println("Option not implemented yet.");
                        break;
                
                    default:
                        break;
                }
            } // End of the while loop
        } catch (java.io.IOException e) {
            System.err.println("Error reading reservations: " + e.getMessage());
        }
    }
}