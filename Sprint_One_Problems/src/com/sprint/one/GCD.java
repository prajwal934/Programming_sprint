package com.sprint.one;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		int gcd = greatestCommonDivisor(a,b);
		System.out.println("GCD of the two number is: " + gcd);
	}

	public static int greatestCommonDivisor(int a, int b) {
		if(b == 0)
			return a;
		return greatestCommonDivisor(b , a % b);
	}
}
