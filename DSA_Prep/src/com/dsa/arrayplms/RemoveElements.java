package com.dsa.arrayplms;

/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.*/

public class RemoveElements {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int  val = 2;
        System.out.println("The Remove Elements are: "+ removedElements(nums , val));
    }

    private static int removedElements(int[] nums, int val) {
        int n = nums.length;
        int y =0;
        for(int i=0;i<n;i++) {
            if(nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[y];
                nums[y] = temp;
                y++;
            }
        }
        return y;
    }
}
