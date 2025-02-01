package com.praj.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairOfAnagram {
    public static void main(String[] args) {
        String[] str = {"listen", "silent", "hello", "world"};

        List<String[]> anagramPairs = findAnagramPairs(str);
        for (String[] pair : anagramPairs) {
            System.out.println(Arrays.toString(pair));
        }
    }

    public static List<String[]> findAnagramPairs(String[] strings) {
        List<String[]> pairs = new ArrayList<>();

        // Compare each string with every other string
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                // Check if the two strings are anagrams
                if (isAnagrams(strings[i], strings[j])) {
                    // Add the pair to the list
                    pairs.add(new String[]{strings[i], strings[j]});
                }
            }
        }

        return pairs;
    }

    public static boolean isAnagrams(String st1 , String st2) {
        st1 = st1.replaceAll(" " , " ");
        st2 = st2.replaceAll(" " , " ");

        if(st1.length() != st2.length()) {
            return false;
        }

        st1 = st1.toLowerCase();
        st2 = st2.toLowerCase();

        char[] c1 = st1.toCharArray();
        char[] c2 = st2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        st1 = new String(c1);
        st2 = new String(c2);
        return st1.equals(st2);
    }
}
