package com.three;

import java.util.Scanner;

// Print a Right angle triangle of Sprint Three
public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1;i<n;i++) {
            for(int j=0;j < i;j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
