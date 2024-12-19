package com.praj.two;

import java.util.Scanner;

//Write a program to calculate the sum of the series 1 + 1/2 + 1/3 + ... + 1/n up to the nth term.
public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid number: ");
		int n = sc.nextInt();
	
		double sum = 0.0;
		for(int i=1;i<=n;i++) {
			sum += 1.0/i;
		}
		
		System.out.printf(" The sum of the series is: %.6f%n", sum);
	}
	
}
