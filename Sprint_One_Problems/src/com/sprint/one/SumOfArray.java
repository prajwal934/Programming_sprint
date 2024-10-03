package com.sprint.one;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		//		Input array values are 
		System.out.println("Enter " + n+ " values");
		for(int i=0; i<n ;i++) {
			arr[i] = sc.nextInt();
		}

		//	Sum of the array 
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of the Array is: "+sum);

	}
}
