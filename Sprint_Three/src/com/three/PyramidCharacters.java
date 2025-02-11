package com.three;

import java.util.Scanner;

// Java program to print the Pyramid pattern using increasing characters
public class PyramidCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        char ch = 'A'; // start from A

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
