package com.sprint.one;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid number: ");
		String n = sc.next();
		
		System.out.println("Enter the digit count: ");
		char digit = sc.next().charAt(0);
		
//		validate the digit input
		if(!Character.isDigit(digit)) {
			System.out.println("Invalid input please enter a single digit between 0 to 9");
			return;
		}
		
//		count the occurrences by using a loop
		int count =0;
		for(char ch : n.toCharArray()) {
			if (ch == digit) {
				count++;
			}
		}
		
		System.out.println("The didgit "+digit+ " occurs "+count +" times in the number "+n);
	}
}
