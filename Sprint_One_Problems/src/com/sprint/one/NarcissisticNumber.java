package com.sprint.one;

import java.util.Scanner;

public class NarcissisticNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		boolean rs = 	isNarcissistic(n);
		if(rs == true)
			System.out.println( "Its, a  Narcissistic Number");
		else
			System.out.println("No, it's not a  Narcissistic Number");

	}

	private static boolean isNarcissistic(int n) {
		int sum =0, temp =n;
		int dc = countDigits(n);
		do {
			int d = n % 10;
			sum = sum + pow(d , dc);
			n = n/10;
		}while(n != 0);
		return temp == sum;
		
	}

	private static int pow(int y, int p) {
		int prod =1;
		while(p > 0) {
			prod = prod * y;
			p--;
		}
		return prod;
	}

	private static int countDigits(int x) {
		int count =0;
		do {
			count++;
			x = x/10;
		}while(x != 0);
		return count;
	}
}
