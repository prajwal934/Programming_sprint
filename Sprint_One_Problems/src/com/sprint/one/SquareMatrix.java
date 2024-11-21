package com.sprint.one;

import java.util.Scanner;

public class SquareMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		int n = sc.nextInt();

		//		 Here is the logic 
		int num =1; //Variable to hold the number
		for(int i =1 ; i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}

	}
}
