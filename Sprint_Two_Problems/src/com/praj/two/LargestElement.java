package com.praj.two;

// finding the largest element in each row of a matrix
public class LargestElement {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int n = matrix.length;
        int[] largest = new int[n];

        for (int i = 0; i < n; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            largest[i] = max;
        }

        // Print the largest elements with comma separation
        for (int i = 0; i < largest.length; i++) {
            System.out.print(largest[i]);
            if (i != largest.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
