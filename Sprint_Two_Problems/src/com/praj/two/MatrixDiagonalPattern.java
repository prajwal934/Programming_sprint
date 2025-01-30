package com.praj.two;

import java.util.Arrays;
import java.util.Scanner;

// write a java program to create a matrix with a diagonal pattern
public class MatrixDiagonalPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        for(int i=0;i<size;i++) {
            for(int j=0;j<= i;j++) {
                matrix[i][j] = 1;
            }
        }
//         for print the matrix
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
