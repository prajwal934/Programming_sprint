package com.three;

import java.util.Scanner;

public class ZigZagPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n + 1];
        int num = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // Left to Right
                for (int j = 0; j < n + 1; j++) {
                    matrix[i][j] = num++;
                }
            } else { // Right to Left
                for (int j = n; j >= 0; j--) {
                    matrix[i][j] = num++;
                }
            }
        }

        // Print the matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
