package com.dsa.arrayplms;
/*
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
*/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println("The index is: "+ searchInsert(nums , target));
    }

    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start =0, end = n -1;
        int result = n; //store the index
//        By the help of Binary Search
        while( start <= end) {
//            find the mid
            int mid = (start + end)/2;
            if(nums[mid] >= target) {
                result = mid;
//                for smaller element at left
                end = mid - 1;
            } else {
                start = mid +1;
            }
        }
        return result;
    }

}
