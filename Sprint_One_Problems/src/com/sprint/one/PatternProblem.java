package com.sprint.one;

import java.util.Scanner;

public class PatternProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int number = 1;  // To track the current number to print

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;  // Increment the number after printing
            }
            System.out.println();  // Move to the next line after each row
        }

    }
}
