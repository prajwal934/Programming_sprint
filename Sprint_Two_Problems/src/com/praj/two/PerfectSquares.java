package com.praj.two;

import java.util.Scanner;

// write a java program to find the perfect squares of a given range
public class PerfectSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = sc.nextInt();
        System.out.println("Enter the second number: ");
        int m = sc.nextInt();

        for(int i=n;i<=m;i++) {
            if(Math.sqrt(i) % 1 == 0)
                System.out.print(i + " ");
        }
    }
}
