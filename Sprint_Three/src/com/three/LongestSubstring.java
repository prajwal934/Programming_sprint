package com.three;

import java.util.HashSet;
import java.util.Scanner;
//ind a longest substring in a given string without repeating characters
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = ;
        System.out.println(isLongest("abcdefghgdgd"));
    }
    public static int isLongest(String str) {
        int maximumLength = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<=str.length();i++) {
            for(int j= i;j < str.length();j++) {
                if(isDuplicated(str , i ,j)) {
                    break;
                }
                maximumLength = Math.max(maximumLength, j - i +1);
            }
        }
        return maximumLength;
    }
    public static boolean isDuplicated(String str , int s , int e) {
        for(int i =s;i<e;i++) {
            if(str.charAt(i) == str.charAt(e)) {
                return true;
            }
        }
        return false;
    }
}
