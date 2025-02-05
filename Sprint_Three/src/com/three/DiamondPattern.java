package com.three;

import java.util.Scanner;

// write a java program to generate a Diamond pattern
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int st= n/2 , sp=1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=st;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=sp;j++){
                System.out.print("*");
            }
            if(i<=n/2) {
                st--;
                sp=sp+2;
            } else {
                st++;
                sp = sp -2;
            }
            System.out.println();
        }
    }
}
