package com.sprint.one;

import java.util.Scanner;

public class SumRangePrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int n = sc.nextInt();
		System.out.println("Enter the second Number: ");
		int m = sc.nextInt();
		int sum =0;
		
		for(int i=n ; i<=m;i++) {
			if(isPrime(i))
				sum = sum +i;
		}
		System.out.println("Sum of the prime numbers between "+n+ " and "+m+" is:"+sum);
	}

	private static boolean isPrime(int num) {
		
		if(num < 2) {
			return false;
		}
		
		for(int i=2; i<= num/2 ;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
