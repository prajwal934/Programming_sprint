package com.three;

import java.util.Scanner;

// Write a program to print a pyramid pattern with increasing numbers.
// Each row should have an increasing sequence of numbers, centered horizontally
public class PyramidPatternNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }

            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
