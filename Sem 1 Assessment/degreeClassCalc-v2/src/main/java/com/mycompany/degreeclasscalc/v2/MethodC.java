package com.mycompany.degreeclasscalc.v2;

import java.util.Scanner;

public class MethodC {

    private static double calculateWeightedAverage(int[] credits, double[] marks) {
        double weightedSum = 0;
        int totalCredits = 0;

        for (int i = 0; i < credits.length; i++) {
            weightedSum += credits[i] * marks[i];
            totalCredits += credits[i];
        }

        return weightedSum / totalCredits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of modules for Level 6: ");
        int L6Modules = scanner.nextInt();
        int[] L6Credits = new int[L6Modules];
        double[] L6Marks = new double[L6Modules];

        System.out.println("Enter the credits and marks for Level 6 modules:");
        for (int i = 0; i < L6Modules; i++) {
            System.out.print("Module " + (i + 1) + " Credits: ");
            L6Credits[i] = scanner.nextInt();
            System.out.print("Module " + (i + 1) + " Marks: ");
            L6Marks[i] = scanner.nextDouble();
        }

        double L6Average = calculateWeightedAverage(L6Credits, L6Marks);

        String classification;
        if (L6Average >= 70) {
            classification = "First Class";
        } else if (L6Average >= 60) {
            classification = "Upper Second Class (2:1)";
        } else if (L6Average >= 50) {
            classification = "Lower Second Class (2:2)";
        } else if (L6Average >= 40) {
            classification = "Third Class";
        } else {
            classification = "Fail";
        }

        
        System.out.println("\nResults:");
        System.out.printf("L6 Average: %.2f\n", L6Average);
        System.out.println("Classification: " + classification);

        scanner.close();
    }
}
