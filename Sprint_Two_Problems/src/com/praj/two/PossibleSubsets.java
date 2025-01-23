package com.praj.two;

import java.util.ArrayList;
import java.util.List;

// write a java program to generate all possible subsets of a given set of numbers
public class PossibleSubsets {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
//         create an empty list
        List<List<Integer>> subset= findSubsets(s);
        for(List<Integer> subsets : subset) {
            System.out.println(subsets);
        }
    }

    public static List<List<Integer>> findSubsets(List<Integer> set) {
        List<List<Integer>> resultLists = new ArrayList<>();
//         add emptyList to the resultLists
        resultLists.add(new ArrayList<>());

        for(int num : set) {
            int n = resultLists.size();
            for(int i=0;i<n;i++) {
                List<Integer> newSubset = new ArrayList<>(resultLists.get(i));
                newSubset.add(num);
                resultLists.add(newSubset);
            }
        }
        return resultLists;
    }
}
