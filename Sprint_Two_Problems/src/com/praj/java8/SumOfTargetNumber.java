package com.praj.java8;

import java.util.Arrays;
import java.util.List;

// waj program to calculate the sum of elements with the target is 10
public class SumOfTargetNumber {
    public static void main(String[] args) {
       int[] num = {2,4,5,6,7,3,1,5,0};
       int target = 10;
       int n = num.length;

       for(int i=0;i< n;i++) {
           for(int j=i+1;j<n;j++) {
               if (num[i]+num[j] == target) {
                   System.out.println("Elements: "+num[i] + " , "+num[j]);
               }
           }
       }
    }
}
