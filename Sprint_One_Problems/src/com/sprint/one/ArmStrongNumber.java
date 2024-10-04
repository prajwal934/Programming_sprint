package com.sprint.one;

import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        // Loop through the range from 'a' to 'b'
        for (int i = a; i <= b; i++) {
            if (isArmstrong(i)) {
                System.out.println(
                		i);
            }
        }
    }

    // Method to check if a number is an Armstrong number
    private static boolean isArmstrong(int num) {
        int sum = 0, temp = num;
        do {
            int d = num % 10;          
            sum += d* d*d;  
            num = num / 10;               
        } while (num != 0);                
        return temp == sum;
    }
}