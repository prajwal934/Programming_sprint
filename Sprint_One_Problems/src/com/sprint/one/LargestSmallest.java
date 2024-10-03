package com.sprint.one;

import java.util.Scanner;

public class LargestSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] b = new int[n];  // Single array to store values

        System.out.println("Enter " + n + " values:");

        // Input values into the array
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        // Initialize largest and smallest with the first element
        int largest = b[0];
        int smallest = b[0];

        // Loop through the array to find largest and smallest numbers
        for (int i = 1; i < b.length; i++) {
            if (b[i] > largest) {
                largest = b[i];
            }
            if (b[i] < smallest) {
                smallest = b[i];
            }
        }

        // Output the largest and smallest values
        System.out.println("The largest value in the array is: " + largest);
        System.out.println("The smallest value in the array is: " + smallest);
    }
}