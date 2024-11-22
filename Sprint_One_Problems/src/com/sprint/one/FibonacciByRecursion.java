package com.sprint.one;

import java.util.Scanner;

public class FibonacciByRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid number: ");
		int n = sc.nextInt();
		System.out.println("Fibonacci sequence upto "+n+ " terms");
		for(int i=0;i<n ;i++) {
			System.out.print(fib(i) + " ");
		}
	}
 
//	By Using Recursion
	
	private static  int  fib(int n) {
		// TODO Auto-generated method stub
		if(n <= 1) 
			return n;
		return fib(n-1) + fib(n-2);
		
	}
	
}
