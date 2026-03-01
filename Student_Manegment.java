package com.program;

import java.util.Scanner;

/*
 * Student Management Application
 * This program takes the number of students from the user,
 * then stores each student's name, ID, and marks in arrays,
 * and finally prints them in a formatted table.
 */

public class Assignmet {

    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the Student Management Application");

        // Variable to store number of students
        int size;
        System.out.println("Enter the number of students : ");
        // Ask user to enter number of students
        size = input.nextInt();
        input.nextLine();

        
        String name[] = new String[size]; // To store student Names
        int id[] = new int[size]; // To store students IDs
        double marks[] = new double[size]; // To store student Marks

        
        // Ask user to enter the data of students
        for (int i = 0; i < size; i++){
            System.out.printf("ENTER THE NAME OF %d: ",i+1);
            name[i] = input.nextLine();
            
            System.out.printf("ENTER THE ID OF %d: ",i+1);
            id[i] = input.nextInt();
            
            System.out.printf("ENTER THE MARKS OF %d: ",i+1);
            marks[i] = input.nextDouble();
            input.nextLine();
        }
        
        // Displaying the data of students
        System.out.println("NUM\tName\tId\tMarks");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d\t%s\t%d\t%.2f\n",i+1 ,name[i], id[i], marks[i]);
        }
    }
}
