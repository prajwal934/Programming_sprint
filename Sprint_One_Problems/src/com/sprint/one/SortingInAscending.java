package com.sprint.one;

import java.util.Arrays;
import java.util.Scanner;

public class SortingInAscending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
//		Input array values 
		System.out.println("Enter " + n +" values");
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
//		Sort the Array in ascending order
		Arrays.sort(arr);
		String st = Arrays.toString(arr);
		System.out.println("The array sorted in ascending order is: "+st);
	}
}
