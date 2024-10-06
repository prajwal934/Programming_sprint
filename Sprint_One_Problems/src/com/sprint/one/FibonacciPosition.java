package com.sprint.one;

import java.util.Scanner;

public class FibonacciPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position: ");
		int p = sc.nextInt();
		int  f = fibonacciPosition(p);
		System.out.println("The Fibonacci number at position "+p+ " is: "+f);
	}

	private static  int fibonacciPosition(int n) {
		if(n <=1 ) {
			return n; //for the position of 0 and 1
		}
		int num1=0,num2=1;
		int fibo =0;
		
//		I'm doing it by swapping logic 
		for(int i=2;i<=n;i++) {
			fibo = num1 + num2; //for the next fibonacci number
			num1 = num2; //swapping
			num2 = fibo;
		}
		return fibo;
	}
}
