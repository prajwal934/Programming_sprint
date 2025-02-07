package com.three;

import java.util.Scanner;

// Print Pascal’s Triangle up to `N` rows.
// Each row should be constructed based on the sum of the elements directly above it in the previous row.
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            int x=1;
            for(int j=1;j<=i;j++) {
                System.out.print(x+" ");
                x=x*(i-j)/j;
            }
            System.out.println();
        }
    }
}
