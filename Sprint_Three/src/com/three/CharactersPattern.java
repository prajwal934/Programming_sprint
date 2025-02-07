package com.three;

import java.util.Scanner;

// Print a right-angle triangle pattern using characters.
// Each row should contain the same character repeated according to the row number.
public class CharactersPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=0; j<= i;j++) {
                System.out.print((char) (i+65)+ " ");
            }
            System.out.println();
        }
    }
}
