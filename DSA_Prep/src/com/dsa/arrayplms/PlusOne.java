package com.dsa.arrayplms;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits= {1,2,7};
        System.out.println("The Increment array is: " + Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1;i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] =0;
        }
        int[] newDigits = new int[n+1];
        newDigits[0] = 1;
        return  newDigits;
    }
}
