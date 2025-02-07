package com.three;

import java.util.Scanner;

public class CheckBoardPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1;j<=n;j++) {
                if((i+j) % 2 == 0){  //row + column index
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}
