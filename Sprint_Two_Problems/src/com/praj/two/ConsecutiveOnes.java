package com.praj.two;

public class ConsecutiveOnes {

    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1, 1};
        int l = findLongestSequence(array);
        System.out.println("The longest sequence of 1s is: " + l);
    }
    public static int findLongestSequence(int[] nums) {
        int longest = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                longest = Math.max(longest, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return longest;
    }
}