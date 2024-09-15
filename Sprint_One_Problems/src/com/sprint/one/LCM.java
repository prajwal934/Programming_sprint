package com.sprint.one;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();

		//	first i'm going to find the gcd of two number 
		int gcd = findGcd(a,b);
		int lcm = findLcm(a,b);
		System.out.println("LCM of the two number is: " + lcm);
	}

//	first find the gcd of two number
	public static int findGcd(int a, int b) {
		if(a==0)
			return b;
		return findGcd(b % a, a );
	}
//	Then, by using of gcd we can find lcm

	private static int findLcm(int a, int b) {
		return (a / findGcd(a, b)) * b;
	}
}
