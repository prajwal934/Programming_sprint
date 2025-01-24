package com.praj.java8;

import java.util.Collections;
import java.util.stream.Collectors;

// write a java program to reverse the string by the help of java-8
public class ReverseString {
    public static void main(String[] args) {
        String s = "Prajwal Samal";
//        Reverse the string by Java-8
        String reversed = s.chars().mapToObj(c -> (char) c).collect(Collectors.collectingAndThen(
                Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list.stream().map(String::valueOf).collect(Collectors.joining());
                }));
        System.out.println("Original String: "+s);
        System.out.println("Reversed String: "+reversed);
    }
}
