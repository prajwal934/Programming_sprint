package com.praj.two;

import java.util.Scanner;

// finding all divisors of the product of two numbers
public class DivisorsOfProductNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = sc.nextInt();
        System.out.println("Enter the second number: ");
        int m = sc.nextInt();
        int prod = n * m;
        System.out.println("Divisors of the product is: "+prod+ " and the divisors are:: ");

        for(int i=1;i <= prod;i++) {
            if(prod % i == 0) {
                System.out.print( i + " , ");
            }
        }
    }
}
