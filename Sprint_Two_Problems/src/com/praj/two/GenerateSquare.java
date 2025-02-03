package com.praj.two;

import java.util.Scanner;

// write a java program to generate a square matrix with random numbers
public class GenerateSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int size = sc.nextInt();
        System.out.println("The Generates matrix is: ");
        int[][] matrix = new int[size][size];

        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
//        print the matrix
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
