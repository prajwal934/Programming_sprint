package com.praj.two;

import java.util.Scanner;

// write a java program to find the sum of first 'n' prime numbers:
public class SumOfFirstPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid number: ");
        int n = sc.nextInt();
        int p = checkPrime(n);
        System.out.println("The sum of the first " + n + " prime numbers is: " + p);
    }

    public static int checkPrime(int n) {
        int count = 0, sum = 0;
        int num = 2; // Start checking primes from 2

        while (count < n) { // Loop until 'n' prime numbers are found
            boolean isPrime = true;

            // Check if 'num' is a prime number
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++; // Increment the count of primes found
                sum += num; // Add the prime number to the sum
            }

            num++; // Move to the next number
        }

        return sum;
    }
}
