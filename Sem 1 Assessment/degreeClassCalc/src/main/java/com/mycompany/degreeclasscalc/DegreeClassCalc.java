package com.mycompany.degreeclasscalc;
//
///**
// *
// * @author jameswoodthorpe
// */
//
//package main.java.com.mycompany.degreeclasscalc;
//import java.util.Scanner;
//
//public class DegreeClassCalc {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your overall percentage: ");
//    }
//}
//


import main.java.MethodA;
import main.java.MethodB;
import main.java.MethodC;

import java.util.Scanner;

public class DegreeClassCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Degree Classification Calculator ---");
            System.out.println("Choose a method to run:");
            System.out.println("1. Run MethodA");
            System.out.println("2. Run MethodB");
            System.out.println("3. Run MethodC");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nRunning MethodA...");
                    MethodA.main(new String[]{});
                    break;

                case 2:
                    System.out.println("\nRunning MethodB...");
                    MethodB.main(new String[]{});
                    break;

                case 3:
                    System.out.println("\nRunning MethodC...");
                    MethodC.main(new String[]{});
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please choose 1, 2, 3, or 4.");
            }
        }
    }
}
