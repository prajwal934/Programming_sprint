package com.three;

import java.util.Scanner;

// Java program to print diamond pattern with numbers
public class DiamondPatternNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int st = n / 2, sp = 1; // Space and number count

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= st; j++) {
                System.out.print(" ");
            }

            // Print numbers
            int num = 1;
            for (int j = 1; j <= sp; j++) {
                System.out.print(num);
                if (j <= sp / 2) {
                    num++;
                } else {
                    num--;
                }
            }

            // Adjust spaces and numbers for next row
            if (i <= n / 2) {
                st--;
                sp += 2;
            } else {
                st++;
                sp -= 2;
            }

            System.out.println();
        }
    }
}
