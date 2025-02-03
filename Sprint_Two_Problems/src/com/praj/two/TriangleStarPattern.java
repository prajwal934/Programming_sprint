package com.praj.two;

import java.util.Scanner;

// write a java program to generate a triangle pattern of stars with a specified height
public class TriangleStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int h = sc.nextInt();

        for(int i=0;i<h;i++) {
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
