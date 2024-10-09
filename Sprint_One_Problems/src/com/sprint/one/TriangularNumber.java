package com.sprint.one;

import java.util.Scanner;

public class TriangularNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		int trn = n * (n+1) / 2;
		
		System.out.println("The "+n+"th triangular number is: "+trn);
		
		
	}
}
