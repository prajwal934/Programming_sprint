package com.sprint.one;

import java.util.Scanner;

public class AvgOfArray {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of the array: ");
	        int n = sc.nextInt();
	        
	        // Create an array of the given size
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " numbers:");
	        
	        // Input the array elements
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        // Calculate the sum
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        int average = sum / n;
	        System.out.println("The average is: " + average);
	        
	    }
}
