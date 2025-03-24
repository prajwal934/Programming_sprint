package com.dsa.arrayplms;

/*Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same.
        Then return the number of unique elements in nums.*/
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Duplicates are : "+ removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k =1;
        for(int i=1;i<n;i++) {
            if(nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return  k;
    }

}
