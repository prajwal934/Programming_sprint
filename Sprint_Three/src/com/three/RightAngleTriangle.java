package com.three;

import java.util.Scanner;

// Generate a right angle triangle
public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1;i< n;i++) {
            for(int j=0;j< i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
