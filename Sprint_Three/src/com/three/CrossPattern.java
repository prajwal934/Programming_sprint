package com.three;

import java.util.Scanner;

// write a java program to print the cross pattern with stars
public class CrossPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                // Print stars on the first and last row
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                // For the middle rows, print spaces and one star in the center
                for (int j = 0; j < n; j++) {
                    if (j == n / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(); // Move to the next line after each row
        }

    }
}
