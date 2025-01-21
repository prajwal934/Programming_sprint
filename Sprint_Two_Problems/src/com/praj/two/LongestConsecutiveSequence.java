package com.praj.two;

// write a java program, to find Longest Consecutive Sequence in an array

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] array = {100, 4, 200, 1, 3, 2};
        int lcs = longestSequence(array);
        System.out.println("The longest consecutive sequence is: "+lcs);
    }
     public static int longestSequence(int[] nums) {
         HashSet<Integer> set = new HashSet<>();

         for(int num : nums) {
             set.add(num);
         }

         int longest = 0;
         for(int num : nums) {
             if(!set.contains(num - 1)) {
                 int currentNum = num;
                 int count = 1;

                 while(set.contains(currentNum + 1)) {
                     currentNum++;
                     count++;
                 }
                 longest = Math.max(longest , count);
             }
         }
         return longest;
     }
}
