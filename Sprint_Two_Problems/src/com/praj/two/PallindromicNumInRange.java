package com.praj.two;

import java.util.Scanner;

// wajp to check for Palindromic Numbers in a range
public class PallindromicNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Start number: ");
        int n = sc.nextInt();
        System.out.println("Enter the End number: ");
        int m = sc.nextInt();
        for(int i=n;i<=m;i++) {
            boolean rs = isPalindromic(i);
            if(rs == true) {
                System.out.print(i+ " ");
            }
        }
    }
    public static boolean isPalindromic(int num) {
        int rev=0 , temp = num;
        do{
            int d = num % 10;
            rev = rev * 10 + d;
            num = num/10;
        } while(num != 0);
        return temp == rev;
    }
}
