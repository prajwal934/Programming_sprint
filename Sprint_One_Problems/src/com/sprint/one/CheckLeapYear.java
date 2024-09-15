package com.sprint.one;

import java.util.Scanner;

public class CheckLeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int y = sc.nextInt();
//		Here we check leap year or not!
		if(y % 400 == 0 || y %4 == 0 && y % 100 != 0 )
			System.out.println("It's a leap year!");
		else
			System.out.println("It's not a leap year");
	}
}
