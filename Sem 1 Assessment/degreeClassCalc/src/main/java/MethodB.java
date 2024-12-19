package main.java;

import java.util.Scanner;

public class MethodB {

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

        System.out.println("Enter the number of modules for Level 5: ");
        int L5Modules = scanner.nextInt();
        int[] L5Credits = new int[L5Modules];
        double[] L5Marks = new double[L5Modules];

        System.out.println("Enter the credits and marks for Level 5 modules:");
        for (int i = 0; i < L5Modules; i++) {
            System.out.print("Module " + (i + 1) + " Credits: ");
            L5Credits[i] = scanner.nextInt();
            System.out.print("Module " + (i + 1) + " Marks: ");
            L5Marks[i] = scanner.nextDouble();
        }

        System.out.println("\nEnter the number of modules for Level 6: ");
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

        double L5Average = calculateWeightedAverage(L5Credits, L5Marks);
        double L6Average1 = calculateWeightedAverage(L6Credits, L6Marks);
        double L6Average2 = calculateWeightedAverage(L6Credits, L6Marks); // Assuming L6 average is repeated

        double overallAverage = (L5Average + L6Average1 + L6Average2) / 3;

        String classification;
        if (overallAverage >= 70) {
            classification = "First Class";
        } else if (overallAverage >= 60) {
            classification = "Upper Second Class (2:1)";
        } else if (overallAverage >= 50) {
            classification = "Lower Second Class (2:2)";
        } else if (overallAverage >= 40) {
            classification = "Third Class";
        } else {
            classification = "Fail";
        }

        System.out.println("\nResults:");
        System.out.printf("L5 Average: %.2f\n", L5Average);
        System.out.printf("L6 Average 1: %.2f\n", L6Average1);
        System.out.printf("L6 Average 2: %.2f\n", L6Average2);
        System.out.printf("Overall Average: %.2f\n", overallAverage);
        System.out.println("Classification: " + classification);

        scanner.close();
    }
}
