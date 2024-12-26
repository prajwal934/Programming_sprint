package com.praj.two;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the: ");
		int n = sc.nextInt();
		
		int[][] matrix= new int[n][n];
		
//		calculate the multiplication table
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				matrix[i-1][j-1] = i * j;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
