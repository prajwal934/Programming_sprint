package com.sprint.one;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int c = countDigit(n);
		System.out.println("The Number "+n+ " has "+ c+ " digits.");
	}

	private static int countDigit(int num) {
	
		int count =0;
		do {
			count++;
			num = num/10;
		}while(num != 0);
		return count;
	}
}
