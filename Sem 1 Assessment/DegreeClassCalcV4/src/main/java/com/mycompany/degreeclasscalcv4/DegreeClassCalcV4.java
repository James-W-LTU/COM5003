package com.mycompany.degreeclasscalcv4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DegreeClassCalcV4 implements ActionListener {
    
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[3];
    JButton[] functionButtons = new JButton[9];
    JButton l5andL6Button, l6Button, calcButton;
    JPanel panel;
    
    // correct font creation
    Font myFont = new Font("Arial", Font.BOLD, 30);
    double num1 = 0, num2 = 0, result = 0;
    
    
    DegreeClassCalcV4(){
        
        // creates the frame and sizes it
        frame = new JFrame("Degree Classification Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 550);
        frame.setLayout(null);
        
        JLabel titleLabel = new JLabel("Degree Classification Calculator");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        // creates the text field for user to input numbers
        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);
        
        // creates the buttons 
        l5andL6Button = new JButton("Level 5 and 6");
        l6Button = new JButton("Level 6");
        calcButton = new JButton("Calculate");
        

        functionButtons[0] = l5andL6Button;
        functionButtons[1] = l6Button;
        functionButtons[2] = calcButton;
        
        
        // for loops to add functions to the buttons 
        for(int i =0;i<9;i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }
        
        for(int i =0;i<10;i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }
        
        negButton.setBounds(50,430,100,50);
        delButton.setBounds(150,430,100,50);
        clrButton.setBounds(250,430,100,50);
        
        // creates panel to contain the buttons and places them on a grid
        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        
        

        frame.add(panel);
        frame.add(textfield);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        
        DegreeClassCalcV4 calc = new DegreeClassCalcV4();
    }

    @Override
    // allows the buttions for perform an action when clicked
    public void actionPerformed(ActionEvent e) {
    
        
        }
    }
}
