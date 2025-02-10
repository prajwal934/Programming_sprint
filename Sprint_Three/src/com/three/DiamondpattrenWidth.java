package com.three;

import java.util.Scanner;

// write a java program to print a Diamond pattern with increasing width
public class DiamondpattrenWidth {
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
            for(int j=1;j<=sp;j++) {
                System.out.print("*");
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
