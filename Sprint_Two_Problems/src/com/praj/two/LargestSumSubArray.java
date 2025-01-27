package com.praj.two;

// wajp to find the largest sum of any contiguous sub-array
public class LargestSumSubArray {
    public static void main(String[] args) {
        int[] arr =  {-2, 1, 3, 4, -1, 2, 1, -5, 4};

        int maxSum = arr[0];
        int currentSum = 0;
        int n = arr.length;
        for(int i=0; i<n;i++) {
            currentSum += arr[i];
            if(currentSum > maxSum) {
                maxSum= currentSum;
            }
            if(currentSum < 0) {
                currentSum= 0;
            }
        }
        System.out.println("The largest sum of the contiguous sub-array is: "+maxSum);
    }
}
