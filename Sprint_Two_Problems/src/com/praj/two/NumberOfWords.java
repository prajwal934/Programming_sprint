package com.praj.two;

// write a java program to find the number of words
public class NumberOfWords {
    public static void main(String[] args) {
        String st = "Hello World";
        int count = countWords(st);
        System.out.println("The Number of words are: "+count);
    }
    public static int countWords(String str) {
        if (str.trim().isEmpty()) {
            return 0; // Handle empty or whitespace-only strings
        }
        return str.trim().split("\\s+").length;
    }
}
