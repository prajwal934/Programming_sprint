package com.praj.two;

import java.util.Scanner;

// wajp to generate a matrix where each element is a fibonacci number.
public class MatrixOfFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int n = sc.nextInt();
        int[][] mat = generateFibo(n);
        System.out.println("Fibonacci Matrix is: ");
        for(int[] row: mat) {
            for(int ele: row) {
                System.out.print(ele+ " ");
            }
            System.out.println();
        }
    }
    public static int[][] generateFibo(int n) {
        int[][] matrix = new int[n][n];
        int a=1, b=1;
        int index=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(index == 0) {
                    matrix[i][j] = a;
                } else if (index == 1) {
                    matrix[i][j] =b;
                } else {
                    int temp = a + b;
                    a = b;
                    b = temp;
                    matrix[i][j] = b;
                }
                index++;
            }
        }
        return matrix;
    }
}
