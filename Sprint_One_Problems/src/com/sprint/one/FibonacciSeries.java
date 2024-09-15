package com.sprint.one;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n = sc.nextInt();
		fibonacciSeries(n);
	}

	public static void fibonacciSeries(int X) {
		int num1 =0 , num2=1;
		for(int i=0;i< X;i++) {
			System.out.print(num1+",");
			
//			By using Swapping
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
		}
	}
}
