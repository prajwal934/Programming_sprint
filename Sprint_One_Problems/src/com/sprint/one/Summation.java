package com.sprint.one;

import java.util.Scanner;

public class Summation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid number: ");
		int n = sc.nextInt();
		
//		Here we calculate the summation of a number
		int sum =0;
		do {
			int d = n % 10;
			sum = sum+ d;
			n = n/10;
		}while(n != 0);
		System.out.println("Summation of the entered number: " + sum);
	}
}
