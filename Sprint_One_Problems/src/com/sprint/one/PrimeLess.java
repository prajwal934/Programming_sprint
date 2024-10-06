package com.sprint.one;

import java.util.Scanner;

public class PrimeLess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.println("Prime numbers less than "+n+ " are:");
		for(int i=2;i<n;i++) {
			if(isPrime(i)) {
				System.out.println(i +" ");
			}
		}
	}

	private static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		for(int i=2;i<= num/2 ;i++) {
			if(num % i ==0) {
				return false;
			}
		}
		return true;
	}
}
