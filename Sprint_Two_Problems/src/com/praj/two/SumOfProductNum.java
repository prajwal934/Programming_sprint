package com.praj.two;

import java.util.Scanner;

// write a java program to find the sum of the digits of the product of two given number
public class SumOfProductNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int n = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int m = sc.nextInt();
        int p = sumOfProductDigt(n,m);
        System.out.println("The Sum of Product digit is: "+p);
    }
    public static int sumOfProductDigt(int n , int m) {
        int prod = n * m;
        int sum=0;
//        sum of product digit
        do{
            int d = prod % 10;
            sum = sum + d;
            prod= prod/10;
        }while (prod != 0);
        return sum;
    }
}
