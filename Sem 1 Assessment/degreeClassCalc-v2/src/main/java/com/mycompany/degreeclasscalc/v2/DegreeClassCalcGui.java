package com.mycompany.degreeclasscalc.v2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class DegreeClassCalcGui {

    public static void main(String[] args) {
        // Main frame
        JFrame frame = new JFrame("Degree Classification Calculator");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Title Label
        JLabel titleLabel = new JLabel("Degree Classification Calculator", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(titleLabel, BorderLayout.NORTH);

        // Buttons Panel
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton methodAButton = new JButton("Run Method A");
        JButton methodBButton = new JButton("Run Method B");
        JButton methodCButton = new JButton("Run Method C");
        JButton exitButton = new JButton("Exit");

        buttonPanel.add(methodAButton);
        buttonPanel.add(methodBButton);
        buttonPanel.add(methodCButton);
        buttonPanel.add(exitButton);

        frame.add(buttonPanel, BorderLayout.CENTER);

        // Button Actions
        methodAButton.addActionListener(e -> createMethodFrame("Method A").setVisible(true));
        methodBButton.addActionListener(e -> createMethodFrame("Method B").setVisible(true));
        methodCButton.addActionListener(e -> createMethodFrame("Method C").setVisible(true));
        exitButton.addActionListener(e -> System.exit(0));

        // Show Frame
        frame.setVisible(true);
    }

    private static JFrame createMethodFrame(String methodName) {
        JFrame frame = new JFrame(methodName + " - Module Input");
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel moduleCountLabel = new JLabel("Enter number of modules:");
        JTextField moduleCountField = new JTextField();

        JButton nextButton = new JButton("Next");

        inputPanel.add(moduleCountLabel);
        inputPanel.add(moduleCountField);
        inputPanel.add(new JLabel());
        inputPanel.add(nextButton);

        frame.add(inputPanel, BorderLayout.CENTER);

        nextButton.addActionListener(e -> {
            int moduleCount;
            try {
                moduleCount = Integer.parseInt(moduleCountField.getText());
                if (moduleCount <= 0) throw new NumberFormatException();
                createModuleDetailFrame(methodName, moduleCount).setVisible(true);
                frame.dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid number of modules.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        });

        return frame;
    }

    private static JFrame createModuleDetailFrame(String methodName, int moduleCount) {
        JFrame frame = new JFrame(methodName + " - Module Details");
        frame.setSize(700, 500);
        frame.setLayout(new BorderLayout());

        // Panel for module input in table format
        JPanel modulePanel = new JPanel(new GridLayout(moduleCount + 1, 3, 10, 10));
        modulePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        List<JTextField> creditFields = new ArrayList<>();
        List<JTextField> markFields = new ArrayList<>();

        // Header Row
        modulePanel.add(new JLabel("Module", SwingConstants.CENTER));
        modulePanel.add(new JLabel("Credits", SwingConstants.CENTER));
        modulePanel.add(new JLabel("Marks", SwingConstants.CENTER));

        // Input Rows
        for (int i = 0; i < moduleCount; i++) {
            JLabel moduleLabel = new JLabel("Module " + (i + 1), SwingConstants.CENTER);
            JTextField creditField = new JTextField();
            JTextField markField = new JTextField();

            modulePanel.add(moduleLabel);
            modulePanel.add(creditField);
            modulePanel.add(markField);

            creditFields.add(creditField);
            markFields.add(markField);
        }

        // Calculate Button
        JButton calculateButton = new JButton("Calculate Grade");
        modulePanel.add(new JLabel()); // Empty cell
        modulePanel.add(calculateButton);
        modulePanel.add(new JLabel()); // Empty cell

        frame.add(new JScrollPane(modulePanel), BorderLayout.CENTER);

        // Result Area
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        resultArea.setMargin(new Insets(10, 10, 10, 10));
        frame.add(new JScrollPane(resultArea), BorderLayout.SOUTH);

        // Button Action to calculate grade
        calculateButton.addActionListener(e -> {
            try {
                int[] credits = new int[moduleCount];
                double[] marks = new double[moduleCount];

                for (int i = 0; i < moduleCount; i++) {
                    credits[i] = Integer.parseInt(creditFields.get(i).getText());
                    marks[i] = Double.parseDouble(markFields.get(i).getText());

                    if (credits[i] <= 0 || marks[i] < 0 || marks[i] > 100) throw new NumberFormatException();
                }

                double average = calculateWeightedAverage(credits, marks);
                String classification = classifyGrade(average);

                resultArea.setText(String.format("%s Results:\nWeighted Average: %.2f\nClassification: %s", methodName, average, classification));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Ensure all credits and marks are valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        return frame;
    }

    private static double calculateWeightedAverage(int[] credits, double[] marks) {
        double weightedSum = 0;
        int totalCredits = 0;
        for (int i = 0; i < credits.length; i++) {
            weightedSum += credits[i] * marks[i];
            totalCredits += credits[i];
        }
        return totalCredits == 0 ? 0 : weightedSum / totalCredits;
    }

    private static String classifyGrade(double average) {
        if (average >= 70) return "First Class";
        if (average >= 60) return "Upper Second Class (2:1)";
        if (average >= 50) return "Lower Second Class (2:2)";
        if (average >= 40) return "Third Class";
        return "Fail";
    }
}
