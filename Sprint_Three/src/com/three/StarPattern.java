package com.three;

import java.util.Scanner;

// Print a pattern where each row has an increasing width of stars.
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
