package com.praj.two;

import java.util.Random;
import java.util.Scanner;

// write a java program to generate a matrix with random numbers
public class RandomMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        Random r = new Random();

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                matrix[i][j] = r.nextInt(10); //generate numbers between 0-9
            }
        }
//        print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
