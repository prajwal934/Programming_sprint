package com.praj.two;

import java.util.Scanner;

// write a java program to generate a matrix filled with numbers in a spiral pattern
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        filledTheMatrix(matrix, n);
        printTheMatrix(matrix , n);
    }
    public static void filledTheMatrix(int[][] matrix , int n) {
        int value = 1, top =0 , bottom = n-1, left = 0, right = n -1;

        while (value <= n * n) {
            // For top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;
            // For right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;
            // For bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;
            // For left column
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }
    }

    public static void printTheMatrix(int[][] matrix, int size) {
        for(int i=0;i<size;i++) {
            for(int j=0;j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
