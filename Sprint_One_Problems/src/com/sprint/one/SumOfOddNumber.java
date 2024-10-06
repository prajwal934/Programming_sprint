package com.sprint.one;

import java.util.Scanner;

public class SumOfOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n = sc.nextInt();
		System.out.println("Enter the second number: ");
		int m = sc.nextInt();
		
		int sum =0;
		for(int i=n;i<=m;i++) {
			if(i %2 != 0)
				sum = sum +i;
		}
		System.out.println("Sum of the Odd number is: "+sum);
	}
}
