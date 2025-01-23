package com.praj.two;

import java.util.Scanner;

// Generate a Pascal's Triangle for Up to N rows
public class GeneratePascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("The Pascal Triangle is: ");

        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                // Calculate the next number
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
