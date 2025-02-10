package com.three;

import java.util.Scanner;

// write a java program to print an inverted pyramid pattern with characters
public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=n; i>=1; i--){ //first print all n , then decreasing
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++) {
                System.out.print((char) (i+64) + " ");
            }
            System.out.println();
        }
    }
}
