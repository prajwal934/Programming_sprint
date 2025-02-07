package com.three;

import java.util.Scanner;

// Print a matrix of consecutive numbers starting from 1, filling rows sequentially.
public class ConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int num =1;
        for(int i=0;i<n;i++){
            for(int j=0;j < n;j++) {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }
}
