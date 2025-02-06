package com.three;

import java.util.Scanner;

//  Write a program to print a right-angle triangle pattern with increasing numbers.
//  Each row should contain a continuous sequence of increasing numbers.
public class RightAngleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
