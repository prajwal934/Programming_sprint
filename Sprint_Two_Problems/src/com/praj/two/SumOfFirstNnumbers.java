package com.praj.two;

import java.util.Scanner;

// write a java program to find the sum of first 'N' numbers
public class SumOfFirstNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum =0;
//         by putting mathematical formula  sum = n*(n+1)
        for(int i=1;i<=n;i++) {
            sum += 2 * i;
        }
        System.out.println("Sum of first 'N' numbers is: "+sum);
    }
}
