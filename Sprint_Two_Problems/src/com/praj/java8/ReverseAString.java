package com.praj.java8;

import java.util.Scanner;

// Reverse a String
public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String: ");
//        String str = sc.next();
        String str = "Prajwal";
        String st = reverse(str);
        System.out.println("The Reversed String is: "+st);
    }

    public static String reverse(String str) {
        String temp = " ";
        int n = str.length();
        for(int i= n-1 ; i >=0 ;i--) {
            temp += str.charAt(i);
        }
        return temp;
    }
}
