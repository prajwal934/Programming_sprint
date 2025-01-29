package com.praj.two;

import java.util.Arrays;

// write a java program to find the median of a list number
public class MedianOfList {
    public static void main(String[] args) {
        int[] lists = {3,1,4,1,5};
        int m = findMedian(lists);
        System.out.println("The Median of the list is: "+m);
    }
    public static int findMedian(int[] arr) {
        int n = arr.length;
//        first sort it
        Arrays.sort(arr);
        if(n %2 != 0)
            return arr[n/2];
        return (arr[(n-1)/2]+arr[n/2]) / 2;
    }
}
