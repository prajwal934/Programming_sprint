package com.praj.two;

// finding the difference between the sum of even and odd numbers in an array
public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        int[] arry = {1,2,3,4,5,6};
        int evenSum =0, oddSum = 0;
        for(int num : arry) {
            if(num % 2 == 0){
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        int diff = evenSum- oddSum;
        System.out.println("The difference between sum of even and odd numbers in an array element is: "+diff);
    }
}
