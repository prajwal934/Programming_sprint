package com.three;

import java.util.Scanner;

// Print a pattern where elements are alternative '0' and '1'
public class AlternativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print((i+j) % 2);
            }
            System.out.println();
        }
    }
}
