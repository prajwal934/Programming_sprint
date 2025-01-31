package com.praj.two;

import java.util.Scanner;

// wajp to count of digits greater than a specific value
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the specific value: ");
        int sn = sc.nextInt();
        int count =0;
        do{
            int d = num % 10;
            if(d > sn)
                count++;
            num = num/10;
        }while(num != 0);

        System.out.println("The Digits greater than " + sn+" so the count is: "+count);
    }
}
