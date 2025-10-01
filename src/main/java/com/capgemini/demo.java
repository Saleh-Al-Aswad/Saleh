package com.capgemini;
import com.capgemini.show_reservations;
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

            for (var reservation : shr.Read()) {
                System.out.println(reservation.toString());
            }
        } catch (java.io.IOException e) {
            System.err.println("Error reading reservations: " + e.getMessage());
        }
    }
}