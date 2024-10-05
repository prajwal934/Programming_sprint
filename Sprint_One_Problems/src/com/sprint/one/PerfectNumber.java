package com.sprint.one;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		boolean rs = isPerfectNumber(n);
		if(rs == true) 
			System.out.println("Yes, It's a Perfect Number");
		else 
			System.out.println("No , It's not a Perfect Number");
	}

	private static boolean isPerfectNumber(int num) {
		int sum =0;
		for(int i=1; i<= num / 2 ;i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}
}
