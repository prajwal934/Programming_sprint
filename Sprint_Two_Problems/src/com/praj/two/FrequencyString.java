package com.praj.two;

// Write a Java program to print the frequency of each character in the given string
public class FrequencyString {
    public static void main(String[] args) {
        String input = "hello";
        int[] count = new int[26];  // Array to count frequencies of a-z characters
        int n = input.length();
        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);

            // Check if character is lowercase and within 'a' to 'z'
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
            // Check if character is uppercase and within 'A' to 'Z'
            else if (ch >= 'A' && ch <= 'Z') {
                count[ch - 'A']++;
            }
        }

        // Print the frequency of each character
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                // Check if the letter is lowercase
                char ch = (char) (i + 'a');
                System.out.println(ch + " -> " + count[i]);
            }
        }
    }
}
