package com.sprint.one;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		boolean rs = isArmstrong(n);

		//		Here we check
		if(rs == true) 
			System.out.println("It's an Armstong Number!");
		else
			System.out.println("It's not an Armstrong Number!");
	}

	private static boolean isArmstrong(int x) {
		//		here is the logic for Armstrong number
		int sum =0, temp = x;
		do {
			int d= x % 10;
			sum = sum + d*d*d;
			x = x/10;
		} while(x != 0);
		return temp == sum;
	}
}
