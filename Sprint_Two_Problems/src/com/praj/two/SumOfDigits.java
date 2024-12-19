package com.praj.two;

import java.util.Scanner;

//find the sum of the digits until zero
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid number: ");
		int n = sc.nextInt();

		while(n >= 10) {
			n = sumOfDigit(n);
		}
		System.out.println("The Sum of Digits until zero is: "+n);
	}

	private static int sumOfDigit(int n) {
		// TODO Auto-generated method stub
		int sum =0;
		do {
			int d = n % 10;
			sum += d;
			n = n/10;
		}while(n != 0);
		return sum;
	}
}
