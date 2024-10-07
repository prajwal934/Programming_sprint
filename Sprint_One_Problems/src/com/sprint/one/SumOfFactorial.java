package com.sprint.one;

import java.util.Scanner;

public class SumOfFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;  // Calculate factorial
        }

        // Calculate the sum of digits of the factorial
        int sum = 0;
        while (fact > 0) {
            sum += fact % 10;  
            fact /= 10;  
        }
        System.out.println("The sum of the digits of the factorial is: " + sum); 
    }
}
