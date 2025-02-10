package com.three;

import java.util.Scanner;

// without using reverse()
public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Prajwal";
        String result = isReversed(str);
        System.out.println("The reversed string is: "+ result);
    }
    public static String isReversed(String str) {
        int n = str.length();
        String temp = " ";
        for(int i=n-1 ; i>=0;i--){
            temp += str.charAt(i);
        }
        return temp;
    }
}
