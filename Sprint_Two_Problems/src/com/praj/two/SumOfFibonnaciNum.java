package com.praj.two;

import java.util.Scanner;

// Program to calculate the sum of the first N Fibonacci numbers
public class SumOfFibonnaciNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();

        int sum = sumOfFibonacciNum(n);
        System.out.println("Sum of first " + n + " Fibonacci numbers: " + sum);
    }

    public static int sumOfFibonacciNum(int n) {
        if (n <= 1) {
            return n; // Handle base cases (0 or 1 term)
        }

        int num1 = 0, num2 = 1, sum = 0; // Initialize sum to 0

        for (int i = 1; i <= n; i++) {
            sum += num2; // Add the current Fibonacci number to the sum
            int fibo = num1 + num2;
            num1 = num2;
            num2 = fibo;
        }

        return sum;
    }
}