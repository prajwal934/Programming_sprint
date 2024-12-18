package com.sprint.one;
import java.util.Scanner;

public class PrimeFactorsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int n = number;

        // Find prime factors and add them
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                sum += i;
                n /= i;
            }
        }

        System.out.println("The sum of the prime factors of " + number + " is: " + sum);
        sc.close();
    }
}
