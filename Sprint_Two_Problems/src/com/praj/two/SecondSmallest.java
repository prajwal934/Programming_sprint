package com.praj.two;

import java.util.Scanner;

//  write a java program to find the second-smallest number in an array
public class SecondSmallest {
    public static void main(String[] args) {
        int[] array =  {12, 13, 1, 10, 34, 1};
        int s = secondSmallest(array);
        System.out.println("The Second Smallest Number in the array is: "+s);
    }
    public static int secondSmallest(int[] n) {
        int fSmall= Integer.MAX_VALUE;
        int sSmall= Integer.MAX_VALUE;

        for(int i=0;i<n.length;i++) {
            if(n[i] < fSmall) {
                sSmall= fSmall;
                fSmall = n[i];
            } else if (n[i] < sSmall && n[i] != fSmall) {
                sSmall = n[i];
            }
        }
        return sSmall;
    }
}
