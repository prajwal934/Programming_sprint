package com.sprint.one;

import java.util.Scanner;

public class SumOfSingleDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid number: ");
		int n = sc.nextInt();
		
//		Here, i'm doing step by step by the help of function 
		int r = reduceToSingleDigit(n);
		
		System.out.println("The Single digit sum is: "+ r);
	}
	
	public static int reduceToSingleDigit(int num) {
		while(num >= 10) {
			num = sumOfDigits(num);
		}
		return num;
	}
	
	public  static int sumOfDigits(int number) {
		int sum=0;
		while(number > 0) {
			sum += number % 10;
			number = number/10;
		}
		return sum;
	}
	
}
