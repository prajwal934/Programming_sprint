package com.sprint.one;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = sc.nextInt();
        System.out.println("Enter the second number: ");
        int m = sc.nextInt();

        // Loop through the range from 'n' to 'm'
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) 
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
