package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println("The Two Sum elements are: "+ Arrays.toString(isTwosum(nums, target)));
    }
    public static int[] isTwosum(int[] nums , int t) {
        int n = nums.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j] == t) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
}
