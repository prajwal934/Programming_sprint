package com.praj.two;

import java.util.Scanner;

public class SumOfFirstNOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		int sum=0;
		int currentOdd = 1;
		for(int i=0;i<n;i++) {
			sum += currentOdd;
			currentOdd += 2;
		}
		System.out.println("Sum of first " + n + " odd numbers is: "+sum);
	}
}
