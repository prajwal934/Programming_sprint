package com.three;

import java.util.Scanner;

// write a java program to print the alternating characters in rows.
public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=0;i< n;i++) {
            for(int j=0;j < n;j++) {
                System.out.print(((i + j) % 2 == 0) ? 'A' : 'B');
            }
            System.out.println();
        }
    }
}
