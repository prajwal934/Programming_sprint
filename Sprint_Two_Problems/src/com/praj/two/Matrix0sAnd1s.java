package com.praj.two;

import java.util.Scanner;

// Generating Matrix with 0s and 1s
public class Matrix0sAnd1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
    }
}
