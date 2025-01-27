package com.praj.two;

import java.util.Scanner;

// Finding the count of a specific word in a String
public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the word, You want to search!: ");
        String word = sc.nextLine();
        int count = countWordOccurence(str , word);
        System.out.println("The word '" + word + "' appears " + count + " times.");
    }
    public static int countWordOccurence(String str , String word) {
        String[] words = str.split(" ");
        int count =0;
        for(String w : words) {
            if(w.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
