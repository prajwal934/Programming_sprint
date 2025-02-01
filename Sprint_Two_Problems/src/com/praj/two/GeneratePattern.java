package com.praj.two;

import java.util.Scanner;

// wajp to create a pattern where numbers increase with each row
public class GeneratePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // For each row i, print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
