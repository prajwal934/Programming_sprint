package com.three;

import java.sql.SQLOutput;
import java.util.Scanner;

// Generate a Hallow square
public class HallowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(i==1 || i == n || j == 1|| j ==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); //It's for hallow part
                }
            }
            System.out.println();
        }
    }
}
