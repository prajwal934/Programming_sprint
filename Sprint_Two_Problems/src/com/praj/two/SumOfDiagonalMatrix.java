package com.praj.two;

// write a java program the sum of Diagonal elements in a Matrix
public class SumOfDiagonalMatrix {
    public static void main(String[] args) {
        int[][] matrix =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = diagonalSum(matrix);
        System.out.println("The Sum of the diagonal elements of the matrix is: "+sum);
    }

    public static int diagonalSum(int[][] matrix) {
        int sum=0, n= matrix.length;

        for(int i=0;i < n;i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
