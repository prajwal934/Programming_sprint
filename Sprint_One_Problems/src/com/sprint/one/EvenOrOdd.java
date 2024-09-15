package com.sprint.one;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a valid number: ");
		int num = sc.nextInt();
//		Here we check if the number is even or odd
		if(num % 2 == 0)
			System.out.println("Yeah, It's an Even Number");
		else
			System.out.println("Opps, It's an Odd Number");

	}
}
