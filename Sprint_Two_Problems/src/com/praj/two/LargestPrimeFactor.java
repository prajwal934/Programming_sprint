package com.praj.two;

import java.util.Scanner;

// write a program to find the largest prime factor of a given number
public class LargestPrimeFactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int largestFactor = findLargestFactor(num);
        System.out.println("The largest prime factor of " + num + " is: " + largestFactor);
    }
    public static int findLargestFactor(int n) {
        int largest = -1;
//        divided by 2 until , it's become a odd number
        while(n % 2== 0) {
            largest =2;
            n /= 2;
        }
//        check odd numbers
        for(int i=3 ;i <= n/i;i += 2) {
            while(n % i == 0) {
                largest = i;
                n /= i;
            }
        }
//        if 'n' is still greater than 2
        if( n > 2) {
            largest = n;
        }
        return largest;
    }
}
