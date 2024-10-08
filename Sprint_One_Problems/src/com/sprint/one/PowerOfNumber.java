package com.sprint.one;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int a = sc.nextInt();
		System.out.println("Enter the exponent: ");
		int b = sc.nextInt();

		int p = powOf(a,b);
		System.out.println(a + " raised to the power of "+b+ " is: "+p);
	}

	private static int powOf(int a, int b) {
		int prod = 1;
		while(b > 0) {
			prod = prod * a;
			b--;
		}
		return prod;
	}
}
