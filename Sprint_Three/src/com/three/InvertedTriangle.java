package com.three;

import java.util.Scanner;

// Write a java program to print an inverted triangle with "*" , where each row should contain decreasing numbers of stars from top row
public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=n; i>=1; i--){ //first print all n , then decreasing
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
