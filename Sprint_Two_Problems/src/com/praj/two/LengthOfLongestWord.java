package com.praj.two;

import java.util.Scanner;

// write a java program to find the length of longest word in the string
public class LengthOfLongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        String[] words = st.split(" ");
        String longestWord = "";
        int maxLength =0;

        for(String word : words) {
            if(word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;

            }
        }
        System.out.println("The Longest word is : " + longestWord+ " with length: "+maxLength);
    }
}
