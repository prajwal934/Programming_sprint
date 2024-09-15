package com.sprint.one;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid number: ");
		int num = sc.nextInt();
		int count= 1;

		//		Here the logic of the prime number
		for (int i = 2; i <= num/2; i++) {
			if(num % i ==0)
				count++;
		}
		if(count == 2)
			System.out.println("It's a Prime Number!");
		else
			System.out.println("It's not a prime number!");
	}
}
